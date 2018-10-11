package autoDealership.SoloOptions;
import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public class AutoBrake extends Vehicles {
    Vehicles vehicle;
    
     public AutoBrake(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
     public String getDesc() {
         return vehicle.getDesc();
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Automatic Braking", "Included");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() + 2000;
    }
}
