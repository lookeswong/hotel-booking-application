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
import java.awt.TextField;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TestManagementSystem extends Application {

    private TableView table = new TableView();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("UWE Accomodation System");
        stage.setWidth(820);
        stage.setHeight(500);

        final Label label = new Label("UWE Accomodation System");
        label.setFont(new Font("Arial", 20));
        
        Label lblLeaseNo = new Label("Lease Number");
        TextField txtLeaseNo = new TextField();
        
        Label lblHallName = new Label("Hall Name");
        TextField txtHallName = new TextField();
        
        Label lblHallNo = new Label("Hall Number");
        TextField txtHallNo = new TextField();
        
        Label lblRoomNo = new Label("Room Number");
        TextField txtRoomNo = new TextField();
        
        Label lblStudentID = new Label("Student ID");
        TextField txtStudentID = new TextField();
        
        Label lblStudentName = new Label("Student Name");
        TextField txtStudentName = new TextField();
        
        Label lblLeaseStart = new Label("Lease Start Date");
        TextField txtLeaseStart = new TextField();
        
        Label lblOccupancyStatus = new Label("Occupancy Status");
        ChoiceBox cbOccupancyStatus = new ChoiceBox(FXCollections.observableArrayList("Occupied", "Unoccupied"));
        
        Label lblCleaningStatus = new Label("Cleaning Status");
        ChoiceBox cbCleaningStatus = new ChoiceBox(FXCollections.observableArrayList("Clean", "Dirty", "Offline"));

        table.setEditable(true);

        TableColumn leaseNoCol = new TableColumn("Lease Number");
        TableColumn hallNameCol = new TableColumn("Hall Name");
        TableColumn hallNoCol = new TableColumn("Hall Number");
        TableColumn roomNoCol = new TableColumn("Room number");
        TableColumn studentIDCol = new TableColumn("Student ID");
        TableColumn studentNameCol = new TableColumn("Student Name");
        TableColumn occupancyStatusCol = new TableColumn("Occupancy Status");
        TableColumn cleaningStatusCol = new TableColumn("Cleaning Status");
        TableColumn leaseStartCol = new TableColumn("Lease Start");
        TableColumn leaseEndCol = new TableColumn("Lease End");

        table.getColumns().addAll(leaseNoCol, hallNameCol, hallNoCol, roomNoCol, studentIDCol, studentNameCol,
                occupancyStatusCol, cleaningStatusCol, leaseStartCol, leaseEndCol);
                
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, lblLeaseNo, lblHallName, lblHallNo, lblRoomNo, lblStudentID, lblStudentName, lblLeaseStart, lblOccupancyStatus, lblCleaningStatus);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }



}
