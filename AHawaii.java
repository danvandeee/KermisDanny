package kermisDanny;

public class AHawaii extends RisicoVolleAttractie {

	private int maxDraaien = 10;
	
	public AHawaii() {
		naam = "hawaii";
		isAan = false;
		prijs = 2.90f;
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
