package com.nacionaudiovisual.logic;

public class Person {
    
    private int yearsOld;
    private String name;
    private String lastname;
    private String dui;
    private String cellphone;
    private String directionHome;
    private String rol;

    public Person() {
    }

    public Person(int yearsOld, String name, String lastname, String dui, String cellphone, String directionHome, String rol) {
        this.yearsOld = yearsOld;
        this.name = name;
        this.lastname = lastname;
        this.dui = dui;
        this.cellphone = cellphone;
        this.directionHome = directionHome;
        this.rol = rol;
    }
    
    public int getYearsOld(){
        return yearsOld;
    }
    
    public void setYearsOld(int yearsOld){
        this.yearsOld= yearsOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getDirectionHome() {
        return directionHome;
    }

    public void setDirectionHome(String directionHome) {
        this.directionHome = directionHome;
    }  

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
