package autoDealership.VehicleTypes;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public abstract class Vehicles {
    
    //Default description
    String description = "Unknown";

    /**
     *
     * @return Returns the vehicle's description
     */
    public String getDesc() {
        return description;
    }
    
    /**
     *
     * @return Returns a HashMap of option/value pairs (used like a dictionary)
     */
    public abstract HashMap<String, String> getOptions();
    
    /**
     *
     * @return Returns the cost of the vehicle
     */
    public abstract double cost();
    
  
}
    

