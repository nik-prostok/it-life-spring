package com.student.information.system.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

enum GameDifficulty{
    SchoolBoy,
    Student,
    Adult
}

@Data
@Document(collection = "players")
public class Player {

    @Id
    private String id;

    @DBRef
    private Target target;

    private String namePlayer;
    private GameDifficulty difficulty;
    private int healthValue;
    private int timeValue;
    private int moneyValue;
    private int skillValue;
}
