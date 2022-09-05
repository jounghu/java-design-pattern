package AcyclicVisitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class ZoomModem extends Modem {

    private static final Logger logger = LoggerFactory.getLogger(ZoomModem.class);

    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZoomModemVisitor) {
            ((ZoomModemVisitor) modemVisitor).visit(this);
        } else {
            logger.info("Only ZoomModemVisitor can visit zoom modem!");
        }
    }
}
