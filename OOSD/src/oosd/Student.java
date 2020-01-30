/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

/**
 *
 * @author Lucas
 */
public class Student {
    private String name;
    private int studentID;
    
    public Student() {
        name = "";
        studentID = 0;
        
    }
    
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getID() {
        return studentID;
    }
    
}
