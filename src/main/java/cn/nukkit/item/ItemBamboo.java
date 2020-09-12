package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemBamboo extends Item {

    public ItemBamboo() {
        this(0, 1);
    }

    public ItemBamboo(Integer meta) {
        this(meta, 1);
    }

    public ItemBamboo(Integer meta, int count) {
        super(BAMBOO, meta, count, "Bamboo");
    }
}