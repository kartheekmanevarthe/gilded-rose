package com.sis.gildedrose;

import static com.sis.gildedrose.UpdaterFactory.updaterFor;
import static java.util.Arrays.asList;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        asList(items).forEach(item -> updaterFor(item).update(item));
    }
}