package ActiveObject;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            OrcCreature orCs = new OrcCreature("ORCs");
            orCs.eat();
            orCs.roam();
        }

        Runtime.getRuntime().exit(1);
    }
}
