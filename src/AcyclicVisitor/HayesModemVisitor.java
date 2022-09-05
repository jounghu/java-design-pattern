package AcyclicVisitor;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface HayesModemVisitor extends ModemVisitor {
    void visit(HayesModem modem);
}
