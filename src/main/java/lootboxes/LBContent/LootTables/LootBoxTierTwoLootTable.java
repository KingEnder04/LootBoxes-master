package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.LootItemList;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;

public class LootBoxTierTwoLootTable extends LootTable {
    public static final OneOfLootItems chestloottiertwo = new OneOfLootItems(new LootItemInterface[]{new LootItem("voidspear"),
            new LootItem("voidboomerang"),
                    new LootItemList(new LootItemInterface[]{new LootItem("overgrownfishingrod"), LootItem.between("swamplarva", 4, 12)}),
                    new LootItem("lightninghammer"), new LootItem("mobilitycloak"), new LootItem("mesmertablet"),
                    new LootItem("swamptome"), new LootItem("slimecanister"), new LootItem("airvessel"),
                    new LootItem("miningcharm")});

    public static final OneOfLootItems matstiertwo = new OneOfLootItems(new LootItemInterface[]{LootItem.offset("goldbar", 6, 2), LootItem.offset("demonicbar", 6, 2), LootItem.offset("ivyore", 12, 2), LootItem.offset("quartz", 6, 2)});
    public static final OneOfLootItems potions = new OneOfLootItems(new LootItemInterface[]{LootItem.between("attackspeedpotion", 2, 4), LootItem.between("healthregenpotion", 2, 4), LootItem.between("speedpotion", 2, 4), LootItem.between("battlepotion", 2, 4), LootItem.between("resistancepotion", 2, 4), LootItem.between("thornspotion", 2, 4)});

    public static final LootBoxTierTwoLootTable instance = new LootBoxTierTwoLootTable();

    private LootBoxTierTwoLootTable() {
        super(new LootItemInterface[]{potions, matstiertwo, chestloottiertwo});
    }
}