package com.sportsmanagement.Club_Service.model;

import lombok.Data;

import java.util.List;

@Data
public class ClubStatistics {

    private Club club;
    private List<PlayerDTO> players;

    public ClubStatistics(Club club, List<PlayerDTO> players) {
        this.club = club;
        this.players = players;
    }

}
