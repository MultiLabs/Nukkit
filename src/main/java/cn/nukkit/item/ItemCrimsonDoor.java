package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemCrimsonDoor extends Item {

    public ItemCrimsonDoor() {
        this(0, 1);
    }

    public ItemCrimsonDoor(Integer meta) {
        this(meta, 1);
    }

    public ItemCrimsonDoor(Integer meta, int count) {
        super(CRIMSON_DOOR, meta, count, "Crimson Door");
    }
}