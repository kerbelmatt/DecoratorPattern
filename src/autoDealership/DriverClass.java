package autoDealership;
import autoDealership.VehicleTypes.*;
import autoDealership.TrimLevels.*;
import autoDealership.SoloOptions.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author mkmat
 */
public class DriverClass {
  
    /**
     * Constructor used to instantiate the class for testing
     */
    public DriverClass() {
        
    }
    
    /**
     * Main 
     * @param args
     */
    public static void main(String args[]) {
        
        DriverClass driver = new DriverClass();
        
        //A base pickup truck
        Vehicles basePickup = new PickupTruck();
        System.out.println(driver.formatOptions(basePickup));
        
        //A premium pickup truck with several options added individually
        Vehicles premPickup = new PickupTruck();
        premPickup = new Nav(premPickup);
        premPickup = new Leather(premPickup);
        premPickup = new AutoBrake(premPickup);
        premPickup = new PremWheels(premPickup);
        premPickup = new DieselEngine(premPickup);
        System.out.println(driver.formatOptions(premPickup));
    }
    
    /**
     * Formats the properties of a vehicle
     * @param vehicle A vehicle object
     * @return Returns a String with the formatted properties of a vehicle
     */
    public String formatOptions(Vehicles vehicle) {
        
        DecimalFormat df = new DecimalFormat("$#,###.00");
        HashMap<String, String> options = vehicle.getOptions();
        Iterator<HashMap.Entry<String, String>> entries = options.entrySet().iterator();
        String result = "";
        
        result += ("Vehicle: " + vehicle.getDesc() + "\n" + "Cost: " + df.format(vehicle.cost()) + "\n" + "Options:\n");
        
        while (entries.hasNext()) {
            
            HashMap.Entry<String, String> entry = entries.next();
            result += ("   " + entry.getKey() + ": " + entry.getValue() + "\n");
        }
        
        return result;
    }
    
}
