/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership.TrimLevels;
import autoDealership.*;
import java.util.HashMap;
/**
 *
 * @author mkmat
 */
public class Touring extends OptionDecorator {
    
    Vehicles vehicle;
    
     public Touring(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
     public String getDesc() {
         return vehicle.getDesc() + " Touring Edition";
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("seats", "Leather");
        options.put("engine", "5.0L V8");
        options.put("wheels", "19 inch");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() + 2000;
    }
}
