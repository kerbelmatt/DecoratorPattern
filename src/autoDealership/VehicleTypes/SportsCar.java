package autoDealership.VehicleTypes;
import java.util.HashMap;
/**
 *
 * @author mkmat
 */
public class SportsCar extends Vehicles {
    
    public SportsCar() {
        description = "Sports Car";
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
        options.put("Seats", "Sport Cloth");
        options.put("Engine", "3.8L V6");
        options.put("Wheels", "17 inch");
        options.put("HVAC", "A/C and Heat");
    
        return options;
    }

    
}
