package AcyclicVisitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class ConfigureForDosVisitor implements AllModemVisitor {

    private static final Logger logger = LoggerFactory.getLogger(ConfigureForDosVisitor.class);

    @Override
    public void visit(HayesModem modem) {
        // 这里可以拿到刚才visit的对象，做一些额外的操作，而不用去修改HayesModem的功能
        logger.info("modem is hayes");
    }

    @Override
    public void visit(ZoomModem modem) {
        logger.info("modem is zoom");
    }
}
