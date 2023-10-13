package com.nacionaudiovisual.logic;


public class Student extends Person{

   
    private int id_student;
    private String due;
    
    
    public Student() {
        
    }

    public Student(int id_student, String due, int yearsOld, String name, String lastname, String dui, String cellphone, String directionHome, String rol) {
        super(yearsOld, name, lastname, dui, cellphone, directionHome, rol);
        this.id_student = id_student;
        this.due = due;
    }


    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

   
    
}
