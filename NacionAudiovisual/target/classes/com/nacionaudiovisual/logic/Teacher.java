package com.nacionaudiovisual.logic;


public class Teacher extends Person{
    
    private int id_teacher;
    private String dueteacher;

    public Teacher() {
    }

    public Teacher(int id_teacher, String dueteacher, int yearsOld, String name, String lastname, String dui, String cellphone, String directionHome, String rol) {
        super(yearsOld, name, lastname, dui, cellphone, directionHome, rol);
        this.id_teacher = id_teacher;
        this.dueteacher = dueteacher;
    }

    public int getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getDueteacher() {
        return dueteacher;
    }

    public void setDueteacher(String dueteacher) {
        this.dueteacher = dueteacher;
    }
    
    
}
