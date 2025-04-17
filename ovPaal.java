package ovSysteem;

import java.util.Scanner;

public class ovPaal
{
    //maakt een private variable om de locatie op te slaan
    private String locatieNaam;
    //constructor voor het aanmaken van een ovPaal met een stationnaam
    public ovPaal(String locatieNaam) {
	    // Zet de naam van de locatie
	    this.locatieNaam = locatieNaam;
	}
    //begint de ovPaalfuncties 
public void ovPaalFunctie(ovChipkaart chipkaart) {
    Scanner scanner = new Scanner(System.in);
    //zet de eindHalte standaard op amsterdam
    String eindHalte = "Amsterdam";
 
//zorgt ervoor dat het programma blijft draaien tot het wordt gesloten
while (true)
{
    //scanner voor input wat de gebruiker wilt doen
    System.out.println("Wat wilt u doen? Inchecken/Uitchecken/Opwaarderen");
    String input = scanner.nextLine().toLowerCase();
    //checkt of de input van de scanner inchecken is
    if (input.contains("inchecken"))
    {
	//checkt de condities of het saldo hoog genoeg is en of de persoon niet al ingecheckt is 
	if (chipkaart.getSaldo() >= 10.0 & chipkaart.isIngecheckt == false)
	{
	    //zet ingecheckt naar true
	    chipkaart.isIngecheckt = true;
	    //haalt het ingecheckte station op
	    chipkaart.ingechecktStation = locatieNaam;
	    //output text met saldo en ingecheckte locatie van boven
	    System.out.println("U bent nu ingecheckt bij station:" + locatieNaam);
	    System.out.println("U saldo is " + chipkaart.getSaldo() + " euro \n");
	    System.out.println("U bent nu aangekomen op station: " + eindHalte);
	    
	
	    // else if als saldo niet hoog genoeg is om in te checken
	} else if (chipkaart.getSaldo() < 10.0)
	{
	    //laat saldo zien en print text om te laten zien dat er geen genoeg saldo is 
	    System.out.println("U hebt onvoldoende saldo. Laad uw ov op \n");
	    System.out.println("U huidige saldo is " + chipkaart.getSaldo() + " euro \n");
	} else 
	{
	    System.out.println("u bent al ingecheckt \n");
	    
	}

    // checkt of input uitchecken bevat
    } else if (input.contains("uitchecken"))
    {
	//als ingecheckt true is zet de status van inchecken naar false
	   if(chipkaart.isIngecheckt()) {
		//berekent de prijs van de totale reis door de incheckhalte en eindhalte te pakken
		double prijs = locaties.reisPrijs(chipkaart.ingechecktStation, eindHalte);
		chipkaart.saldo = chipkaart.saldo - prijs;
		chipkaart.isIngecheckt = false;
		// laat de info van uitchecken zien zoals nieuwe saldo 
		System.out.println("Uw bent nu uitgecheckt bij station " + eindHalte);
		System.out.println("De total prijs van deze reis was: " + prijs);
		System.out.println("Uw huidige saldo is: " + chipkaart.saldo);
	    }
	   //als chipkaart als is uitgecheckt laat zien is al uitgecheckt
	    else if (!chipkaart.isIngecheckt){System.out.println("u bent al uitgecheckt \n");}
	}
    //als input opwaarderen is ga verder naar opwaarderen
    else if(input.contains("opwaarderen")){
	    System.out.println("Met hoeveel euro wilt u uw saldo verhogen");
	    //scanner voor input met hoeveel saldo moet worden verhoogt 
	    double saldoInput = scanner.nextDouble();
	    //berekent saldo na opwaarderen door input saldo op te tellen bij huidge saldo
	    double opwaardeerSaldo = chipkaart.getSaldo() + saldoInput;
	    System.out.println("Je nieuwe saldo = " + opwaardeerSaldo);
	    // zet chipkaart saldo gelijk aan opwaardeer saldo zodat als je later opwaardeert het het nogsteeds doet
	    chipkaart.saldo = opwaardeerSaldo;}
    }
}
}

