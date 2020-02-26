/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

import java.util.Date;

/**
 *
 * @author Joe Murnane
 */
public class Lease {
    private String startDate;
    private Student student;
    private int leaseNo;
    
    public Lease() {
        student = null;
        leaseNo = 0;
        startDate = null;
    }
    
    public Lease(String startDate, int leaseNo, Student student) {
        this.startDate = startDate;
        this.leaseNo = leaseNo;
        this.student = student;
        
    }
    
    public Student getStudent(){
        return this.student;
    }
    
    public String getStartDate(){
        return this.startDate;
    }
    
    public int getLeaseNo(){
        return this.leaseNo;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
    
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    
}