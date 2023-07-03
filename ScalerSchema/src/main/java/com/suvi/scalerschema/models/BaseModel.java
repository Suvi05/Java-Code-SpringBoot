package com.suvi.scalerschema.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;
//This is a special class - Base Model , and every other class in our model will extend this class
//This annotation says that attributes of this class should be present in all the child classes
@MappedSuperclass
public abstract class BaseModel {
    //This annotation makes it primary key for the table and as it is being accessed by all the child classes
    //So this will also get inherited by all of his child classes.
    @Id
    //This generates unique ID based on some strategy which Spring provides
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Stores the time when row was created for the first time
    @CreatedDate
    private Date createdAt;
    //Stores the time when row was last modified
    @LastModifiedDate
    private Date lastModifiedAt;
}
//This file contains attributes which are needed in every table