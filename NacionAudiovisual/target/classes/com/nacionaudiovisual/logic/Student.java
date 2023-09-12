package com.nacionaudiovisual.logic;

public class Student extends Person{

    private String due;
    
    public Student() {
        
    }

    public Student(int id, int yearsOld, String rol, String name, String lastname, String dui, String cellphone, String directionHome) {
        super(id, yearsOld, rol, name, lastname, dui, cellphone, directionHome);
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

   
    
}
