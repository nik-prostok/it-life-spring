package com.student.information.system.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

    public String getId() {
        return id;
    }
}
