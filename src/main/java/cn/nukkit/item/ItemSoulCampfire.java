package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemSoulCampfire extends Item {

    public ItemSoulCampfire() {
        this(0, 1);
    }

    public ItemSoulCampfire(Integer meta) {
        this(meta, 1);
    }

    public ItemSoulCampfire(Integer meta, int count) {
        super(SOUL_CAMPFIRE, meta, count, "Soul Campfire");
    }
}