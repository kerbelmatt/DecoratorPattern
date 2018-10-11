package autoDealership.SoloOptions;

import autoDealership.OptionDecorator;
import autoDealership.VehicleTypes.Vehicles;
import java.util.HashMap;


public class DieselEngine extends OptionDecorator {
    
    Vehicles vehicle;
    
    public DieselEngine(Vehicles vehicle) {
         this.vehicle = vehicle;
     }
     
    public String getDesc() {
         return vehicle.getDesc();
     }

    @Override
    public HashMap<String, String> getOptions() {
        HashMap<String, String> options = vehicle.getOptions();
        options.put("Engine", "6.2L V8 Turbodiesel");
        return options;
               
    }

    @Override
    public double cost() {
        return vehicle.cost() + 2900;
    }
}
