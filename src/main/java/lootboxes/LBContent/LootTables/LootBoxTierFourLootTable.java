package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.LootItemList;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;

public class LootBoxTierFourLootTable extends LootTable {
    public static final OneOfLootItems chestloottierfour = new OneOfLootItems(new LootItemInterface[]{new LootItem("swampdwellerstaff"),
            new LootItem("agedchampionshield"),
                    new LootItemList(new LootItemInterface[]{new LootItem("depthscatcher"), LootItem.between("swamplarva", 20, 40)}),
                    new LootItemList(new LootItemInterface[]{new LootItem("antiquerifle"), LootItem.between("voidbullet", 50, 100)}),
                    LootItem.between("lifeelixir", 1, 2), new LootItem("firestone"),
                    new LootItem("spikedboots"), new LootItem("icepickaxe"), new LootItem("diggingclaw")});

    public static final OneOfLootItems matstierfour = new OneOfLootItems(new LootItemInterface[]{LootItem.offset("tungstenbar", 6, 2), LootItem.offset("ancientfossilore", 10, 2), LootItem.offset("myceliumore", 10, 2), LootItem.offset("glacialore", 10, 2), LootItem.offset("dynamitestick", 8, 2)});
    public static final OneOfLootItems potions = new OneOfLootItems(new LootItemInterface[]{LootItem.between("attackspeedpotion", 3, 6), LootItem.between("healthregenpotion", 3, 6), LootItem.between("speedpotion", 3, 6), LootItem.between("battlepotion", 3, 6), LootItem.between("resistancepotion", 3, 6), LootItem.between("thornspotion", 3, 6), LootItem.between("minionpotion", 3, 6)});

    public static final LootBoxTierFourLootTable instance = new LootBoxTierFourLootTable();

    private LootBoxTierFourLootTable() {
        super(new LootItemInterface[]{potions, matstierfour, chestloottierfour});
    }

}