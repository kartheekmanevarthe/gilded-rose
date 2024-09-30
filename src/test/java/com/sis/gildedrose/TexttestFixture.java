package com.sis.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {

        System.out.println("GD Application testing!");

        Item[] items = new Item[]{

                new Item("Aged Brie", 1, 1),
                new Item("Backstage passes", -1, 2),
                new Item("Backstage passes", 9, 2),
                new Item("Sulfuras", 2, 2),
                new Item("Normal Item", -1, 55),
                new Item("Normal Item", 2, 2),
                new Item("INVALID ITEM", 2, 2),
                new Item("Conjured", 2, 2),
                new Item("Conjured", -1, 5)};

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}