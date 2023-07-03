package com.suvi.scalerschema.models;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel { //Relationship bw Student and ModuleExam class
    @ManyToOne
    private Student student;
    /* StudentModuleExam : Student - M : 1
     *              1 : 1
     *              M : 1
     * */
    @ManyToOne
    private ModuleExam moduleExam;
    /* StudentModuleExam : ModuleExam - M : 1
     *              1 : 1
     *              M : 1
     * */
    private int marks; //Attributes of relationship
}
