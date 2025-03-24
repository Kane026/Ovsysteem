package ovSysteem;

public class ovChipkaart
{
private String kaartNummer;
private double saldo;
boolean isIngecheckt;



public ovChipkaart(String kaartNummer, double saldo, boolean isIngecheckt) {
    this.kaartNummer = kaartNummer;
    this.saldo = saldo;
    this.isIngecheckt = false;
}

public double getSaldo() {
    return saldo;
}

public String getKaartnummer() {
    return kaartNummer;
}

public boolean isIngecheckt() {
    return isIngecheckt;
}

}