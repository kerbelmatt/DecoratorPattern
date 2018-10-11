/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership.TrimLevels;

import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public class Economy extends Vehicles {
    Vehicles vehicle;
    
     public Economy(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
     public String getDesc() {
         return vehicle.getDesc() + " Economy Edition";
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Seats", "Cloth");
        options.put("Engine", "2.0L I4");
        options.put("Wheels", "14 inch");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() - 2000;
    }
}
