package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemLodestoneCompass extends Item {

    public ItemLodestoneCompass() {
        this(0, 1);
    }

    public ItemLodestoneCompass(Integer meta) {
        this(meta, 1);
    }

    public ItemLodestoneCompass(Integer meta, int count) {
        super(LODESTONECOMPASS, meta, count, "Lodestone Compass");
    }
}