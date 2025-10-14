package com.xwokz.game.internal;

public abstract class FootBall {
    public int numberOfPlayers;
    public String teamName;
    public Players players;

    public FootBall(int numberOfPlayers,String teamName,Players players)
    {
        this.numberOfPlayers=numberOfPlayers;
        this.teamName=teamName;
        this.players=players;
    }
    public void displayFootBall(){
        System.out.println("number of players="+numberOfPlayers);
        System.out.println("team name="+teamName);
        System.out.println("total players="+players.totalPlayers);
        System.out.println("team number="+players.teamNumber);
    }
}
