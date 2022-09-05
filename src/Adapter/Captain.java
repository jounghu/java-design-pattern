package Adapter;

/**
 * Created at 2021-09-27
 *
 * @author jeffrey.hu
 */
public class Captain {

    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        this.rowingBoat.row();
    }

}
