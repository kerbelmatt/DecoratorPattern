package autoDealership;

import autoDealership.VehicleTypes.Vehicles;

/**
 * Abstract decorator class for Vehicles
 * @author mkmat
 */
public abstract class OptionDecorator extends Vehicles {
    
    /**
     * Gets description
     * @return Returns description
     */
    @Override
    public abstract String getDesc();
   
}
