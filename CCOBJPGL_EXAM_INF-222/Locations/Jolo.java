package Locations;

import Tourists.Tourists;

public class Jolo implements Locations {

    public int airFare = 250;

    
    public void accept(Tourists tourist) {
        tourist.visit(this);
    }
}