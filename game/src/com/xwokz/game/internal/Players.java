package com.xwokz.game.internal;

public class Players {
    public int totalPlayers;
    public long teamNumber;

    public Players(int totalPlayers,long teamNumber){
        this.totalPlayers=totalPlayers;
        this.teamNumber=teamNumber;

    }
    public void displayPlayers(){
        System.out.println("total number of players="+totalPlayers);
        System.out.println("team number="+teamNumber);
    }
}
