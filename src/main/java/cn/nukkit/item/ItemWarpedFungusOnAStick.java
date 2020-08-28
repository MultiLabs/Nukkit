package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemWarpedFungusOnAStick extends Item {

    public ItemWarpedFungusOnAStick() {
        this(0, 1);
    }

    public ItemWarpedFungusOnAStick(Integer meta) {
        this(meta, 1);
    }

    public ItemWarpedFungusOnAStick(Integer meta, int count) {
        super(WARPED_FUNGUS_ON_A_STICK, meta, count, "Warped Fungus on a Stick");
    }
}