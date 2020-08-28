package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemNetherSprouts extends Item {

    public ItemNetherSprouts() {
        this(0, 1);
    }

    public ItemNetherSprouts(Integer meta) {
        this(meta, 1);
    }

    public ItemNetherSprouts(Integer meta, int count) {
        super(NETHER_SPROUTS, meta, count, "Nether Sprouts");
    }
}