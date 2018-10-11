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
  
    public DriverClass() {
        
    }
    
    public static void main(String args[]) {
        
        DriverClass driver = new DriverClass();

        Vehicles baseSportsCar = new SportsCar();
        
        System.out.println(driver.formatOptions(baseSportsCar));
        
        Vehicles raceCar = new SportsCar();
        raceCar = new Track(raceCar);
        
        System.out.println(driver.formatOptions(raceCar));
   
    }
    
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
