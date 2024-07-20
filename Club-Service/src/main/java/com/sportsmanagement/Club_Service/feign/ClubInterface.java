package com.sportsmanagement.Club_Service.feign;


import com.sportsmanagement.Club_Service.model.PlayerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("PLAYER-SERVICE")
public interface ClubInterface {

    @GetMapping("/Player/players/{clubId}")
    public ResponseEntity<List<PlayerDTO>> getPlayers(@PathVariable int clubId);

}
