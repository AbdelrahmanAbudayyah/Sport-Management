package com.sportsmanagement.Player_Service.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("CLUB-SERVICE")
public interface PlayerInterface {
}
