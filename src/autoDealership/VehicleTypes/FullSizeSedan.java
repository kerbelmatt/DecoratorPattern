package autoDealership.VehicleTypes;
import java.util.HashMap;


public class FullSizeSedan extends Vehicles {
    
    public FullSizeSedan() {
        description = "Full Size Sedan";
    }
    
    @Override
    public String getDesc() {
        return description;
    }
    
    @Override
    public double cost() {
        return 18999;
    }
    
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
