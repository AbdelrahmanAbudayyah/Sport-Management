package com.sportsmanagement.Club_Service.controller;


import com.sportsmanagement.Club_Service.model.Club;
import com.sportsmanagement.Club_Service.model.ClubStatistics;
import com.sportsmanagement.Club_Service.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Club")
public class ClubController {

    @Autowired
    ClubService clubService;


    @GetMapping("/club")
    public ResponseEntity<List<Club>> getClubs(){

        List<Club> list = clubService.getClubs();

        if (list!= null){
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

    @GetMapping("/clubStat/{clubID}")
    public ResponseEntity<ClubStatistics> getClubStat(@PathVariable int clubID){

        ClubStatistics stat = clubService.getClubStatistics(clubID);

        if (stat!= null){
            return new ResponseEntity<>(stat, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }


    @PostMapping("/club")
    public ResponseEntity createClub(@RequestBody Club club){
        clubService.createClub(club);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/club")
    public ResponseEntity updateClub(@RequestBody Club club){
        clubService.updateClub(club);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/club/{id}")
    public ResponseEntity removeClub(@PathVariable int id){
        clubService.removeClub(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
