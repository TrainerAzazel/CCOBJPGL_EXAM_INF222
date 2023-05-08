package Tourists;


import Locations.Bohol;
import Locations.Boracay;
import Locations.Jolo;
import Locations.Zambales;
import Locations.Quezon;
import Locations.Puerto_Galera;

public class Me implements Tourists {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("\nEnjoying my stay\n");
    }

    public void visit(Boracay boracay) {
        System.out.println("ang budget ko ay " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("\nlezggg Boracay\n" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("\nomai ala budget\n");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("\nkaya pa sa Bohol\n");
            budget -= bohol.airFare;
        }else{
            System.out.println("\nawit hindi pala kaya\n");
        }

        checkBudget();
    }
    public void visit(Zambales zambales) {
        if(budget >zambales.airFare){
            System.out.println("\ntara naman sa zambales lezgo\n");
            budget -= zambales.airFare;
        }else{
            System.out.println("\nhindi na kaya sir\n");
        }

        checkBudget();
    }

    public void visit(Jolo jolo) {
        if(budget >jolo.airFare){
            System.out.println("\nrarara jolo namans\n");
            budget -= jolo.airFare;
        }else{
            System.out.println("\nomai ala na pera\n");
        }

        checkBudget();
    }

    public void visit(Puerto_Galera puertoGalera) {
        if(budget >puertoGalera.airFare){
            System.out.println("\nPuerto Galera na mga sir lezgggg\n");
            budget -= puertoGalera.airFare;
        }else{
            System.out.println("\nala na pala budget omai\n");
        }

        checkBudget();
    }

    public void visit(Quezon quezon) {
        if(budget >quezon.airFare){
            System.out.println("\nbagong trip quezon na this\n");
            budget -= quezon.airFare;
        }else{
            System.out.println("\nawit lods ala na budget\n");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("\nmy budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}