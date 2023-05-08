package Tourists;

import Locations.Bohol;
import Locations.Boracay;
import Locations.Jolo;
import Locations.Zambales;
import Locations.Quezon;
import Locations.Puerto_Galera;
import Locations.Locations;


public interface Tourists {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Bohol bohol);
    
    void visit(Jolo jolo);

    void visit(Puerto_Galera puertoGalera);

    void visit(Zambales zambales);

    void visit(Quezon quezon);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}