package com.summer.winter.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity

public class User {
    public static String getFullName;
    public static String getEmail;
    public static String getPassword;


    @Id
    public long id;

    @Getter
    @NonNull
    private String fullName;

    @Getter
    @NonNull
    private String email;

    @Getter
    @Setter
    @NonNull
    private String password;

    // @OneToMany
    //private List<Course> courses;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
