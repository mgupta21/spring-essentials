package org.java.entities;

import org.springframework.stereotype.Component;

/**
 * Created by mgupta on 8/13/16.
 */
@Component
public class Royals implements Team {
    @Override
    public String getTeamName() {
        return "Kansas City Royals";
    }

    @Override
    public String getStadium() {
        return "Kauffman";
    }
}
