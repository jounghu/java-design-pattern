package AbstractFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class KingFactoryMaker {
    public enum KingEnum {
        ELVEN, ORC
    }

    public static KingFactory getKingFactory(KingEnum kingEnum) {
        switch (kingEnum) {
            case ORC:
                return new OrcKingFactory();
            case ELVEN:
                return new ElvenKingFactory();
            default:
                throw new IllegalArgumentException("不支持的参数类型!");
        }
    }
}
