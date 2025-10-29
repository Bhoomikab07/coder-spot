package com.xworkz.bike.external;

import com.xworkz.bike.impliments.*;
import com.xworkz.bike.internal.*;

public class BikeRunner {

    public static void main(String[] args) {
        Bike bike=new BikeImpl();
        BikeNumber bikeNumber=new BikeNumber(45000,true);
        bike.dispalyBikeNumber(bikeNumber);
        BikeSecond bikeSecond=new BikeSecond(356378,'A');
        bike.displaySecond(bikeSecond);
        BikeThird bikeThird=new BikeThird(70000,4674675);
        bike.displayThird(bikeThird);
        BikeFourth bikeFourth=new BikeFourth(50000,"Suzuki");
        bike.displayFourth(bikeFourth);
        BikeFifth bikeFifth=new BikeFifth('B',56467587);
        bike.displayFifth(bikeFifth);
        System.out.println("***********************************");


        BikeRating bikeRating=new BikeRatingImpl();
        BikeNumber bikeNumbers=new BikeNumber(45000,true);
        bikeRating.dispalyBikeNumber(bikeNumbers);
        BikeSecond bikeSeconds=new BikeSecond(356378,'A');
        bikeRating.displaySecond(bikeSeconds);
        BikeThird bikeThirds=new BikeThird(70000,4674675);
        bikeRating.displayThird(bikeThirds);
        BikeFourth bikeFourths=new BikeFourth(50000,"Suzuki");
        bikeRating.displayFourth(bikeFourths);
        BikeFifth bikeFifths=new BikeFifth('B',56467587);
        bikeRating.displayFifth(bikeFifths);
        System.out.println("***********************************");

        BikeValue bikeValue=new BikeValueImpl();
        BikeNumber number=new BikeNumber(45000,true);
        bikeValue.dispalyBikeNumber(number);
        BikeSecond second=new BikeSecond(356378,'A');
        bikeValue.displaySecond(second);
        BikeThird third=new BikeThird(70000,4674675);
        bikeValue.displayThird(third);
        BikeFourth fourth=new BikeFourth(50000,"Suzuki");
        bikeValue.displayFourth(fourth);
        BikeFifth fifth=new BikeFifth('B',56467587);
        bikeValue.displayFifth(fifth);
        System.out.println("***********************************");

        NumberOfBike numberOfBike=new NumberOfBikeImpl();
        BikeNumber bikeNum=new BikeNumber(45000,true);
        numberOfBike.dispalyBikeNumber(bikeNum);
        BikeSecond bikeSec=new BikeSecond(356378,'A');
        numberOfBike.displaySecond(bikeSec);
        BikeThird bikeThree=new BikeThird(70000,4674675);
        numberOfBike.displayThird(bikeThree);
        BikeFourth bikeFour=new BikeFourth(50000,"Suzuki");
        numberOfBike.displayFourth(bikeFour);
        BikeFifth bikeFive=new BikeFifth('B',56467587);
        numberOfBike.displayFifth(bikeFive);
        System.out.println("***********************************");

        TotalBike totalBike=new TotalBikeImpl();
        BikeNumber bikesNumber=new BikeNumber(45000,true);
        totalBike.dispalyBikeNumber(bikesNumber);
        BikeSecond bikesSecond=new BikeSecond(356378,'A');
        totalBike.displaySecond(bikesSecond);
        BikeThird bikesThird=new BikeThird(70000,4674675);
        totalBike.displayThird(bikesThird);
        BikeFourth bikesFourth=new BikeFourth(50000,"Suzuki");
        totalBike.displayFourth(bikesFourth);
        BikeFifth bikesFifth=new BikeFifth('B',56467587);
        totalBike.displayFifth(bikesFifth);
        System.out.println("***********************************");




    }
}
