package kermisDanny;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KermsSetup {

	public void setup () {
		
		ArrayList<Attractie> attracties = new ArrayList<Attractie>(); 
		boolean isStopped = false;
		
		System.out.println("de kermis word uitgevouwen...");
		 Attractie attractie = new ABotsAutos();
		 ABotsAutos botsie = new  ABotsAutos();
		 
		 
		 
		 AHawaii hawaii = new AHawaii();
		 ALadderKlimmen ladderKlimmen = new ALadderKlimmen();
		 ASpiegelpaleis spiegelpaleis = new ASpiegelpaleis();
		 ASpin spin = new ASpin();
		 ASpookhuis spookhuis = new ASpookhuis();
		 
		 
		 attracties.add(botsie);
		 attracties.add(hawaii);
		 attracties.add(ladderKlimmen);
		 attracties.add(spiegelpaleis);
		 attracties.add(spin);
		 attracties.add(spookhuis);
		 
		 attracties.add(attractie);
		 
		 
		 
		 
		 for (Attractie apparaat : attracties) {
		 System.out.println(apparaat.naam + " is " + apparaat.getIsAan()); 
		 } //end for loop
		 
		 while (!isStopped) {
		 System.out.println("kies een getal voor bijbehorende attractie: ");
		 for (Attractie apparaat : attracties) {
		 System.out.print((attracties.lastIndexOf(apparaat) +1)+ ":"+ apparaat.naam + "  ");
		 } //end for each loop
		 
		 System.out.println("\n");
		
		 
		 UserInput userinput = new UserInput();
		 String lastInput = "";
		 try {
			 lastInput = userinput.getInput();
			 
			 if (lastInput.isEmpty()) {  //check of de input niet leeg is
				 System.out.println("no input!");
				 continue;
			 }
			 
			 try {   //deze try is voor als je een attractie kiest!
				 int theInput = (Integer.parseInt(lastInput)-1);	 
				 System.out.println(attracties.get((theInput)).naam);
				 
				 //dit stuk kan je gebruiken voor de gokatractie interface later!!
				/* if (attracties.get(theInput).getIsAttractieRisicovol() == true) {			
					 RisicoVolleAttractie gevaarlijkeattractie = (RisicoVolleAttractie) attracties.get(theInput);
					 gevaarlijkeattractie.opstellingsKeuring();
				 }
				*/ 
				 
				 attracties.get(theInput).attractieDraaien();
				System.out.println( "al " + attracties.get(theInput).getOmzetAttractie() + "is besteed!!");
			 } catch (NumberFormatException ex) {
			
			 }
			 
			 
			 if (lastInput.equals("o")) {   							//als de input o is
				 
				 System.out.println("kazza omzet is " + Kassa.omzet);
				 
			 } //end input o
			 
			 if (lastInput.equals("k")) {								//als de input k is
				 int totaalKaartjes = 0;
				 for (Attractie apparaat : attracties) {
				 
				 System.out.println("aantal kaarten verkocht bij de " + apparaat.getNaam() + " " + apparaat.getKaartjesVerkocht());
				 totaalKaartjes += apparaat.getKaartjesVerkocht();
				 } //end fot loop
				 
				 System.out.println("dus in totaal zijn er " + totaalKaartjes + " kaartjes verkocht!");
			 } //end input k
			 
			 
		 } catch (NullPointerException ex) {
			 System.out.println("no input!");
			 
		 }
			 
			 
			
			 
		  
			 
			 
			 
			 
		 
		 
		 
		 } //end while not is stopped
		 
		 //String attractieAan = ((attracties.get(input).getIsAan()) ? "aan" : "uit");
		// System.out.println("de attractie staat " + attractieAan);
		 
		 
		 
		 
		 
	} //end setup
	
	
}
