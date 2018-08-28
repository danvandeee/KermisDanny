package kermisDanny;

public class AHawaii extends RisicoVolleAttractie {

	
	public AHawaii() {
		naam = "hawaii";
		isAan = false;
		prijs = 2.90f;
		draaiLimiet = 10;
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
