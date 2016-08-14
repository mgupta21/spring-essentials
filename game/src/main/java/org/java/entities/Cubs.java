package org.java.entities;

import org.springframework.stereotype.Component;

/**
 * Created by mgupta on 8/13/16.
 */
@Component
public class Cubs implements Team {
    public String getTeamName() {
        return "Cubs";
    }

    public String getStadium() {
        return "Wrigley Field";
    }
}
