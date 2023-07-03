package com.suvi.scalerschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

//We will delete this class because it is not having any attributes and also not a part of any other relationship
//But then who will we store the relationship between Student and Module?
//Because there is a relationship between Student and Module
//=>We will store them in Student class as:privateList<Module>enrolledModules;
@Entity
public class StudentModule extends BaseModel {
    @ManyToOne
    private Student student;
    /*StudentModule:Student-M:1
     *1:1
     *M:1
     **/
    @ManyToOne
    private Module module;
    /*StudentModule:Module-M:1
     *1:1
     *M:1
     **/
}