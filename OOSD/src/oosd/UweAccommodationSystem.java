/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author j2-murnane
 */
public class UweAccommodationSystem {
    
    private static UweAccommodationSystem instance = null;
    private int userPermissions; // 0 = Warden, 1 = Hall Manager
    
    public void setPermissions(int permissionLevel){
        this.userPermissions = permissionLevel;
    }
    
    public int getPermissions(){
        return this.userPermissions;
    }
    
    private UweAccommodationSystem(){
        createTestData();
    }
    
    public void createTestData() {
        //Create Test Students
       // Create Test Students
        Student studentA = new Student("Jason", 0);
        Student studentB = new Student("Barney", 1);
        Student studentC = new Student("Elise", 2);
        Student studentD = new Student("Emily", 3);
        
        // Create Start Dates
        
        Date dateA = new Date(2020, 0, 1); // 0 = January? 11 = December? Odd implementation!
        Date dateB = new Date(2020, 1, 1);
        
        // Create New Leases
        
        Lease leaseA = new Lease(dateA, 0, studentA);
        Lease leaseB = new Lease(dateB, 1, studentB);
        Lease leaseC = new Lease(dateA, 2, studentC);
        Lease leaseD = new Lease(dateA, 3, studentD);
        
        // Create new Rooms
        Room roomA = new Room(0, leaseA, 0, 99.99, "");
        Room roomB = new Room(1, leaseB, 0 ,99.99, "");
        Room roomC = new Room(2, leaseC, 0, 99.99, "");
        Room roomD = new Room(3, leaseD, 0, 99.99, "");
        Room roomE = new Room(4, null, 0, 99.99, ""); // Empty Room
        
        // Create New Halls
        
        ArrayList<Room> hallARooms = new ArrayList<>();
        ArrayList<Room> hallBRooms = new ArrayList<>();
        
        hallARooms.add(roomA);
        hallARooms.add(roomB);
        hallARooms.add(roomC);
        
        hallBRooms.add(roomD);
        hallBRooms.add(roomE);
        
        Hall hallA = new Hall(hallARooms, 0, "", "", "Hall A");
        Hall hallB = new Hall(hallBRooms, 1, "", "", "Hall B");        
        
       
        System.out.println("Room No. 1 OBJECT:" + hallA.getRoom(1));
        System.out.println("Room No. 1 LEASE OBJECT: " + hallA.getRoom(1).getLease());
        System.out.println("Room No. 1 LEASE STUDENT OBJECT:" + hallA.getRoom(1).getLease().getStudent());
        System.out.println("Room No. 1 LEASE STUDENT NAME:" + hallA.getRoom(1).getLease().getStudent().getName());
        
    }
    public static UweAccommodationSystem getInstance() 
    { 
        if (instance == null) 
            instance = new UweAccommodationSystem(); 
  
        return instance; 
    } 
}
