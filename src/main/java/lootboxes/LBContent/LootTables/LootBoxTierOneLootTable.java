package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.LootItemList;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;

public class LootBoxTierOneLootTable extends LootTable {
    public static final OneOfLootItems chestloottierone = new OneOfLootItems(new LootItem("fuzzydice"),
            new LootItemInterface[]{new LootItem("heavyhammer"),
                    new LootItemList(new LootItemInterface[]{new LootItem("handgun"), LootItem.between("simplebullet", 50, 100)}),
                    new LootItem("fins"), new LootItem("magicbranch"), new LootItem("bloodbolt"),
                    new LootItem("noblehorseshow"), new LootItem("frozenheart"), new LootItem("frozenwave"),
                    new LootItem("sparegemstones"), new LootItem("katana"),});

    public static final OneOfLootItems orestierone = new OneOfLootItems(LootItem.offset("copperore", 12, 2), new LootItemInterface[]{LootItem.offset("ironore", 12, 2), LootItem.offset("goldore", 12, 2), LootItem.offset("frostshard", 6, 2)});

    public static final LootBoxTierOneLootTable instance = new LootBoxTierOneLootTable();

    private LootBoxTierOneLootTable() {
        super(new LootItemInterface[]{orestierone, chestloottierone});
    }

    public static LootTable lootBox;
    static{
        lootBox = LootBoxTierOneLootTable.instance;
    }
}