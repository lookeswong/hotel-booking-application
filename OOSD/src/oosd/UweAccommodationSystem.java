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
    public static ArrayList<Hall> halls = new ArrayList<Hall>();
    private int userPermissions; // 0 = Warden, 1 = Hall Manager, 2 = Superuser (ALL Permissions)

    public void checkLogin(String username, String password) throws InvalidLoginException {
        if ("warden".equals(username.toLowerCase()) && "warden".equals(password)) {
            setPermissions(0);
            System.out.println("Logging in as Warden");
        } else if ("manager".equals(username.toLowerCase()) && "manager".equals(password)) {
            setPermissions(1);
            System.out.println("Logging in as Manager");
        } else if ("superuser".equals(username.toLowerCase()) && "superuser".equals(password)) {
            setPermissions(2);
            System.out.println("Logging in as Superuser");
        } else {
            throw new InvalidLoginException("User login was not recognised!");
        }
    }

    public void setPermissions(int permissionLevel) {
        this.userPermissions = permissionLevel;
    }

    public int getPermissions() {
        return this.userPermissions;
    }

    private UweAccommodationSystem() {
        createTestData();
//        retrieveData();
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
        Room roomB = new Room(1, leaseB, 0, 99.99, "");
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
        halls.add(hallA);
        Hall hallB = new Hall(hallBRooms, 1, "", "", "Hall B");
        halls.add(hallB);

        System.out.println("Room No. 1 OBJECT:" + hallA.getRoom(1));
        System.out.println("Room No. 1 LEASE OBJECT: " + hallA.getRoom(1).getLease());
        System.out.println("Room No. 1 LEASE STUDENT OBJECT:" + hallA.getRoom(1).getLease().getStudent());
        System.out.println("Room No. 1 LEASE STUDENT NAME:" + hallA.getRoom(1).getLease().getStudent().getName());

        System.out.println("Rooms in Hall A:" + hallA.getRoom(0) + hallA.getRoom(1) + hallA.getRoom(2));

    }

//    public void retrieveData() {
//        int hallNo;
//        String hallName;
//        int roomNo;
//        int leaseNo;
//        int studentID;
//        String studentName;
//        String occupancyStatus;
//        int cleaningStatus;
//        Date leaseStart;
//        
//        for (int i = 0; i < halls.size(); i++) { // for each hall
//            hallNo = halls.get(i).getHallNo(); // set hall number
//            hallName = halls.get(i).getHallName(); // set hall name
//            for (int j = 0; j < halls.get(i).getRooms().size(); j++){ // for every room in this hall
//                roomNo = halls.get(i).getRooms().get(j).getRoomNo(); // set room number
//                leaseNo = halls.get(i).getRooms().get(j).getLease().getLeaseNo(); // set lease no
//                studentID = halls.get(i).getRooms().get(j).getLease().getStudent().getID(); // set student ID
//                studentName = halls.get(i).getRooms().get(j).getLease().getStudent().getName(); // set student name
//                if(halls.get(i).getRooms().get(j).getLease() == null){ // set occupancy status (automatically set to null if lease is expired)
//                    occupancyStatus = "Unoccupied";
//                } else {
//                    occupancyStatus = "Occupied";
//                }
//                cleaningStatus = halls.get(i).getRooms().get(j).getCleanStatus(); // set cleaning status
//                leaseStart = halls.get(i).getRooms().get(j).getLease().getStartDate(); // set lease start
//                System.out.println(hallNo + hallName + roomNo + leaseNo + studentID + studentName + cleaningStatus + leaseStart);
//            }
//        }
//    }

    public static UweAccommodationSystem getInstance() {
        if (instance == null) {
            instance = new UweAccommodationSystem();
        }
        return instance;
    }
}
