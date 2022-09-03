package AbstractFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class OrcKingFactory implements KingFactory{
    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Arm createArm() {
        return new OrcArm();
    }
}
