/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoDealership;

import java.util.HashMap;

/**
 *
 * @author mkmat
 */
public abstract class Vehicles {
    
    String description = "Unknown";

    public String getDesc() {
        return description;
    }

    public abstract HashMap<String, String> getOptions();
    
    public abstract double cost();
  
}
    

