package com.xworkz.actor.bridge;

import com.xworkz.actor.internal.*;

public class ValueImpl implements Value{
    @Override
    public ActorInfo Name(ActorInfo actorInfo) {
        System.out.println("this is sub class" +ActorInfo.salary +ActorInfo.name);
        return actorInfo;
    }

    @Override
    public ActorNumber Number(ActorNumber actorNumber) {
        System.out.println("this is 2nd class" +ActorNumber.number +ActorNumber.salary);
        return actorNumber;
    }

    @Override
    public ActorPopularity Popularity(ActorPopularity actorPopularity) {
        System.out.println("this is 3rd class" +ActorPopularity.name +ActorPopularity.salary);
        return actorPopularity;
    }

    @Override
    public ActorRating Rating(ActorRating actorRating) {
        System.out.println("this is 4th class" +ActorRating.grade +ActorRating.salary);
        return actorRating;
    }

    @Override
    public ActorValue Value(ActorValue actorValue) {
        System.out.println("this is 5th class" +ActorValue.name +ActorValue.grade);
        return actorValue;
    }
}


