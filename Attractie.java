package kermisDanny;

public abstract class Attractie {
public String naam = "name unavailable";
public float prijs = 1.50f;
public int oppervlakte = 10;
double omzetPerAttractie = 0;
int aantalkaartjesVerkocht = 0;

boolean isAan = false;

public boolean getIsAan () {
	
	return this.isAan;
}

public void attractieDraaien () {
	
	 System.out.println("de attractie " + naam + " staat aan");
	 System.out.println("hij kost " + prijs);
	 Kassa.omzet += prijs;
	 omzetPerAttractie += prijs;
	 aantalkaartjesVerkocht++;
}

public double getOmzetAttractie () {
	System.out.println(omzetPerAttractie);
	return omzetPerAttractie;
}

public String getNaam() {
	return naam;
	
}

public int getKaartjesVerkocht() {
	return aantalkaartjesVerkocht;
	
}

public boolean getIsAttractieRisicovol () {
	return false;
	
}



} //end class
