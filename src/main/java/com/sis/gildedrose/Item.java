package com.sis.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        if (this.name.equals("INVALID ITEM")) {
            return "NO SUCH ITEM";
        }
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}