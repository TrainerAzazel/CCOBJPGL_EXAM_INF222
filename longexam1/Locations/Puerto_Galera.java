package Locations;

import Tourists.Tourists;

public class Puerto_Galera implements Locations {

    public int airFare = 195;

    
    public void accept(Tourists tourist) {
        tourist.visit(this);
    }
}