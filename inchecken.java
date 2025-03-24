package ovSysteem;

public class inchecken
{
public void inchecken(ovChipkaart chipkaart){
    if(chipkaart.getSaldo() >= 10.0) { 
	chipkaart.isIngecheckt = true;
	System.out.println("U bent nu ingecheckt");
	System.out.println("U saldo is " + chipkaart.getSaldo() + " euro");
    }
    else {System.out.println("U hebt onvoldoende saldo. Laad uw ov op");
    System.out.println("U huidige saldo is " + chipkaart.getSaldo() + " euro" );}

  }
}
