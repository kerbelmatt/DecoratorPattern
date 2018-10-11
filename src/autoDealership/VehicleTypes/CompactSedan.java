package autoDealership.VehicleTypes;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public class CompactSedan extends Vehicles {
    
    /**
     *
     */
    public CompactSedan() {
        description = "Compact Sedan";
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getDesc() {
        return description;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double cost() {
        return 14999;
    }
    
    /**
     *
     * @return
     */
    @Override
    public HashMap<String, String> getOptions() {
        
        HashMap<String, String> options = new HashMap<String, String>();
        
        //Set standard options 
        options.put("Seats", "Cloth");
        options.put("Engine", "3.8L V6");
        options.put("Wheels", "15 inch");
        options.put("HVAC", "A/C and Heat");
    
        return options;
    }
}
