package com.xworkz.actor.external;

import com.xworkz.actor.bridge.*;
import com.xworkz.actor.internal.*;

public class ActorRunner {
    public static void main(String[] args) {
        Actor actor = new ActorImpl();
        ActorInfo actorInfo = new ActorInfo(500000,"Appu");
        actor.Name(actorInfo);
        ActorNumber number = new ActorNumber(3563456,60000);
        actor.Number(number);
        ActorPopularity popularity=new ActorPopularity("YAsh",50000);
        actor.Popularity(popularity);
        ActorRating rating= new ActorRating('A',50000);
        actor.Rating(rating);
        ActorValue value=new ActorValue("YAsh",'A');
        actor.Value(value);
        System.out.println("--------------------------------------");

        NumberOfActor numberOfActor = new NumberOfActorImpl();
        ActorInfo info =new ActorInfo(500000,"Appu");
        numberOfActor.Name(info);
        ActorNumber actorNumber = new ActorNumber(3563456,60000);
        numberOfActor.Number(actorNumber);
        ActorPopularity actorPopularity=new ActorPopularity("YAsh",50000);
        numberOfActor.Popularity(actorPopularity);
        ActorRating actorRating= new ActorRating('A',50000);
        numberOfActor.Rating(actorRating);
        ActorValue actorValue=new ActorValue("YAsh",'A');
        numberOfActor.Value(actorValue);
        System.out.println("--------------------------------------");

        Popularity popularity1 = new PopularityImpl();
        ActorInfo actorsInfo = new ActorInfo(500000,"Appu");
        popularity1.Name(actorsInfo);
        ActorNumber numbers = new ActorNumber(3563456,60000);
        popularity1.Number(numbers);
        ActorPopularity popularities=new ActorPopularity("YAsh",50000);
        popularity1.Popularity(popularities);
        ActorRating ratings= new ActorRating('A',50000);
        popularity1.Rating(ratings);
        ActorValue values=new ActorValue("YAsh",'A');
        popularity1.Value(values);
        System.out.println("--------------------------------------");

        Rating rating1=new RatingImpl();
        ActorInfo actorInformation = new ActorInfo(500000,"Appu");
        rating1.Name(actorInformation);
        ActorNumber actorNumbers = new ActorNumber(3563456,60000);
        rating1.Number(actorNumbers);
        ActorPopularity actorPopularities=new ActorPopularity("YAsh",50000);
        rating1.Popularity(actorPopularities);
        ActorRating actorRatings= new ActorRating('A',50000);
        rating1.Rating(actorRatings);
        ActorValue actorValues=new ActorValue("YAsh",'A');
        rating1.Value(actorValues);
        System.out.println("--------------------------------------");

        Value value1=new ValueImpl();
        ActorInfo informations = new ActorInfo(500000,"Appu");
        value1.Name(informations);
        ActorNumber numberActors = new ActorNumber(3563456,60000);
        value1.Number(numberActors);
        ActorPopularity popularActor=new ActorPopularity("YAsh",50000);
        value1.Popularity(popularActor);
        ActorRating ratingActor= new ActorRating('A',50000);
        value1.Rating(ratingActor);
        ActorValue valueOfActor=new ActorValue("YAsh",'A');
        value1.Value(valueOfActor);
        System.out.println("--------------------------------------");




    }
}
