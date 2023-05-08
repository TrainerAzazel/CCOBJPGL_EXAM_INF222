package Locations;

import Tourists.Tourists;

public class Boracay implements Locations {

    public int airFare = 200;

    
    public void accept(Tourists tourist) {
        tourist.visit(this);
    }
}