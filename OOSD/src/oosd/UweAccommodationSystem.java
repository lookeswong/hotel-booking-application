/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd;

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
        
    }
    public static UweAccommodationSystem getInstance() 
    { 
        if (instance == null) 
            instance = new UweAccommodationSystem(); 
  
        return instance; 
    } 
}
