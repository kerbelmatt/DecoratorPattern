package autoDealership.VehicleTypes;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public abstract class Vehicles {
    
    String description = "Unknown";
    HashMap<String, String> options = new HashMap<String, String>();

      public String getDesc() {
        return description;
    }
    
    public abstract HashMap<String, String> getOptions();
    
    public abstract double cost();
    
  
}
    

