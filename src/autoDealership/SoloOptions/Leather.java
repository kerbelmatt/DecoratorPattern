/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership.SoloOptions;
import autoDealership.VehicleTypes.Vehicles;
import autoDealership.*;
import java.util.HashMap;
/**
 *
 * @author mkmat
 */
public class Leather extends OptionDecorator {

    Vehicles vehicle;
    
     public Leather(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
     public String getDesc() {
         return vehicle.getDesc();
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Seats", "Leather");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() + 999;
    }
    
}
