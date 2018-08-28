package kermisDanny;

import java.util.ArrayList;

public class BelastingsInspecteur {

	
	public void haalBelastingOp (ArrayList<Attractie> attracties) {
	
	
	 //dit stuk kan je gebruiken voor de gokatractie interface later!!
		
		for (Attractie attractie : attracties) {
			if (attractie instanceof GokAttractie == true) {
				
				
			}
			
		}
		
		
		
	if (attractie.get(theInput) instanceof GokAttractie == true) {		
		GokAttractie gokAttractie = (GokAttractie) attracties.get(theInput);
		gokAttractie.kansSpelBelastingBetalen();
	 }
	
	} //end haalbelasting op
} //end class
