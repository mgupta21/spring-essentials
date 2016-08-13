package org.java.entities;

import javax.activation.DataSource;

/**
 * Created by mgupta on 8/13/16.
 */
public class BaseballGame implements Game {

    private Team homeTeam;
    private Team awayTeam;

    private DataSource dataSource;

    public BaseballGame(Team homeTeam, Team awayTeam) {
        setHomeTeam(homeTeam);
        setAwayTeam(awayTeam);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getTeamName() : getAwayTeam().getTeamName();
    }
}
