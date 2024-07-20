package com.sportsmanagement.Player_Service.controller;

import com.sportsmanagement.Player_Service.model.Player;
import com.sportsmanagement.Player_Service.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Player")
public class PlayerController {

    @Autowired
    PlayerService playerService;


    @GetMapping("/players")
    public ResponseEntity<List<Player>> getPlayers(){
        List<Player> list= playerService.getPlayers();
        if(list != null)
            return new ResponseEntity<>(list, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @GetMapping("/players/{clubId}")
    public ResponseEntity<List<Player>> getPlayers(@PathVariable int clubId){
        List<Player> list= playerService.getPlayersByClub(clubId);
        if(list != null)
            return new ResponseEntity<>(list, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("/player")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        Player newPlayer =playerService.addPlayer(player);
        return new ResponseEntity<>(newPlayer,HttpStatus.CREATED);
    }

    @PutMapping("/player")
    public ResponseEntity updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/player/{id}")
    public ResponseEntity removePlayer(@PathVariable int id){
        playerService.removePlayer(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
