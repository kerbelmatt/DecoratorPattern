/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership;
import autoDealership.TrimLevels.*;
/**
 *
 * @author mkmat
 */
public class DriverClass {
    public static void main(String args[]) {
        Vehicles vehicle = new SportsCar();
        Vehicles vehicle2 = new PickupTruck();
        vehicle2 = new Touring(vehicle2);
        
        System.out.println(vehicle2.getDesc());
    }
}
