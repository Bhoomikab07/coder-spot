package com.xworkz.items.external;

import com.xworkz.items.internal.Item;

public class ItemRunner {
    public static void main(String[] args) {
        Item item = new Item();
        item.checkItem(9);
        item.checkDelete("delete");
        item.checkFound("yes");
        item.checkUpdate("yes");
        item.checkStock("full");
    }
}
