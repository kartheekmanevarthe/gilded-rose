package com.sis.gildedrose.controller;

import com.sis.gildedrose.GildedRose;
import com.sis.gildedrose.Item;
import com.sis.gildedrose.dto.ItemDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;


@Controller
public class GildedRoseController {

    /**
     * Accepts a json payload of items
     *
     * @param itemList
     */
    @PostMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateInventory(@RequestBody List<ItemDTO> itemList) {


        int size = itemList.size();
        Item[] items = new Item[size];

        if (itemList != null) {
            for (int i = 0; i < itemList.size(); i++) {
                items[i] = new Item(itemList.get(i).getName(),
                        itemList.get(i).getSellIn(),
                        itemList.get(i).getQuality());
            }
        }

        System.out.println("\n");
        System.out.println("name, sellIn, quality");

        for (Item item : items) {
            System.out.println(item);
        }

        //update inventory
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        System.out.println("\n");
        System.out.println("name, sellIn, quality");
        for (Item item : items) {
            System.out.println(item);
        }

    }

}