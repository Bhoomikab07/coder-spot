package com.xworkz.items.internal;

import com.xworkz.items.event.*;

public class Item {
    public int checkItem(int item){
        if (item<10){
            try {
                throw new InvalidItemException();
            }catch (InvalidItemException invalidItemException){
                invalidItemException.printStackTrace();
            }
        }else {
            System.out.println("invalid");
        }
        return item;
    }
    public String checkDelete(String status){
        if (status=="delete"){
            try {
                throw new ItemDeleteException();
            }catch (ItemDeleteException itemDeleteException){
                itemDeleteException.printStackTrace();
                System.out.println("delete");
            }
        }else {
            System.out.println("not delete");
        }
        return status;
    }
    public String checkFound(String found){
        if (found=="yes"){
                try {
                    throw new ItemNotFoundException();
                }catch (ItemNotFoundException itemNotFoundException){
                    itemNotFoundException.printStackTrace();
                    System.out.println("not found");
                }
                }else {
            System.out.println("found");
        }
        return found;
    }
    public String checkUpdate(String update){
        if (update=="yes"){
            try {
                throw new ItemUpdateFailedException();

            }catch (ItemUpdateFailedException itemUpdateFailedException){
                itemUpdateFailedException.printStackTrace();
                System.out.println("updated");
            }
        }else {
            System.out.println("not updated");
        }
        return update;
    }
    public String checkStock(String stock){
        if (stock=="full"){
            try {
                throw new OutOfStockException();
            }catch (OutOfStockException outOfStockException){
                outOfStockException.printStackTrace();
                System.out.println("full");
            }
        }else {
            System.out.println("not full");
        }
        return stock;
    }



}