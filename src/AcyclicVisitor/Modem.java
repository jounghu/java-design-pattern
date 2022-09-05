package AcyclicVisitor;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public abstract class Modem {
    public abstract void accept(ModemVisitor modemVisitor);
}
