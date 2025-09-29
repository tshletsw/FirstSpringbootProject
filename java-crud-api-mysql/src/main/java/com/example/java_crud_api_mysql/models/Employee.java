package com.example.java_crud_api_mysql.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String designation;
    private String name;
    private String doj;
    private long salary;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDoj(){
        return doj;
    }

    public void setDoj(String doj){
        this.doj = doj;
    }

    public Long getSalary(){
        return salary;
    }

    public void setSalary(Long salary){
        this.salary = salary;
    }

    public Employee(){}
    public Employee(Long id, String designation, String name, String doj, long salary){
        this.id = id;
        this.designation = designation;
        this.name = name;
        this.doj = doj;
        this.salary = salary;
    }

}
