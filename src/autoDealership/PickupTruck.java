/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership;

import java.util.HashMap;
import autoDealership.TrimLevels.*;
/**
 *
 * @author mkmat
 */
public class PickupTruck extends Vehicles {
    public PickupTruck() {
        description = "Pickup Truck";
    }
    
    @Override
    public String getDesc() {
        return description;
    }
    
    @Override
    public double cost() {
        return 29999;
    }
    
    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = new HashMap<String, String>();
        
        //Set default options 
        options.put("seats", "Sport Cloth");
        options.put("engine", "3.8L V6");
        options.put("wheels", "17 inch");
    
        return options;
    }
}
