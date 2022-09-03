package AbstractFactory;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class App {
    public static void main(String[] args) {
        KingFactory kingFactory = KingFactoryMaker.getKingFactory(KingFactoryMaker.KingEnum.ORC);
        System.out.println(kingFactory.createKing().getDescription());
        System.out.println(kingFactory.createArm().getDescription());
    }
}
