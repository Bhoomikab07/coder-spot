package com.xworkz.order.external;

import com.xworkz.order.internal.Order;

public class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order();
        order.checkOrder(99);
        order.checkItem(19);
        order.checkCancel("cancel");
        order.checkDelete("Delete");
        order.checkNotFound("yes");
    }
}
