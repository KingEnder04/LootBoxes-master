package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootTable;

public class LootBoxPresets {


    public static LootTable lootBox5;

    static{
        lootBox5 = LootBoxTierFiveLootTable.instance;
    }
}
