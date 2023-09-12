package com.nacionaudiovisual.logic;


public class Teacher extends Person{
    
    private String dueteacher;

    public Teacher() {
    }

    public Teacher(int id, int yearsOld, String rol, String name, String lastname, String dui, String cellphone, String directionHome) {
        super(id, yearsOld, rol, name, lastname, dui, cellphone, directionHome);
    }

    public String getDueteacher() {
        return dueteacher;
    }

    public void setDueteacher(String dueteacher) {
        this.dueteacher = dueteacher;
    }
    
    
}
