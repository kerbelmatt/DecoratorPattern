package autoDealership;
import autoDealership.VehicleTypes.*;
import autoDealership.TrimLevels.*;
import autoDealership.SoloOptions.*;
/**
 *
 * @author mkmat
 */
public class DriverClass {
    
    public static void main(String args[]) {

        Vehicles baseSportsCar = new SportsCar();
        
        System.out.println("Vehicle: " + baseSportsCar.getDesc());
        System.out.println("Cost: " + baseSportsCar.cost());
        System.out.println("Options: " + baseSportsCar.getOptions());
   
    }
    
}
