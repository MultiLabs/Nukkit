package cn.nukkit.item;

/**
 * @author Kaooot
 * @version 1.0
 */
public class ItemChain extends Item {

    public ItemChain() {
        this(0, 1);
    }

    public ItemChain(Integer meta) {
        this(meta, 1);
    }

    public ItemChain(Integer meta, int count) {
        super(CHAIN, meta, count, "Chain");
    }
}