package Locations;

import Tourists.Tourists;

public class Quezon implements Locations {

    public int airFare = 120;

    
    public void accept(Tourists tourist) {
        tourist.visit(this);
    }
}