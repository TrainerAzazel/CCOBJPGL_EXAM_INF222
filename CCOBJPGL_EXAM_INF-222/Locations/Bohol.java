package Locations;

import Tourists.Tourists;

public class Bohol implements Locations {

    public int airFare = 215;

    
    public void accept(Tourists tourist) {
        tourist.visit(this);
    }
}