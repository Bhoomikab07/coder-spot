package com.xworkz.actor.bridge;

import com.xworkz.actor.internal.*;

public interface Actor {

    ActorInfo Name(ActorInfo actorInfo);
    ActorNumber Number(ActorNumber actorNumber);
    ActorPopularity Popularity(ActorPopularity actorPopularity);
    ActorRating Rating(ActorRating actorRating);
    ActorValue Value(ActorValue actorValue);
}
