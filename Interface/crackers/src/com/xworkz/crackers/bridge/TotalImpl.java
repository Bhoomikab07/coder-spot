package com.xworkz.crackers.bridge;

import com.xworkz.crackers.internal.*;

public class TotalImpl implements Total {
    @Override
    public CrackersInfo CrackersName(CrackersInfo crackersInfo) {
        System.out.println("sub class"+CrackersInfo.price +CrackersInfo.name);
        return crackersInfo;
    }

    @Override
    public CrackersDetails CrackersNa(CrackersDetails crackersDetails) {
        System.out.println("2nd sub class" +CrackersDetails.isAvailable +CrackersDetails.name);
        return crackersDetails;
    }

    @Override
    public CrackersNumber CrackersNum(CrackersNumber crackersNumber) {
        System.out.println("this 3rd sub class" +CrackersNumber.grade +CrackersNumber.number);
        return crackersNumber;
    }

    @Override
    public CrackersTotal CrackersTot(CrackersTotal crackersTotal) {
        System.out.println("4th sub class" +CrackersTotal.price +CrackersTotal.number);
        return crackersTotal;
    }

    @Override
    public CrackersValue CrackersVal(CrackersValue crackersValue) {
        System.out.println("5th sub class" +CrackersValue.name +CrackersValue.price);
        return crackersValue;
    }
}





