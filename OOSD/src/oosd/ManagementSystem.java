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
 * @author Lucas
 */
public class ManagementSystem extends javax.swing.JFrame {

    /**
     * Creates new form ManagementSystem
     */
    private UweAccommodationSystem accommodationSystem = UweAccommodationSystem.getInstance();

    public ManagementSystem() {
        initComponents();
        setVisibility();
        tblDisplayData.setModel(accommodationSystem.retrieveData());
        String[] occupancyStatuses = {"Occupied", "Unoccupied"};
        String[] cleaningStatuses = {"Dirty", "Clean", "Offline"};
        ddCleaningStatus.setModel(new DefaultComboBoxModel(cleaningStatuses));
        tblDisplayData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
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
        });

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnModifyCreateLease = new javax.swing.JButton();
        btnDeleteLease = new javax.swing.JButton();
        btnSetCleaningStatus = new javax.swing.JButton();

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

        jLabel2.setText("Lease Number:");

        jLabel3.setText("Hall Name:");

        jLabel4.setText("Hall Number:");

        jLabel5.setText("Room Number");

        jLabel6.setText("Student ID:");

        jLabel7.setText("Student Name:");

        jLabel9.setText("Lease Start Date:");
        jLabel9.setToolTipText("");

        jLabel10.setText("Cleaning Status:");

        btnModifyCreateLease.setText("Modify Lease");
        btnModifyCreateLease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCreateLeaseActionPerformed(evt);
            }
        });

        btnDeleteLease.setText("Delete Lease");

        btnSetCleaningStatus.setText("Set Cleaning Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtHallNo)
                    .addComponent(txtHallName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLeaseNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(txtRoomNo))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentID)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtStudentName)
                    .addComponent(ddCleaningStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLeaseStart, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModifyCreateLease, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteLease, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSetCleaningStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLeaseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHallName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnModifyCreateLease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDeleteLease, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHallNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddCleaningStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLeaseStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSetCleaningStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
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
        if (tblDisplayData.getValueAt(tblDisplayData.getSelectedRow(), 3).toString() == "") { // If creating new lease
            boolean leaseExists = false;
            boolean studentExists = false;
            for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for every room in this hall
                    if (accommodationSystem.halls.get(i).getRooms().get(j).getLease() != null) {
                        String leaseNo = String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getLease().getLeaseNo()); // get lease no
                        String studentID = String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getLease().getStudent().getID()); // get student ID
                        if (leaseNo.equals(txtLeaseNo.getText())) { // ensure lease does not exist with entered lease number
                            leaseExists = true;
                        }
                        if (studentID.equals(txtStudentID.getText())) { // ensure student does not exist with entered student number
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
            } else { // if all is okay
                try {
                    Student studentToAdd = new Student(txtStudentName.getText(), Integer.parseInt(txtStudentID.getText()));
                    String startDateToAdd = txtLeaseStart.getText();
                    Lease leaseToAdd = new Lease(startDateToAdd, Integer.parseInt(txtLeaseNo.getText()), studentToAdd);
                    for (int i = 0; i < accommodationSystem.halls.size(); i++) { // for each hall
                        for (int j = 0; j < accommodationSystem.halls.get(i).getRooms().size(); j++) { // for each room
                            if (String.valueOf(accommodationSystem.halls.get(i).getRooms().get(j).getRoomNo()).equals(txtRoomNo.getText())) { // if room that was selected
                                accommodationSystem.halls.get(i).getRooms().get(j).addLease(leaseToAdd);
                                tblDisplayData.setModel(accommodationSystem.retrieveData());
                            }
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "The system threw an error - did you enter a valid integer for student number and lease no? Error message: " + e.getMessage());
                }
            }
        } else { // if modifying lease

        }
    }//GEN-LAST:event_btnModifyCreateLeaseActionPerformed

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
                break;

            case 1:
                ddCleaningStatus.setEnabled(false);
                break;

            case 2:
                break;
            // superuser has full permissions so nothing needs disabling as all is enabled by default
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteLease;
    private javax.swing.JButton btnModifyCreateLease;
    private javax.swing.JButton btnSetCleaningStatus;
    private javax.swing.JComboBox<String> ddCleaningStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
