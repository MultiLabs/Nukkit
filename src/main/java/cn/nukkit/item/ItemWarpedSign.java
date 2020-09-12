package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemWarpedSign extends Item {

    public ItemWarpedSign() {
        this(0, 1);
    }

    public ItemWarpedSign(Integer meta) {
        this(meta, 1);
    }

    public ItemWarpedSign(Integer meta, int count) {
        super(WARPED_SIGN, meta, count, "Warped Sign");
    }
}