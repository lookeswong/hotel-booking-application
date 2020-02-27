/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joe Murnane & Lucas
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
            JOptionPane.showMessageDialog(null, "You have entered an invalid username and password");
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
        retrieveData();
    }

    public void createTestData() {
        // Create Test Students
        Student studentA = new Student("Jason", 1901);
        Student studentB = new Student("Kun Wei", 1902);
        Student studentC = new Student("Elise", 1903);
        Student studentD = new Student("Emily", 1904);
        Student studentE = new Student("James", 1905);
        Student studentF = new Student("Lucas", 1906);
        Student studentG = new Student("Joe", 1907);
        Student studentH = new Student("Mike", 1908);

        // Create Start Dates
        String dateA = "January 1st 2020";
        String dateB = "February 1st 2020";

        // Create New Leases
        Lease leaseA = new Lease(dateA, 1001, studentA);
        Lease leaseB = new Lease(dateB, 1002, studentB);
        Lease leaseC = new Lease(dateA, 1003, studentC);
        Lease leaseD = new Lease(dateA, 1004, studentD);
        Lease leaseE = new Lease(dateA, 1005, studentE);
        Lease leaseF = new Lease(dateB, 1006, studentF);
        Lease leaseG = new Lease(dateB, 1007, studentG);
        Lease leaseH = new Lease(dateA, 1008, studentH);

        // Create new Rooms
        Room roomA = new Room(101, leaseA, 0, 79.99, "");
        Room roomB = new Room(102, leaseB, 0, 299.99, "");
        Room roomC = new Room(103, leaseC, 0, 199.99, "");
        Room roomD = new Room(104, leaseD, 0, 299.99, "");
        Room roomE = new Room(105, null, 2, 129.99, ""); // Empty Room
        Room roomF = new Room(106, leaseE, 0, 49.99, "");
        Room roomG = new Room(107, leaseF, 0, 399.99, "");
        Room roomH = new Room(108, leaseG, 0, 99.99, "");
        Room roomI = new Room(109, leaseH, 0, 79.99, "");
        Room roomJ = new Room(110, null, 0, 99.99, ""); // Empty Room
        Room roomK = new Room(111, null, 1, 99.99, ""); // Empty Room

        // Create New Halls
        ArrayList<Room> hallARooms = new ArrayList<>();
        ArrayList<Room> hallBRooms = new ArrayList<>();
        ArrayList<Room> hallCRooms = new ArrayList<>();

        hallARooms.add(roomA);
        hallARooms.add(roomB);
        hallARooms.add(roomC);

        hallBRooms.add(roomD);
        hallBRooms.add(roomE);
        hallBRooms.add(roomF);
        hallBRooms.add(roomK);

        hallCRooms.add(roomG);
        hallCRooms.add(roomH);
        hallCRooms.add(roomI);
        hallCRooms.add(roomJ);

        Hall hallA = new Hall(hallARooms, 1, "1 UWE Drive", "01202999999", "Hall A");
        halls.add(hallA);
        Hall hallB = new Hall(hallBRooms, 2, "2 UWE Road", "01202888888", "Hall B");
        halls.add(hallB);
        Hall hallC = new Hall(hallCRooms, 3, "3 UWE Court", "01202345321", "Hall C");
        halls.add(hallC);

    }

    public DefaultTableModel retrieveData() {
        String hallNo = "";
        String hallName = "";
        String roomNo = "";
        String leaseNo = "";
        String studentID = "";
        String studentName = "";
        String occupancyStatus = "";
        String cleaningStatus = "";
        String leaseStart = "";
        String roomRent = "";
        String hallAddress = "";
        String hallPhoneNo = "";
        Object columnNames[] = {"Hall No", "Hall Name", "Room No", "Lease No", "Student ID", "Student Name", "Cleaning Status", "Occupancy Status", "Lease Start", "Room Rent", "Hall Address", "Hall Phone No"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) { // Ensure generated table model is not editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (int i = 0; i < halls.size(); i++) { // for each hall
            hallNo = String.valueOf(halls.get(i).getHallNo()); // set hall number
            hallName = halls.get(i).getHallName(); // set hall name
            hallPhoneNo = halls.get(i).getPhoneNo();
            hallAddress = halls.get(i).getHallAddress();
            for (int j = 0; j < halls.get(i).getRooms().size(); j++) { // for every room in this hall
                roomNo = String.valueOf(halls.get(i).getRooms().get(j).getRoomNo()); // set room number
                roomRent = String.valueOf(halls.get(i).getRooms().get(j).getRent());
                if (halls.get(i).getRooms().get(j).getLease() != null) {
                    leaseNo = String.valueOf(halls.get(i).getRooms().get(j).getLease().getLeaseNo()); // set lease no
                    studentID = String.valueOf(halls.get(i).getRooms().get(j).getLease().getStudent().getID()); // set student ID
                    studentName = halls.get(i).getRooms().get(j).getLease().getStudent().getName(); // set student name
                    leaseStart = String.valueOf(halls.get(i).getRooms().get(j).getLease().getStartDate()); // set lease start
                    occupancyStatus = "Occupied";// set occupancy status
                } else {
                    occupancyStatus = "Unoccupied";
                    leaseNo = "";
                    studentID = "";
                    studentName = "";
                    leaseStart = "";
                }
                if ("0".equals(String.valueOf(halls.get(i).getRooms().get(j).getCleanStatus()))) { // if room is clean
                    cleaningStatus = "Clean";
                } else if ("1".equals(String.valueOf(halls.get(i).getRooms().get(j).getCleanStatus()))) { // if room is dirty
                    cleaningStatus = "Dirty";
                } else { // room is offline
                    cleaningStatus = "Offline";
                }
                Object[] rowData = {hallNo, hallName, roomNo, leaseNo, studentID, studentName, cleaningStatus, occupancyStatus, leaseStart, roomRent, hallAddress, hallPhoneNo};
                tableModel.addRow(rowData);

            }
        }
        return tableModel;
    }

    public int countRooms() {
        int roomCount = 0;
        for(int i = 0; i < halls.size(); i++) { // for each hall
            for(int j = 0; j < halls.get(i).getRooms().size(); j++) { // for every room in this hall
                roomCount++;
            }
        }
        return roomCount;
    }

    

    public static UweAccommodationSystem getInstance() {
        if (instance == null) {
            instance = new UweAccommodationSystem();
        }
        return instance;
    }
}
