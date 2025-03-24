package ovSysteem;

public class ovSysteemTest
{

    public static void main(String[] args)
    {
	ovChipkaart chipkaart = new ovChipkaart("1234", 10, false);

	inchecken incheckSysteem = new inchecken();
	
	incheckSysteem.inchecken(chipkaart);
    }

}
