package Adapter;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
