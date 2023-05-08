import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations bohol = new Bohol();
        Locations jolo = new Jolo();
        Locations puertoGalera = new Puerto_Galera();
        Locations quezon = new Quezon();
        Locations zambales = new Zambales();

        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Tourists Me = new Me();

        boracay.accept(Me);
        puertoGalera.accept(Me);
        jolo.accept(Me);
        bohol.accept(Me);
        quezon.accept(Me);
        zambales.accept(Me);



    }
}