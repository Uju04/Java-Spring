package com.summer.winter.model;
import jakarta.persistence.*;

@Entity

public class Course {
    @Id
    private Long id;

    private String courseTitle;
    private String courseCode;
}
