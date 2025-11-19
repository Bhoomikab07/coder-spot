package com.xworkz.tranction.external;

import com.xworkz.tranction.internal.Transaction;

public class TransactionRunner {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.checkCancel("cancel");
        transaction.checkFailed("fail");
        transaction.checkFound("no");
        transaction.checkProcess("process");
        transaction.checkTime("evening");
    }
}
