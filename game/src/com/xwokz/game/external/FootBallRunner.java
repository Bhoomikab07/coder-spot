package com.xwokz.game.external;

import com.xwokz.game.internal.FootBall;
import com.xwokz.game.internal.FootBallDetails;
import com.xwokz.game.internal.Players;

public class FootBallRunner {
    public static void main(String[] args) {
        Players players = new Players(11,54675757l);
        FootBall footBall = new FootBallDetails(11,"adhya",players);
        footBall.displayFootBall();
    }
}
