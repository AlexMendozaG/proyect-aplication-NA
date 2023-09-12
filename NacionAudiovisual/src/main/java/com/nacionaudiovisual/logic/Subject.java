
package com.nacionaudiovisual.logic;


public class Subject {
    
    
    private int id;
    private String name;
    private String codesubject;
    private Teacher teacher;
    private int numstudents;

    public Subject() {
    }

    public Subject(int id, String name, String codesubject, Teacher teacher, int numstudents) {
        this.id = id;
        this.name = name;
        this.codesubject = codesubject;
        this.teacher = teacher;
        this.numstudents = numstudents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodesubject() {
        return codesubject;
    }

    public void setCodesubject(String codesubject) {
        this.codesubject = codesubject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumstudents() {
        return numstudents;
    }

    public void setNumstudents(int numstudents) {
        this.numstudents = numstudents;
    }
    
    
    
}
