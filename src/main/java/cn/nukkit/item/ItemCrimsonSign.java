package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemCrimsonSign extends Item {

    public ItemCrimsonSign() {
        this(0, 1);
    }

    public ItemCrimsonSign(Integer meta) {
        this(meta, 1);
    }

    public ItemCrimsonSign(Integer meta, int count) {
        super(CRIMSON_SIGN, meta, count, "Crimson Sign");
    }
}