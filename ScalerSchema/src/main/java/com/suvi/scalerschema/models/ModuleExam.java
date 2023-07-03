package com.suvi.scalerschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne //Many for Module Exam (From above line) : One for Module (From below line)
    private Module module; //Cardinality between ModuleExam : Module => M : 1
    // 1 Module exam has only 1 exam -                  1   :   1
    // 1 Module can have many exams -                   M   :   1
    /*
     * Module with id 2 has exams with id (4,5,6)
     * => We will have ModuleExam objects like
     * (2,4)
     * (2,5)
     * (2,6)
     * */
    @ManyToOne
    private Exam exam; // Cardinality: M : 1
    // ME  :  E
    // 1   :  1
    // M   :  1
    private Date dateOfExam; // Attributes of relationship
}
// Table - module_exams
//    module_id | exam_id  // These will be columns in module_exams table as they are "1" of M : 1 Relationship
/*
 * If the type of an attribute of a class is a data type that is also being persisted
 * => Means we are talking about relationship between 2 classes
 * => Spring says if you are having an attribute of another type, then you must specify the cardinality of relationship.
 * => So that Spring Boot can create tables appropriately
 * */