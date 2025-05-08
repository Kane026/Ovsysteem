package ovSysteem;

import java.util.Scanner;

public class ovSysteemTest
{
    public static void main(String[] args)
    {
	// maakt nieuwe chipkaart aan door de methode ovKaart() aan te roepen
	ovChipkaart chipkaart = ovChipkaart.ovKaart();
	// maakt een nieuwe ov paal voor beginhalte
	ovPaal beginHalte = new ovPaal("Elst");
	// maakt ovpaal aan voor de eindhalte
	ovPaal eindHalte = new ovPaal("Nijmegen");
	Scanner scanner = new Scanner(System.in);
//zorgt ervoor dat programma blijft draaien tot het gesloten wordt
	while (true)
	{
	    System.out.println("Wat wilt uw doen? Inchecken/Uitchecken/Opwaarderen");
	    String input = scanner.nextLine().toLowerCase();

	    if (input.contains("inchecken"))
	    {
		beginHalte.inchecken(chipkaart);
	    } else if (input.contains("uitchecken"))
	    {
		eindHalte.uitchecken(chipkaart);
	    } else if (input.contains("opwaarderen"))
	    {
		eindHalte.opwaarderen(chipkaart, scanner);
	    }

	}
    }
}


