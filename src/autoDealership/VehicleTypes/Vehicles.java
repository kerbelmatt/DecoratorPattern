package autoDealership.VehicleTypes;
import java.util.HashMap;


public abstract class Vehicles {
    
    //Default description
    String description = "Unknown";

    public String getDesc() {
        return description;
    }
    
    public abstract HashMap<String, String> getOptions();
    

    public abstract double cost();
    
}
    

