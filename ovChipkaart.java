package ovSysteem;

public class ovChipkaart
//maakt ov chipkaart variable aan
{
    private String kaartNummer;
    double saldo;
    boolean isIngecheckt;
//constructor voor aanmaken ovchipkaart stelt het kaartnummer, saldo en incheckstatus in
    public ovChipkaart(String kaartNummer, double saldo, boolean isIngecheckt)
    {
	
	this.kaartNummer = kaartNummer;
	this.saldo = saldo;
	this.isIngecheckt = false;
    }
// haalt saldo van de kaart op
    public double getSaldo()
    {
	return saldo; // geeft het huidge saldo weer
    }
// haalt kaart nummer op
    public String getKaartnummer()
    {
	return kaartNummer; // laat kaartnummer zien
    }
    // checkt of chipkaart is ingecheckt
    public boolean isIngecheckt() //geeft status terug of de chipkaart is ingeckeckt of niet
    {
	return isIngecheckt;
    }
    //locatie van ingeckeckt station deze staat standaard op null dus heeft geen waarde
    public String ingechecktStation = null;
    //maakt ov chipkaart aan met gegevens erop
    public static ovChipkaart ovKaart() {
    return new ovChipkaart ("1234", 30, false);}
}
