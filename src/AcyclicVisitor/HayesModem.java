package AcyclicVisitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class HayesModem extends Modem {

    private static final Logger logger = LoggerFactory.getLogger(HayesModem.class);

    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof HayesModemVisitor) {
            // 通过Visitor把对象给暴露出去
            ((HayesModemVisitor) modemVisitor).visit(this);
        } else {
            logger.info("Only HayesModemVisitor can visit HayesModem");
        }
    }
}
