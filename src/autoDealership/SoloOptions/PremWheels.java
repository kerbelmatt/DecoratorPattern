package autoDealership.SoloOptions;

import autoDealership.OptionDecorator;
import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public class PremWheels extends OptionDecorator{
    Vehicles vehicle;
    
    /**
     *
     * @param vehicle
     */
    public PremWheels(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
    /**
     *
     * @return
     */
    public String getDesc() {
         return vehicle.getDesc();
     }

    /**
     *
     * @return
     */
    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Wheels", "19 inch chrome");
        return options;
               
    }

    /**
     *
     * @return
     */
    @Override
    public double cost() {
        return vehicle.cost() + 500;
    }
}
