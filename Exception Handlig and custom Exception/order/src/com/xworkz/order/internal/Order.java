package com.xworkz.order.internal;

import com.sun.jmx.snmp.SnmpNull;
import com.xworkz.order.event.*;

public class Order {
    public int checkOrder(int number){
        if (number<100){
            try {
                throw new InvalidOrderException();
            }catch (InvalidOrderException invalidOrderException){
                invalidOrderException.printStackTrace();
                System.out.println("invalid order");
            }
        }else {
            System.out.println("valid order");
        }
        return number;
    }
    public int checkItem(int item){
        if (item<20){
            try{
                throw new ItenNotFoundException();
            }catch (ItenNotFoundException itenNotFoundException){
                itenNotFoundException.printStackTrace();
                System.out.println("not found");
            }
        }else {
            System.out.println("found");
        }
        return item;
    }
    public String  checkCancel(String result){
        if (result=="cancel"){
            try{
                throw new OrderCancelledException();
            }catch (OrderCancelledException orderCancelledException){
                orderCancelledException.printStackTrace();
                System.out.println("cancelled");
            }
        }else {
            System.out.println("not cancelled");
        }
        return result;
    }
    public String checkDelete(String status){
        if (status=="Delete"){
            try {
                throw new OrderDeleteException();
            }catch (OrderDeleteException orderDeleteException){
                orderDeleteException.printStackTrace();
                System.out.println("oder delete");
            }
        }else {
            System.out.println("not delete");
        }
        return status;
    }
    public String checkNotFound(String notFound){
        if (notFound=="yes"){
            try {
                throw new OrderNotFoundException();
            }catch (OrderNotFoundException orderNotFoundException){
                orderNotFoundException.printStackTrace();
                System.out.println("not found");
            }
        }else {
            System.out.println("found");
        }
        return notFound;
    }
}
