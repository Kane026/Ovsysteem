package ovSysteem;

public class ovSysteemTest {
    public static void main(String[] args) {
	// maakt nieuwe chipkaart aan door de methode ovKaart() aan te roepen
        ovChipkaart chipkaart = ovChipkaart.ovKaart();
        //maakt een nieuwe ov paal voor station Nijmegen
        ovPaal nijmegen = new ovPaal("Nijmegen");
        //roept de functie op van de ovpaal nijmegen en pakt hierbij de eerder gemaakte chipkaart zodat deze hierop kan worden uitgevoerd
        nijmegen.ovPaalFunctie(chipkaart);
    }
}
