package org.java.entities;

import org.springframework.stereotype.Component;

/**
 * Created by mgupta on 8/13/16.
 */
@Component
public class WhiteSox implements Team {
    public String getTeamName() {
        return "White Sox";
    }

    public String getStadium() {
        return "U.S. Cellular Field";
    }
}
