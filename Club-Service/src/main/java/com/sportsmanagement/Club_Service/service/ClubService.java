package com.sportsmanagement.Club_Service.service;

import com.sportsmanagement.Club_Service.feign.ClubInterface;
import com.sportsmanagement.Club_Service.model.Club;
import com.sportsmanagement.Club_Service.model.ClubStatistics;
import com.sportsmanagement.Club_Service.model.PlayerDTO;
import com.sportsmanagement.Club_Service.repo.ClubRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClubService {
    @Autowired
    ClubRepo clubRepo;

    @Autowired
     ClubInterface clubinterface;


    public ClubStatistics  getClubStatistics(int clubID){
        Club club=getClubById(clubID);
        List<PlayerDTO> playerDTOS =getPlayersByClubID(clubID);
        return new ClubStatistics(club, playerDTOS);
    }

    public List<PlayerDTO> getPlayersByClubID(int clubID) {
        return clubinterface.getPlayers(clubID).getBody();
    }

    public Club getClubById(int clubID) {
        return clubRepo.findById(clubID).orElse(null); // Fetch club details
    }

    public List<Club> getClubs() {
        return clubRepo.findAll();
    }

    public void createClub(Club club) {
        clubRepo.save(club);
    }

    public void removeClub(int id) {
        clubRepo.deleteById(id);
    }

    public void updateClub(Club club) {
        clubRepo.save(club);
    }
}
