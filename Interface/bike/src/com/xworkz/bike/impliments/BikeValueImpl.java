package com.xworkz.bike.impliments;

import com.xworkz.bike.internal.*;

public class BikeValueImpl implements BikeValue{
    @Override
    public boolean dispalyBikeNumber(BikeNumber bikeNumber) {
        if(bikeNumber.price>50000){
            System.out.println("this is subclass" +BikeNumber.price +BikeNumber.isGood);
            return true;
        }
        else{
            System.out.println("this is subclass" +BikeNumber.price +BikeNumber.isGood);
        }
        return false;
    }

    @Override
    public long displaySecond(BikeSecond bikeSecond) {
        if(BikeSecond.number==56476476){
            System.out.println("this is 2nd class" +BikeSecond.number +BikeSecond.grade);
        }
        else{
            System.out.println("this is 2nd class" +BikeSecond.number +BikeSecond.grade);
        }
        return 56476478;
    }

    @Override
    public int displayThird(BikeThird bikeThird) {
        if (BikeThird.price<90000){
            System.out.println("this is 3rd sub class" +BikeThird.price +BikeThird.number);
        }
        else{
            System.out.println("this is 3rd sub class" +BikeThird.price +BikeThird.number);
        }
        return 90000;
    }

    @Override
    public String displayFourth(BikeFourth bikeFourth) {

        if (bikeFourth.name=="Suzuki"){
            System.out.println("this is 4th class" +BikeFourth.name +BikeFourth.price);
        }
        else {
            bikeFourth.name="Honda";
            System.out.println("this is 4th class" +BikeFourth.name +BikeFourth.price);
        }
        return bikeFourth.name;
    }

    @Override
    public char displayFifth(BikeFifth bikeFifth) {
        if (bikeFifth.grade=='A'){
            System.out.println("this is 5th class" +BikeFifth.grade +BikeFifth.number);
        }
        else {
            bikeFifth.grade='B';
            System.out.println("this is 5th class" +BikeFifth.grade +BikeFifth.number);
        }
        return bikeFifth.grade;
    }
}


