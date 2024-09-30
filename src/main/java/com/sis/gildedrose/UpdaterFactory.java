package com.sis.gildedrose;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class UpdaterFactory {

    private static Map<String, List<String>> itemTypes = new HashMap<>();

    static {
        itemTypes.put("backstage-passes", asList("Backstage passes"));
        itemTypes.put("legendary", asList("Sulfuras"));
        itemTypes.put("improves-with-age", asList("Aged Brie"));
        itemTypes.put("conjured", asList("Conjured"));
        itemTypes.put("sulfuras", asList("Sulfuras"));
        itemTypes.put("invalid-item", asList("INVALID ITEM"));
    }

    public static Updater updaterFor(Item currentItem) {
        if (improvesWithAge(currentItem)) {
            return new ImprovesWithAgeUpdater();
        } else if (isLegendary(currentItem)) {
            return new LegendaryUpdater();
        } else if (isBackstagePass(currentItem)) {
            return new BackstagePassesUpdater();
        } else if (isConjured(currentItem)) {
            return new ConjuredItemUpdater();
        } else if (invalidItem(currentItem)) {
            return new LegendaryUpdater();
        } else {
            return new CommonUpdater();
        }
    }

    private static boolean isConjured(Item item) {
        return itemTypes.get("conjured").contains(item.name);
    }

    private static boolean isBackstagePass(Item item) {
        return itemTypes.get("backstage-passes").contains(item.name);
    }

    private static boolean isLegendary(Item item) {
        return itemTypes.get("legendary").contains(item.name);
    }

    private static boolean improvesWithAge(Item item) {
        return itemTypes.get("improves-with-age").contains(item.name);
    }

    private static boolean invalidItem(Item item) {
        return itemTypes.get("invalid-item").contains(item.name);
    }

}