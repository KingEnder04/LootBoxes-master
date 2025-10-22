package lootboxes.LBContent.LootTables;

import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;

public class RandomPotionBottleLootTable extends LootTable {
    public static final OneOfLootItems potions1 = new OneOfLootItems(LootItem.between("manapotion", 3, 6),
            new LootItemInterface[]{LootItem.between("manaregenpotion", 3, 6),
                    LootItem.between("accuracypotion", 3, 6),
                    LootItem.between("battlepotion", 3, 6),
                    LootItem.between("buildingpotion", 3, 6),
                    LootItem.between("fireresistancepotion", 3, 6),
                    LootItem.between("fishingpotion", 3, 6),
                    LootItem.between("healthpotion", 3, 6),
                    LootItem.between("healthregenpotion", 3, 6),
                    LootItem.between("invisibilitypotion", 3, 6),
                    LootItem.between("knockbackpotion", 3, 6),
                    LootItem.between("miningpotion", 3, 6),
                    LootItem.between("minionpotion", 3, 6),
                    LootItem.between("passivepotion", 3, 6),
                    LootItem.between("rangerpotion", 3, 6),
                    LootItem.between("rapidpotion", 3, 6),
                    LootItem.between("resistancepotion", 3, 6),
                    LootItem.between("speedpotion", 3, 6),
                    LootItem.between("speluckerpotion", 3, 6),
                    LootItem.between("strengthpotion", 3, 6),
                    LootItem.between("thornpotion", 3, 6),
                    LootItem.between("treasurepotion", 3, 6),
                    LootItem.between("webpotion", 3, 6),
                    LootItem.between("wisdompotion", 3, 6),
            });

    public static final OneOfLootItems potions2 = new OneOfLootItems(LootItem.between("manapotion", 3, 6),
            new LootItemInterface[]{LootItem.between("manaregenpotion", 3, 6),
                    LootItem.between("accuracypotion", 3, 6),
                    LootItem.between("battlepotion", 3, 6),
                    LootItem.between("buildingpotion", 3, 6),
                    LootItem.between("fireresistancepotion", 3, 6),
                    LootItem.between("fishingpotion", 3, 6),
                    LootItem.between("healthpotion", 3, 6),
                    LootItem.between("healthregenpotion", 3, 6),
                    LootItem.between("invisibilitypotion", 3, 6),
                    LootItem.between("knockbackpotion", 3, 6),
                    LootItem.between("miningpotion", 3, 6),
                    LootItem.between("minionpotion", 3, 6),
                    LootItem.between("passivepotion", 3, 6),
                    LootItem.between("rangerpotion", 3, 6),
                    LootItem.between("rapidpotion", 3, 6),
                    LootItem.between("resistancepotion", 3, 6),
                    LootItem.between("speedpotion", 3, 6),
                    LootItem.between("speluckerpotion", 3, 6),
                    LootItem.between("strengthpotion", 3, 6),
                    LootItem.between("thornpotion", 3, 6),
                    LootItem.between("treasurepotion", 3, 6),
                    LootItem.between("webpotion", 3, 6),
                    LootItem.between("wisdompotion", 3, 6),
            });
    public static final OneOfLootItems potions3 = new OneOfLootItems(LootItem.between("manapotion", 3, 6),
            new LootItemInterface[]{LootItem.between("manaregenpotion", 3, 6),
                    LootItem.between("accuracypotion", 3, 6),
                    LootItem.between("battlepotion", 3, 6),
                    LootItem.between("buildingpotion", 3, 6),
                    LootItem.between("fireresistancepotion", 3, 6),
                    LootItem.between("fishingpotion", 3, 6),
                    LootItem.between("healthpotion", 3, 6),
                    LootItem.between("healthregenpotion", 3, 6),
                    LootItem.between("invisibilitypotion", 3, 6),
                    LootItem.between("knockbackpotion", 3, 6),
                    LootItem.between("miningpotion", 3, 6),
                    LootItem.between("minionpotion", 3, 6),
                    LootItem.between("passivepotion", 3, 6),
                    LootItem.between("rangerpotion", 3, 6),
                    LootItem.between("rapidpotion", 3, 6),
                    LootItem.between("resistancepotion", 3, 6),
                    LootItem.between("speedpotion", 3, 6),
                    LootItem.between("speluckerpotion", 3, 6),
                    LootItem.between("strengthpotion", 3, 6),
                    LootItem.between("thornpotion", 3, 6),
                    LootItem.between("treasurepotion", 3, 6),
                    LootItem.between("webpotion", 3, 6),
                    LootItem.between("wisdompotion", 3, 6),
            });
    public static final RandomPotionBottleLootTable instance = new RandomPotionBottleLootTable();

    private RandomPotionBottleLootTable() {
        super(new LootItemInterface[]{potions1, potions2, potions3});
    }
}