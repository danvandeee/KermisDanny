package kermisDanny;

public class ASpin extends RisicoVolleAttractie {
	
	
	public ASpin() {
		super();
		naam = "spin";
		isAan = false;
		prijs = 2.25f;
		draaiLimiet = 5;
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
