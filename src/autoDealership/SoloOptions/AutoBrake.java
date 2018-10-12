package autoDealership.SoloOptions;
import autoDealership.OptionDecorator;
import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public class AutoBrake extends OptionDecorator {
    Vehicles vehicle;
    
    /**
     * Constructor
     * @param vehicle
     */
    public AutoBrake(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
    /**
     * Gets description
     * @return Returns description
     */
    public String getDesc() {
         return vehicle.getDesc();
     }

    /**
     * Gets the vehicle options
     * @return Returns a hashmap with the vehicle options
     */
    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Automatic Braking", "Included");
        return options;
               
    }

    /**
     * Calculates and returns the cost of the vehicle
     * @return Returns double value of cost
     */
    @Override
    public double cost() {
        return vehicle.cost() + 2000;
    }
}
