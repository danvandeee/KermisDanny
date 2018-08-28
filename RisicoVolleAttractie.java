package kermisDanny;

public abstract class RisicoVolleAttractie extends Attractie {
	
	int draaiLimiet = 5;
	int aantalkeergedraaid = 0;
	
	public void attractieDraaien () {
		aantalkeergedraaid++;
		boolean moetgekeurdWorden = opstellingsKeuring();
		System.out.println("risicooooooo!!!!");
		//opstellingsKeuring();
		
		System.out.println("de attractie moet gekeurd worden? " + moetgekeurdWorden);
		if (moetgekeurdWorden) {
			System.out.println("DE KEURINGGGGG!!!");
			aantalkeergedraaid = 0;
		}
		
		super.attractieDraaien();
		System.out.println(draaiLimiet);
		System.out.println("aantal keer gedraaid voor keuring: " + aantalkeergedraaid);
		
		
		
	}
	
	
	boolean opstellingsKeuring () {
		
		if (aantalkeergedraaid > draaiLimiet) {
			
			return true;
		} else {
			return false;	
		}
		
	
		
		
	}
	
	
	
	
}
