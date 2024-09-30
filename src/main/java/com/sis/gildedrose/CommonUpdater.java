package com.sis.gildedrose;

public class CommonUpdater implements Updater {

    public void update(Item item) {
        if (canLowerQuality(item)) {
            item.quality--;
            if (pastExpirationDate(item)) {
                item.quality--;
            }
            if (item.quality > 50) {
                item.quality = 50;
            }
        }
        item.sellIn--;
    }

    private boolean pastExpirationDate(Item item) {
        return item.sellIn <= 0;
    }

    private boolean canLowerQuality(Item item) {
        return item.quality > 0;
    }

}
