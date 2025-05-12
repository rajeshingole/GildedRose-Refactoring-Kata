package com.gildedrose.updaters;

import com.gildedrose.Item;

import static com.gildedrose.GildedRoseConstants.*;

public class ItemUpdaterFactory {
    public static ItemUpdater getUpdater(Item item) {
        String name = item.name;

        switch (name) {
            case AGED_BRIE:
                return new AgedBrieUpdater(item);
            case SULFURAS:
                return new SulfurasUpdater(item);
            case BACKSTAGE_PASS:
                return new BackstagePassUpdater(item);
            case CONJURED:
                return new ConjuredItemUpdater(item);
            default:
                return new NormalItemUpdater(item);
        }
    }
}
