package AbstractFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class ElvenKingFactory implements KingFactory{
    @Override
    public King createKing() {
        return new ElvenKing();
    }

    @Override
    public Arm createArm() {
        return new ElvenArm();
    }
}
