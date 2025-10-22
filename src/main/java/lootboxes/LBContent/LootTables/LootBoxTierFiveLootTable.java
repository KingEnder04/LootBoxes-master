package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.LootItemList;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;

public class LootBoxTierFiveLootTable extends LootTable {
    public static final OneOfLootItems chestloottierfive = new OneOfLootItems(new LootItemInterface[]{new LootItem("dawnhelmet"),new LootItem("dawnchestplate"), new LootItem("dawnboots"),
                    new LootItem("duskhelmet"), new LootItem("duskchestplate"), new LootItem("duskboots"),
                    new LootItem("slimegreatsword"), new LootItem("slimeglaive"), new LootItem("slimestaff"),
                    new LootItemList(new LootItemInterface[]{new LootItem("slimegreatbow"), LootItem.between("spideritearrow", 30, 60)}),
                    new LootItem("nightrazor"), new LootItem("phantompopper"), new LootItem("phantomcaller"),
                    new LootItemList(new LootItemInterface[]{new LootItem("nightpiercer"), LootItem.between("spideritearrow", 30, 60)}),
                    new LootItem("causticexecutioner"), new LootItem("webweaver"), new LootItem("empresscommand"),
                    new LootItemList(new LootItemInterface[]{new LootItem("arachnidwebbow"), LootItem.between("spideritearrow", 30, 60)}),
                    new LootItemList(new LootItemInterface[]{LootItem.between("pearlescentdiamond", 5, 10), LootItem.between("omnicrystal", 10, 20)}),
                    LootItem.between("tierfivelootboxlb", 1, 2)});

    public static final OneOfLootItems matstierfive = new OneOfLootItems(new LootItemInterface[]{LootItem.between("slimeessence", 5, 10), LootItem.between("bloodessence", 5, 10), LootItem.between("primordialessence", 5, 10), LootItem.between("bioessence", 5, 10), LootItem.between("shadowessence", 5, 10), LootItem.between("cryoessence", 5, 10), LootItem.between("spideressence", 5, 10), LootItem.between("upgradeshard", 20, 50), LootItem.between("alchemyshard", 20, 50)});
    public static final OneOfLootItems potions = new OneOfLootItems(new LootItemInterface[]{LootItem.between("greaterattackspeedpotion", 4, 8),LootItem.between("greaterhealthpotion", 8, 16), LootItem.between("greatermanapotion", 8, 16), LootItem.between("greaterhealthregenpotion", 4, 8), LootItem.between("speedpotion", 4, 8), LootItem.between("battlepotion", 4, 8), LootItem.between("resistancepotion", 4, 8), LootItem.between("thornspotion", 4, 8), LootItem.between("minionpotion", 4, 8)});

    public static final LootBoxTierFiveLootTable instance = new LootBoxTierFiveLootTable();

    private LootBoxTierFiveLootTable() {
        super(new LootItemInterface[]{potions, matstierfive, chestloottierfive});
    }
}