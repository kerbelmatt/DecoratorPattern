package autoDealership.TrimLevels;

import autoDealership.OptionDecorator;
import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;

public class Economy extends OptionDecorator {
    Vehicles vehicle;
    
    public Economy(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
    public String getDesc() {
         return vehicle.getDesc() + " Economy Edition";
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Seats", "Cloth");
        options.put("Engine", "2.0L I4");
        options.put("Wheels", "14 inch");
        options.put("Transmission", "Manual");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() - 2000;
    }
}
