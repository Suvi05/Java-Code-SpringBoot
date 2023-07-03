package com.suvi.scalerschema.models;

import javax.persistence.Entity;


//Springboot will go to every class and if it sees the @Entity, then it will try to create the table for same
@Entity
public class Exam extends BaseModel {
    private int duration;
    private String name;
}
