package kermisDanny;

public class ALadderKlimmen extends Attractie implements GokAttractie {
	double belasting = 0;
	
	
	public ALadderKlimmen() {
		super();
		naam = "ladderklimmen";
		isAan = false;
		prijs = 5.00f;
	}

	@Override
	public double kansSpelBelastingBetalen() {
		// TODO Auto-generated method stub
		belasting += (double) (prijs * 0.3);
		
		
		return belasting;
	}
	
}
