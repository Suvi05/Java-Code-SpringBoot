package com.suvi.scalerschema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class ScalerSchemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalerSchemaApplication.class, args);
        System.out.println("Test-1");
    }
}
//How to code the classes

//Springboot follows MVC Pattern
//M: Model - Entity in my System - Persisted in the Database
// (Entity means it is the class which will also be persisting in database, it is not any class
// just those classes which will be persisting in DB)
