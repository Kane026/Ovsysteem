package ovSysteem;

import java.util.ArrayList;

public class locaties {
    //maakt een arraylist aan voor alle haltes
    static ArrayList<String> haltes = new ArrayList<String>();
    
    static {
	//voegt haltes toe aan de lijst
        haltes.add("Nijmegen");
        haltes.add("Lent");
        haltes.add("Elst");
        haltes.add("Arnhem-Zuid");
        haltes.add("Arnhem");
        haltes.add("Utrecht");
        haltes.add("Amsterdam");
        haltes.add("Rotterdam");
    }

// berekent de totale prijs van de rijs
    public static double reisPrijs(String beginHalte, String eindHalte) {
	//pakt de index van de haltes in de arraylist en zet deze in een variable 
	    int indexbeginHalte = haltes.indexOf(beginHalte);
	    int indexeindHalte = haltes.indexOf(eindHalte);
// berektn totale afstand door de index van de eindhalte - de beginhalte te doen
	    int totaleAfstand = indexeindHalte - indexbeginHalte;
	  // maakt variable prijs voor totale prijs aan door de totale afstand keer 4 te doen waarin 4 een standaard prijs is 
	    double prijs = totaleAfstand * 4;

	    // return statement om de prijs terug te geven
	    return prijs;
	}

}