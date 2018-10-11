/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership.TrimLevels;

import autoDealership.VehicleTypes.Vehicles;
import autoDealership.*;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public class Track extends Vehicles {
    Vehicles vehicle;
    
     public Track(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
     public String getDesc() {
         return vehicle.getDesc() + " Track Package";
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Seats", "Recaro Sport Seats");
        options.put("Engine", "Twin Turbo 3.5L V6");
        options.put("Wheels", "19 inch aluminum");
        options.remove("HVAC");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() + 4000;
    }
    
}
