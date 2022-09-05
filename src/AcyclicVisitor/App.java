package AcyclicVisitor;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class App {
    public static void main(String[] args) {
        ZoomModem zoomModem = new ZoomModem();
        HayesModem hayesModem = new HayesModem();

        ConfigureForDosVisitor configureForDosVisitor = new ConfigureForDosVisitor();
        zoomModem.accept(configureForDosVisitor);
        hayesModem.accept(configureForDosVisitor);


    }
}
