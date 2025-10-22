package lootboxes.LBContent.LootTables;
import necesse.inventory.lootTable.LootTable;

public class LootBoxPresets {


    public static LootTable lootBox5;
    public static LootTable lootBox4;
    public static LootTable lootBox3;
    public static LootTable lootBox2;
    public static LootTable lootBox1;
    public static LootTable foodBag;
    public static LootTable potionBottle;

    static{
        lootBox5 = LootBoxTierFiveLootTable.instance;
        lootBox4 = LootBoxTierFourLootTable.instance;
        lootBox3 = LootBoxTierThreeLootTable.instance;
        lootBox2 = LootBoxTierTwoLootTable.instance;
        lootBox1 = LootBoxTierOneLootTable.instance;
        foodBag = RandomFoodBagLootTable.instance;
        potionBottle = RandomPotionBottleLootTable.instance;
    }
}
