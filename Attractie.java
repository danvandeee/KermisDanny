package kermisDanny;

public abstract class Attractie {
public String naam = "name unavailable";
public float prijs = 1.50f;
public int oppervlakte = 10;

boolean isAan = false;
	
public void turnOn () {
	
	System.out.println("de " + naam + " word aangezet!");
	
}

public boolean getIsAan () {
	
	return this.isAan;
}

public void attractieDraaien () {
	
	 System.out.println("de attractie " + naam + " staat aan");
	 System.out.println("hij kost " + prijs);
	 
}



} //end class
