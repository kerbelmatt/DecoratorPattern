/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership.SoloOptions;
import autoDealership.OptionDecorator;
import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;
/**
 *
 * @author mkmat
 */
public class Leather extends OptionDecorator {

    Vehicles vehicle;
    
    /**
     *
     * @param vehicle
     */
    public Leather(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
    /**
     *
     * @return
     */
    public String getDesc() {
         return vehicle.getDesc();
     }

    /**
     *
     * @return
     */
    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Seats", "Leather");
        return options;
               
    }

    /**
     *
     * @return
     */
    @Override
    public double cost() {
        return vehicle.cost() + 999;
    }
    
}
