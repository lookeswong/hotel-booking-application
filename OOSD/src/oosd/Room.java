/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

/**
 *
 * @author Joe Murnane
 */
public class Room {
    private int roomNo;
    private Lease lease;
    private int cleanStatus; // Clean = 0, Dirty = 1, Offline = 2
    private double rent;
    private String description;
    
    public Room(int roomNo, Lease lease, int cleanStatus, double rent, String description){
        this.roomNo = roomNo;
        this.lease = lease;
        this.cleanStatus = cleanStatus;
        this.rent = rent;
        this.description = description;
    }
    
    public int getRoomNo(){
        return this.roomNo;
    }
    
    public Lease getLease(){
        return this.lease;
    }
    
    public int getCleanStatus(){
        return this.cleanStatus;
    }
    
    public double getRent(){
        return this.rent;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setCleanStatus(int cleanStatus){
        this.cleanStatus = cleanStatus;
    }
    
    public void removeLease(){
        this.lease = null;
    }
    
    public void addLease(Lease lease){
        this.lease = lease;
    }
    
    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }
    
    public void setRent(double rent){
        this.rent = rent;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
}
