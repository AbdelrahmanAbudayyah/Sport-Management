package com.sportsmanagement.Player_Service.service;

import com.sportsmanagement.Player_Service.model.Player;
import com.sportsmanagement.Player_Service.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepo playerRepo;

    public List<Player> getPlayers(){
       return playerRepo.findAll();

    }
    public Player addPlayer(Player player){
        playerRepo.save(player);
        return player;
    }

    public void removePlayer(int id) {

        playerRepo.deleteById(id);
    }

    public void updatePlayer(Player player) {

        playerRepo.save(player);
    }

    public List<Player> getPlayersByClub(int clubId) {
        return playerRepo.findByClubID(clubId);

    }
}
