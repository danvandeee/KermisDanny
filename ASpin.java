package kermisDanny;

public class ASpin extends RisicoVolleAttractie {
	private int maxDraaien = 5;
	private int aantalkeergedraaid = 0;
	
	public ASpin() {
		super();
		naam = "spin";
		isAan = false;
		prijs = 2.25f;
	}

	@Override
	public boolean opstellingsKeuring() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean getIsAttractieRisicovol () {
		return true;
		
	}
	
	
}
