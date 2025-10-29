package com.xworkz.festival.impliments;

import com.xworkz.festival.internal.*;

public class NumberFestImpl implements NumberFest{

    @Override
    public FestivalInfo FestivalName(FestivalInfo festivalInfo) {
        System.out.println("this is subclass" +FestivalInfo.name +FestivalInfo.price);
        return festivalInfo;
    }

    @Override
    public FestivalName Name(FestivalName festivalName) {
        System.out.println("this is 2nd class" +FestivalName.number +FestivalName.name);
        return festivalName;
    }

    @Override
    public FestivalTotal Total(FestivalTotal festivalTotal) {
        System.out.println("this is 3rd class" +FestivalTotal.name +FestivalTotal.price);
        return festivalTotal;
    }

    @Override
    public FestivalNumber Number(FestivalNumber festivalNumber) {
        System.out.println("this is 4th class" +FestivalNumber.name +FestivalNumber.price);
        return festivalNumber;
    }

    @Override
    public FestivalValue Value(FestivalValue festivalValue) {
        System.out.println("this is 5th class" +FestivalValue.name +FestivalValue.price);
        return festivalValue;
    }
}


