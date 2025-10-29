package com.xworkz.crackers.external;

import com.xworkz.crackers.bridge.*;

import com.xworkz.crackers.internal.*;

public class CrackersRunner {
    public static void main(String[] args) {

        Crackers crackers = new CrackersImpl();
        CrackersInfo crackersInfo= new CrackersInfo(100,"flowerpot");
        crackers.CrackersName(crackersInfo);
        CrackersDetails crackersDetails = new CrackersDetails(true,"flowerpot");
        crackers.CrackersNa(crackersDetails);
        CrackersTotal crackersTotal=new CrackersTotal(200,25353656);
        crackers.CrackersTot(crackersTotal);
        CrackersNumber crackersNumber=new CrackersNumber('A',5357476);
        crackers.CrackersNum(crackersNumber);
        CrackersValue crackersValue=new CrackersValue("cracker",400);
        crackers.CrackersVal(crackersValue);

        Name name = new NameImpl();
        CrackersInfo info = new CrackersInfo(200,"atomBomb");
        name.CrackersName(info);
        CrackersDetails details= new CrackersDetails(false,"atomBomb");
        name.CrackersNa(details);
        CrackersValue value = new CrackersValue("crackers",564);
        name.CrackersVal(value);
        CrackersTotal total = new CrackersTotal(500,46598980);
        name.CrackersTot(total);
        CrackersNumber number = new CrackersNumber('B',64675878);
        name.CrackersNum(number);

        NumberOfCrackers numberOfCrackers = new NumberImpl();
        CrackersInfo crackerInfo= new CrackersInfo(100,"flowerpot");
        numberOfCrackers.CrackersName(crackerInfo);
        CrackersDetails crackerDetails = new CrackersDetails(true,"flowerpot");
        numberOfCrackers.CrackersNa(crackerDetails);
        CrackersTotal crackerTotal=new CrackersTotal(200,25353656);
        numberOfCrackers.CrackersTot(crackerTotal);
        CrackersNumber crackerNumber=new CrackersNumber('A',5357476);
        numberOfCrackers.CrackersNum(crackerNumber);
        CrackersValue crackerValue=new CrackersValue("cracker",400);
        numberOfCrackers.CrackersVal(crackerValue);

        Total total1 =new TotalImpl();
        CrackersInfo crackInfo= new CrackersInfo(100,"flowerpot");
        total1.CrackersName(crackInfo);
        CrackersDetails crackDetails = new CrackersDetails(true,"flowerpot");
        total1.CrackersNa(crackDetails);
        CrackersTotal crackTotal=new CrackersTotal(200,25353656);
        total1.CrackersTot(crackTotal);
        CrackersNumber crackNumber=new CrackersNumber('A',5357476);
        total1.CrackersNum(crackNumber);
        CrackersValue crackValue=new CrackersValue("cracker",400);
        total1.CrackersVal(crackValue);

        Value value1 = new ValueImpl();
        CrackersInfo cracInfo= new CrackersInfo(100,"flowerpot");
        value1.CrackersName(cracInfo);
        CrackersDetails cracDetails = new CrackersDetails(true,"flowerpot");
        value1.CrackersNa(cracDetails);
        CrackersTotal cracTotal=new CrackersTotal(200,25353656);
        value1.CrackersTot(cracTotal);
        CrackersNumber cracNumber=new CrackersNumber('A',5357476);
        value1.CrackersNum(cracNumber);
        CrackersValue cracValue=new CrackersValue("cracker",400);
        value1.CrackersVal(cracValue);





    }
}
