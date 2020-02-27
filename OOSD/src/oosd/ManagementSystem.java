/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

import java.awt.GraphicsConfiguration;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lucas & Joe
 */
public class ManagementSystem extends javax.swing.JFrame {

    /**
     * Creates new form ManagementSystem
     */
    private UweAccommodationSystem accommodationSystem = UweAccommodationSystem.getInstance();
    private ListSelectionListener listener = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (tblDisplayData.getSelectedRow() > -1) {
                // print first column value from selected row
                txtHallNo.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 0).toString());
                txtHallName.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 1).toString());
                txtRoomNo.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 2).toString());
                txtLeaseNo.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 3).toString());
                txtStudentID.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 4).toString());
                txtStudentName.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 5).toString());
                ddCleaningStatus.setSelectedItem(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 6).toString());
                txtLeaseStart.setText(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 8).toString());

            }

            if (tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 3).toString() != "") {
                btnModifyCreateLease.setText("Modify Lease");
            } else {
                btnModifyCreateLease.setText("Create Lease");
            }
        }
    };

    public ManagementSystem() {
        initComponents();
        setVisibility();
        refreshData();

    }

    public void refreshData() {
        tblDisplayData.getSelectionModel().removeListSelectionListener(listener); // remove any listeners before refresh due to weird out of bounds bug
        tblDisplayData.setModel(accommodationSystem.retrieveData()); // retrieve data from accommodation singleton
        String[] cleaningStatuses = {"Dirty", "Clean", "Offline"}; // set cleaning statuses labels for dropdown
        ddCleaningStatus.setModel(new DefaultComboBoxModel(cleaningStatuses)); // set dropdown cleaning status labels
        tblDisplayData.getSelectionModel().addListSelectionListener(listener); // re - add change listener
        lblRoomCount.setText(Integer.toString(accommodationSystem.countRooms()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayData = new javax.swing.JTable();
        txtLeaseNo = new javax.swing.JTextField();
        txtHallName = new javax.swing.JTextField();
        txtRoomNo = new javax.swing.JTextField();
        txtHallNo = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtLeaseStart = new javax.swing.JTextField();
        ddCleaningStatus = new javax.swing.JComboBox<>();
        lblLeaseNo = new javax.swing.JLabel();
        lblHallName = new javax.swing.JLabel();
        lblHallNo = new javax.swing.JLabel();
        lblRoomNo = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblLeaseStart = new javax.swing.JLabel();
        lblCleaningStatus = new javax.swing.JLabel();
        btnModifyCreateLease = new javax.swing.JButton();
        btnDeleteLease = new javax.swing.JButton();
        btnSetCleaningStatus = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblRoomCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UWE Bristol Accommodation System");

        tblDisplayData.setAutoCreateRowSorter(true);
        tblDisplayData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDisplayData);

        ddCleaningStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ddCleaningStatus.setToolTipText("");
        ddCleaningStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCleaningStatusActionPerformed(evt);
            }
        });

        lblLeaseNo.setText("Lease Number:");

        lblHallName.setText("Hall Name:");

        lblHallNo.setText("Hall Number:");

        lblRoomNo.setText("Room Number");

        lblStudentID.setText("Student ID:");

        lblStudentName.setText("Student Name:");

        lblLeaseStart.setText("Lease Start Date:");
        lblLeaseStart.setToolTipText("");

        lblCleaningStatus.setText("Cleaning Status:");

        btnModifyCreateLease.setText("Modify Lease");
        btnModifyCreateLease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCreateLeaseActionPerformed(evt);
            }
        });

        btnDeleteLease.setText("Delete Lease");
        btnDeleteLease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLeaseActionPerformed(evt);
            }
        });

        btnSetCleaningStatus.setText("Set Cleaning Status");
        btnSetCleaningStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetCleaningStatusActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtHallNo)
                    .addComponent(txtHallName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLeaseNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHallName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHallNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoomNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLeaseNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(txtRoomNo))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentID)
                    .addComponent(lblLeaseStart)
                    .addComponent(lblCleaningStatus)
                    .addComponent(lblStudentName)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentName)
                    .addComponent(ddCleaningStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLeaseStart, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModifyCreateLease, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteLease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSetCleaningStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStudentID)
                            .addComponent(lblLeaseNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLeaseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHallName)
                                    .addComponent(lblStudentName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHallName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnModifyCreateLease, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeleteLease, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHallNo)
                                    .addComponent(lblCleaningStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHallNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ddCleaningStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRoomNo)
                                    .addComponent(lblLeaseStart))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLeaseStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSetCleaningStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel2.setText("Room Count:");

        lblRoomCount.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRoomCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblRoomCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ddCleaningStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCleaningStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCleaningStatusActionPerformed

    private void btnModifyCreateLeaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCreateLeaseActionPerformed
        // TODO add your handling code here:

        if (tblDisplayData.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "You have not select a room");
        } else {
            if (tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 3).toString() == "") { // If creating new lease
                boolean leaseExists = false;
                boolean studentExists = false;
                String leaseID = txtLeaseNo.getText();
                String studentNo = txtStudentID.getText();
                for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                    for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for every room in this hall
                        if (accommodationSystem.halls.get(i).getRooms().get(j).getLease() != null) {
                            String leaseNo = String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getLease().getLeaseNo()); // get lease no
                            String studentID = String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getLease().getStudent().getID()); // get student ID
                            if (leaseNo.equals(leaseID)) { // ensure lease does not exist with entered lease number
                                leaseExists = true;
                            }
                            if (studentID.equals(studentNo)) { // ensure student does not exist with entered student number
                                studentExists = true;
                            }
                        }
                    }
                }
                if (leaseExists) { // if lease number exists
                    JOptionPane.showMessageDialog(null, "You have entered a lease number that already exists - please enter a new lease number.");
                } else if ("".equals(txtLeaseNo.getText())) { // If user has not entered a lease number
                    JOptionPane.showMessageDialog(null, "You have not entered a lease number - please enter a lease number.");
                } else if (studentExists) { // If user has entered a student id that already exists
                    JOptionPane.showMessageDialog(null, "You have entered a student number that already exists");
                } else if ("".equals(txtStudentID.getText())) {
                    JOptionPane.showMessageDialog(null, "You have not entered a student - please enter a student ID.");
                } else if (!"Clean".equals(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 6).toString()) && !"Clean".equals(ddCleaningStatus.getSelectedItem().toString()) && "Offline".equals(ddCleaningStatus.getSelectedItem().toString())) {
                    JOptionPane.showMessageDialog(null, "This room is not clean and cannot be given a lease.");
                } else { // if all is okay
                    try {
                        Student studentToAdd = new Student(txtStudentName.getText(), Integer.parseInt(txtStudentID.getText()));
                        String startDateToAdd = txtLeaseStart.getText();
                        Lease leaseToAdd = new Lease(startDateToAdd, Integer.parseInt(txtLeaseNo.getText()), studentToAdd);
                        for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                            for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for each room
                                if (String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getRoomNo()).equals(txtRoomNo.getText())) { // if this is the room that was selected
                                    accommodationSystem.halls.get(i).getRooms().get(j).addLease(leaseToAdd);
                                    if ("Clean".equals(ddCleaningStatus.getSelectedItem().toString())) { // if room is set to clean by superuser or unchanged
                                        accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(0);
                                    } else if ("Dirty".equals(ddCleaningStatus.getSelectedItem().toString())) { // if room is set to dirty by superuser
                                        accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(1);
                                    } else { // if room is set to offline by superuser
                                        accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(2);
                                    }

                                }
                            }
                        }
                        refreshData();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "The system threw an error - did you enter a valid integer for student number and lease no? Error message: " + e.getMessage());
                    }
                }
            } else { // if modifying lease
                boolean leaseExists = false;
                boolean studentExists = false;
                String modifiedLeaseNumber = txtLeaseNo.getText();
                String originalLeaseNumber = tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 3).toString();
                String modifiedStudentID = txtStudentID.getText();
                String originalStudentID = tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 4).toString();
                for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                    for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for every room in this hall
                        if (accommodationSystem.halls.get(i).getRooms().get(j).getLease() != null) {
                            String leaseNo = String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getLease().getLeaseNo()); // get lease no
                            String studentID = String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getLease().getStudent().getID()); // get student ID
                            if (leaseNo.equals(modifiedLeaseNumber) && !modifiedLeaseNumber.equals(originalLeaseNumber)) { // ensure lease does not exist with entered lease number IF the lease number has been changed
                                leaseExists = true;
                            }
                            if (studentID.equals(modifiedStudentID) && !modifiedStudentID.equals(originalStudentID)) { // ensure student does not exist with entered student number IF the student ID has been changed
                                studentExists = true;
                            }
                        }
                    }
                }
                if (leaseExists) { // if lease number exists
                    JOptionPane.showMessageDialog(null, "You have entered a lease number that already exists - please enter a new lease number.");
                } else if ("".equals(txtLeaseNo.getText())) { // If user has not entered a lease number
                    JOptionPane.showMessageDialog(null, "You have not entered a lease number - please enter a lease number.");
                } else if (studentExists) { // If user has entered a student id that already exists
                    JOptionPane.showMessageDialog(null, "You have entered a student number that already exists");
                } else if ("".equals(txtStudentID.getText())) {
                    JOptionPane.showMessageDialog(null, "You have not entered a student - please enter a student ID.");
                } else if (!"Clean".equals(tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 6).toString()) && !"Clean".equals(ddCleaningStatus.getSelectedItem().toString()) && !"Offline".equals(ddCleaningStatus.getSelectedItem().toString())) { // If not clean AND superuser is not setting it to be clean
                    JOptionPane.showMessageDialog(null, "This room is not clean and cannot be given a lease.");
                } else { // if all is okay
                    try {
                        Student studentToAdd = new Student(txtStudentName.getText(), Integer.parseInt(txtStudentID.getText()));
                        String startDateToAdd = txtLeaseStart.getText();
                        Lease leaseToAdd = new Lease(startDateToAdd, Integer.parseInt(txtLeaseNo.getText()), studentToAdd);
                        for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                            for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for each room
                                if (String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getRoomNo()).equals(txtRoomNo.getText())) { // if this is the room that was selected
                                    accommodationSystem.halls.get(i).getRooms().get(j).addLease(leaseToAdd);
                                    if ("Clean".equals(ddCleaningStatus.getSelectedItem().toString())) { // if room is set to clean by superuser or unchanged
                                        accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(0);
                                    } else if ("Dirty".equals(ddCleaningStatus.getSelectedItem().toString())) { // if room is set to dirty by superuser
                                        accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(1);
                                    } else { // if room is set to offline by superuser
                                        accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(2);
                                    }
                                }
                            }
                        }
                        refreshData();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "The system threw an error - did you enter a valid integer for student number and lease no? Error message: " + e.getMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_btnModifyCreateLeaseActionPerformed

    private void btnDeleteLeaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLeaseActionPerformed
        // TODO add your handling code here:
        if (tblDisplayData.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "You have not select a room");
        } else {
            for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for each room
                    if (String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getRoomNo()).equals(txtRoomNo.getText())) { // if this is the room that was selected
                        accommodationSystem.halls.get(i).getRooms().get(j).removeLease();
                    }
                }
            }
            refreshData();
        }
    }//GEN-LAST:event_btnDeleteLeaseActionPerformed

    private void btnSetCleaningStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetCleaningStatusActionPerformed
        // TODO add your handling code here:
        if (tblDisplayData.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "You have not selected a room");
        } else {
            for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for each room
                    if (String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getRoomNo()).equals(txtRoomNo.getText())) { // if this is the room that was selected
                        if ("Clean".equals(ddCleaningStatus.getSelectedItem().toString())) { // if room is set to clean
                            accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(0);
                        } else if ("Dirty".equals(ddCleaningStatus.getSelectedItem().toString())) { // if room is set to dirty 
                            accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(1);
                        } else { // if room is set to offline 
                            accommodationSystem.halls.get(i).getRooms().get(j).setCleanStatus(2);
                        }
                    }
                }
            }

            refreshData();
        }
    }//GEN-LAST:event_btnSetCleaningStatusActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementSystem().setVisible(true);
            }
        });
    }

    public void setVisibility() {
        switch (accommodationSystem.getPermissions()) {
            case 0:
                txtLeaseNo.setEnabled(false);
                txtHallName.setEnabled(false);
                txtHallNo.setEnabled(false);
                txtRoomNo.setEnabled(false);
                txtStudentID.setEnabled(false);
                txtStudentName.setEnabled(false);
                txtLeaseStart.setEnabled(false);
                txtLeaseNo.setEnabled(false);
                btnModifyCreateLease.setEnabled(false);
                btnDeleteLease.setEnabled(false);
                break;

            case 1:
                ddCleaningStatus.setEnabled(false);
                btnSetCleaningStatus.setEnabled(false);
                txtHallName.setEnabled(false);
                txtHallNo.setEnabled(false);
                txtRoomNo.setEnabled(false);
                break;

            case 2:
                txtHallName.setEnabled(false);
                txtHallNo.setEnabled(false);
                txtRoomNo.setEnabled(false);
                break;
            // superuser has full permissions so nothing needs disabling except things that never change
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteLease;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModifyCreateLease;
    private javax.swing.JButton btnSetCleaningStatus;
    private javax.swing.JComboBox<String> ddCleaningStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCleaningStatus;
    private javax.swing.JLabel lblHallName;
    private javax.swing.JLabel lblHallNo;
    private javax.swing.JLabel lblLeaseNo;
    private javax.swing.JLabel lblLeaseStart;
    private javax.swing.JLabel lblRoomCount;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JTable tblDisplayData;
    private javax.swing.JTextField txtHallName;
    private javax.swing.JTextField txtHallNo;
    private javax.swing.JTextField txtLeaseNo;
    private javax.swing.JTextField txtLeaseStart;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}
