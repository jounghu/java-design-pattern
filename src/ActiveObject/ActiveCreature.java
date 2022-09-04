package ActiveObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public abstract class ActiveCreature {
    private static final Logger logger = LoggerFactory.getLogger(ActiveCreature.class);

    private String name;

    private BlockingQueue<Runnable> requestQueue;

    private Thread handleThread;

    public ActiveCreature(String name) {
        this.name = name;
        this.requestQueue = new LinkedBlockingDeque<>();
        this.handleThread = new Thread(() -> {
            while (true) {
                try {
                    this.requestQueue.take().run();// 阻塞
                } catch (Exception e) {
                    logger.error("take runnable error.");
                }
            }
        });
        this.handleThread.start();
    }

    public String getName() {
        return name;
    }

    public void eat() {

        try {
            this.requestQueue.put(new Runnable() {
                @Override
                public void run() {
                    logger.info("{} is eat", getName());
                }
            });
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void roam() {
        try {
            this.requestQueue.put(new Runnable() {
                @Override
                public void run() {
                    logger.info("{} is roam", getName());
                }
            });
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
