package com.sportsmanagement.Club_Service.model;

import lombok.Data;

@Data
public class PlayerDTO {

    private Integer id;
    private String playerName;
    private int clubID;
    private String position;
    private int salary;
    private String nationality;
}
