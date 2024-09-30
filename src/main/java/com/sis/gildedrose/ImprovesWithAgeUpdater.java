package com.sis.gildedrose;

public class ImprovesWithAgeUpdater implements Updater {

    public void update(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
    }

}
