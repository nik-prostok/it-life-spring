package com.student.information.system.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ragcrix
 */

@Data
public class StudentDTO {
    private String id;
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;
}
