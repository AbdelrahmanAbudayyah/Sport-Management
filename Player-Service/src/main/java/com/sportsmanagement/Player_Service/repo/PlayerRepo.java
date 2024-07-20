package com.sportsmanagement.Player_Service.repo;

import com.sportsmanagement.Player_Service.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends JpaRepository<Player,Integer> {

    //@Query("SELECT p FROM Player p WHERE p.clubID = :clubID")
    //List<Player> findByClubID(@Param("clubID") int clubID);

    List<Player> findByClubID(int clubID);

}
