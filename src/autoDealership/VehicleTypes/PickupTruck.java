package autoDealership.VehicleTypes;

import java.util.HashMap;
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
        return 19999;
    }
    
    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = new HashMap<String, String>();
        
        //Set default options 
        options.put("Seats", "Cloth");
        options.put("Engine", "3.8L V6");
        options.put("Wheels", "15 inch");
        options.put("HVAC", "A/C and Heat");
    
        return options;
    }
}
