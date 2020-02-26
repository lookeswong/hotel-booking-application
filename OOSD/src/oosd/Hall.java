/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Hall {
    private int hallNo;
    private String hallAddress;
    private String phoneNo;
    private String hallName;
    ArrayList<Room> rooms = new ArrayList<>();
    
    public Hall() {
        hallNo = 0;
        hallAddress = "";
        phoneNo = "";
        hallName = "";
    }
    
    public Hall(ArrayList rooms, int hallNo, String hallAddress, String phoneNo, String hallName) {
        this.rooms = rooms;
        this.hallNo = hallNo;
        this.hallAddress = hallAddress;
        this.phoneNo = phoneNo;
        this.hallName = hallName;
    }
    
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    
    /* Author Joe & Lucas */
    public Room getRoom(int roomNo) {
        Room returnedRoom = null;
        for (int i=0; i<rooms.size(); i++) {
            if(rooms.get(i).getRoomNo() == roomNo) {
                returnedRoom = rooms.get(i);
            }
        }
        return returnedRoom;
    }
    
    public void addRoom(Room room) {
       rooms.add(room);
    }
    
    public int getHallNo() {
        return hallNo;
        
    }
    
    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }
    
    public String getHallAddress() {
        return hallAddress;
    }
    
    public void setHallAddress(String hallAddress) {
        this.hallAddress = hallAddress;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public String getHallName() {
        return this.hallName;
    }
    
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

}
