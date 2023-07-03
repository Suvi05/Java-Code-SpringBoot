package com.suvi.scalerschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity //This annotation says that, a table will be created in database for this class.
public class Student extends BaseModel {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;
    @ManyToMany // We store it as a separate mapping table
    //When we will run this application, there will be no attribute of name - "enrolledModules"
    //but, a separate mapping table will be there! Spring Boot will automatically do that for us.
    private List<Module> enrolledModules;
    //This line has came because we have deleted "StudentModule" Class
}
/* Student : Module - M : M
 *       1 : M
 *       M : 1
 * */