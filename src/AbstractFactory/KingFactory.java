package AbstractFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public interface KingFactory {
    King createKing();

    Arm createArm();
}
