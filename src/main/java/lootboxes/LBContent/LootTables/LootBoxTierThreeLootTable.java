package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.LootItemList;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;

public class LootBoxTierThreeLootTable extends LootTable {
    public static final OneOfLootItems chestloottierthree = new OneOfLootItems(new LootItem("genielamp"),
            new LootItemInterface[]{new LootItem("cutlass"), new LootItem("infinitewaterbucket"), new LootItem("infiniterope"),
                    new LootItemList(new LootItemInterface[]{new LootItem("flintlock"), LootItem.between("simplebullet", 50, 100)}),
                    new LootItemList(new LootItemInterface[]{new LootItem("shotgun"), LootItem.between("simplebullet", 50, 100)}),
                    new LootItemList(new LootItemInterface[]{new LootItem("sniper"), LootItem.between("simplebullet", 50, 100)}),
                    new LootItem("lifeline")});

    public static final OneOfLootItems matstierthree = new OneOfLootItems(LootItem.offset("demonicbar", 8, 2), new LootItemInterface[]{LootItem.offset("ivybar", 6, 2), LootItem.offset("quartz", 8, 2)});
    public static final OneOfLootItems potions = new OneOfLootItems(LootItem.between("attackspeedpotion", 3, 5), new LootItemInterface[]{LootItem.between("healthregenpotion", 3, 5), LootItem.between("speedpotion", 3, 5), LootItem.between("battlepotion", 3, 5), LootItem.between("resistancepotion", 3, 5), LootItem.between("thornspotion", 3, 5), LootItem.between("minionpotion", 3, 5)});

    public static final LootBoxTierThreeLootTable instance = new LootBoxTierThreeLootTable();

    private LootBoxTierThreeLootTable() {
        super(new LootItemInterface[]{potions, matstierthree, chestloottierthree});
    }

}