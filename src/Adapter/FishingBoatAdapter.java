package Adapter;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        // 适配RowingBoat
        fishingBoat.sail();
    }
}
