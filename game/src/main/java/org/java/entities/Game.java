package org.java.entities;

/**
 * Created by mgupta on 8/13/16.
 */
public interface Game {

    void setHomeTeam(Team homeTeam);

    void setAwayTeam(Team awayTeam);

    Team getHomeTeam();

    Team getAwayTeam();

    String playGame();
}
