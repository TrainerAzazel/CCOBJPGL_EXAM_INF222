package Locations;

import Tourists.Tourists;

public class Zambales implements Locations {

    public int airFare = 140;

    
    public void accept(Tourists tourist) {
        tourist.visit(this);
    }
}