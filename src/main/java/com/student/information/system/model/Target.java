package com.student.information.system.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "targets")
public class Target {
    @Id
    private String id;
    private String nameTarget;
}
