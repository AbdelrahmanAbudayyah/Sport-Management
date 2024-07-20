package com.sportsmanagement.Club_Service.repo;

import com.sportsmanagement.Club_Service.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepo extends JpaRepository<Club,Integer> {
}
