package kermisDanny;

public abstract class RisicoVolleAttractie extends Attractie {
	
	int draaiLimiet = 5;
	int aantalkeergedraaid = 0;
	
	public void attractieDraaien () {
		
		System.out.println("risicooooooo!!!!");
		opstellingsKeuring();
		
		super.attractieDraaien();
		
		
		
	}
	
	
	boolean opstellingsKeuring () {
		return false;
		
		
	}
	
	
	
	
}
