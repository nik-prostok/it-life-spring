package com.student.information.system.dto;

enum GameDifficulty {
    SchoolBoy,
    Student,
    Adult
}

public class PlayerDTO {
    private String id;
    private TargetDTO target;
    private String namePlayer;
    private GameDifficulty difficulty;
    private int healthValue;
    private int timeValue;
    private int moneyValue;
    private int skillValue;
}
