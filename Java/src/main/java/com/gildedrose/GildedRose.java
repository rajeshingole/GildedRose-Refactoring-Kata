package com.gildedrose;

import com.gildedrose.updaters.ItemUpdater;
import com.gildedrose.updaters.ItemUpdaterFactory;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(item -> {
            ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
            updater.update();
        });
    }
}
