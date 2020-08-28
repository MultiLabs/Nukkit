package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemWarpedDoor extends Item {

    public ItemWarpedDoor() {
        this(0, 1);
    }

    public ItemWarpedDoor(Integer meta) {
        this(meta, 1);
    }

    public ItemWarpedDoor(Integer meta, int count) {
        super(WARPED_DOOR, meta, count, "Warped Door");
    }
}