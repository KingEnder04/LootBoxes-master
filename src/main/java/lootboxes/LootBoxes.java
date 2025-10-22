package lootboxes;

import java.util.Random;

import lootboxes.LBContent.*;
import necesse.engine.GameEventListener;
import necesse.engine.GameEvents;
import necesse.engine.events.loot.MobLootTableDropsEvent;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.placeableItem.ImportedAnimalSpawnItem;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

import static necesse.engine.registries.ItemRegistry.registerItem;

@ModEntry
public class LootBoxes {

    public void preInit() {

    }

// lol i have no idea what im doing

    public void init() {
        System.out.println("LETS GO GAMBLING!");

        // Register our tiles

        // Register our objects

        // make sure you make these actually do stuff for the update

        // Register our biomes

        // Register our tech

        // Register our items

        ItemRegistry.registerItem("tieronelootboxlb", new LootBoxTierOne(), 100, true);
        ItemRegistry.registerItem("tiertwolootboxlb", new LootBoxTierTwo(), 200, true);
        ItemRegistry.registerItem("tierthreelootboxlb", new LootBoxTierThree(), 300, true);
        ItemRegistry.registerItem("tierfourlootboxlb", new LootBoxTierFour(), 500, true);
        ItemRegistry.registerItem("tierfivelootboxlb", new LootBoxTierFive(), 1000, true);
        ItemRegistry.registerItem("randomfoodbaglb", new RandomFoodBag(), 3000, true);
        ItemRegistry.registerItem("randompotionbottlelb", new RandomPotionBottle(), 3000, true);

        // Items

        // Register our mob

        // Register our projectile

        // Register buffs

        // Armors

        // Trinkets

        // Gem Trinkets

        // Buffs/Debuffs

        // Register our levels

        //PacketRegistry.registerPacket(ExamplePacket.class);

        // Makes every enemy/mob in the game drop a Nova Fragment when it dies


        //if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("evilsprotector") > 0 & (event.mob.getWorldEntity().worldStats.mob_kills.getKills("zombie") > 150)) {
            //will scan the current world stats for Evil's Protector kills
          //  event.drops.add(new InventoryItem("tierthreelootboxlb"));

        //}

        GameEvents.addListener(MobLootTableDropsEvent.class, new GameEventListener<MobLootTableDropsEvent>() {

            public void onEvent(MobLootTableDropsEvent event) {

                Random rand = new Random();

                // Basically 100 is 100%, 90 is 90%, 80 is 80%, etc.
                int n = rand.nextInt(100);

                // Makes it 1 - 100 instead of 0 - 99
                n += 1;

                if (event.mob.isHostile)  {

                    // This gives mobs a 5% chance of dropping a ...
                    if(n <= 3) {

                        System.out.println("Normal Enemy Loot Drop!");

                        if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("piratecaptain") > 0) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tierfourlootboxlb"));

                        } else if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("voidwizard") > 0) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tierthreelootboxlb"));

                        } else if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("evilsprotector") > 0) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tiertwolootboxlb"));

                        } else {

                            event.drops.add(new InventoryItem("tieronelootboxlb"));

                        }

                    }

                    // After the Fallen Wizard is killed adds tier five loot boxes to the pool, Tier 4 will still be able to spawn
                    if(event.mob.getWorldEntity().worldStats.mob_kills.getKills("fallenwizard") > 0){

                        if (n <= 1) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tierfivelootboxlb"));

                        }

                    }

                }

                if (event.mob.isBoss()) {

                    if(n <= 50) {

                        System.out.println("Boss Enemy Loot Drop!");

                        if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("piratecaptain") > 0) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tierfourlootboxlb"));

                        } else if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("voidwizard") > 0) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tierthreelootboxlb"));

                        } else if (event.mob.getWorldEntity().worldStats.mob_kills.getKills("evilsprotector") > 0) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tiertwolootboxlb"));

                        } else {

                            event.drops.add(new InventoryItem("tieronelootboxlb"));

                        }

                    }

                    // After the Fallen Wizard is killed adds tier five loot boxes to the pool, Tier 4 will still be able to spawn
                    if(event.mob.getWorldEntity().worldStats.mob_kills.getKills("fallenwizard") > 0){

                        if (n <= 5) {
                            //will scan the current world stats for Evil's Protector kills
                            event.drops.add(new InventoryItem("tierfivelootboxlb"));

                        }

                    }

                }

            }
        });

    }

    public void initResources() {

    }

    public void postInit() {
        // Add recipes

        Recipes.registerModRecipe(new Recipe(
                "tieronelootboxlb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tiertwolootboxlb", 1),
                }
        ).showAfter("sandtile"));

        Recipes.registerModRecipe(new Recipe(
                "tiertwolootboxlb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tierthreelootboxlb", 1),
                }
        ).showAfter("sandtile"));

        Recipes.registerModRecipe(new Recipe(
                "tierthreelootboxlb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tierfourlootboxlb", 1),
                }
        ).showAfter("sandtile"));

        Recipes.registerModRecipe(new Recipe(
                "tierfourlootboxlb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tierfivelootboxlb", 1),
                }
        ).showAfter("sandtile"));

        Recipes.registerModRecipe(new Recipe(
                "tierfivelootboxlb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tierfourlootboxlb", 1),
                        new Ingredient("anytier1essence", 10)
                }
        ).showAfter("sandtile"));

        Recipes.registerModRecipe(new Recipe(
                "randomfoodbaglb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tierthreelootboxlb", 1),
                }
        ).showAfter("sandtile"));

        Recipes.registerModRecipe(new Recipe(
                "randompotionbottlelb",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("tierthreelootboxlb", 1),
                }
        ).showAfter("sandtile"));

        // Chest Loot

        // look at necesse.inventory.lootTable.presets

        // Mobs no way
        // Spawn tables use a ticket/weight system. In general, common mobs have about 100 tickets.


    }

}
