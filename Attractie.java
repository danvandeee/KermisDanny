package kermisDanny;

public abstract class Attractie {
public String naam;
boolean isAan = false;
	
public void turnOn () {
	
	System.out.println("de " + naam + " word aangezet!");
	
}

public boolean getIsAan () {
	
	return this.isAan;
}



} //end class
