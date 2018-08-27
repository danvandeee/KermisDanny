package kermisDanny;

import java.util.ArrayList;
import java.util.Scanner;

public class KermsSetup {

	public void setup () {
		
		ArrayList<Attractie> attracties = new ArrayList<Attractie>(); 
		
		
		System.out.println("de kermis word uitgevouwen...");
		 Attractie attractie = new ABotsAutos();
		 ABotsAutos botsie = new  ABotsAutos();
		 AHawaii hawaii = new AHawaii();
		 ALadderKlimmen ladderKlimmen = new ALadderKlimmen();
		 
		 
		 attracties.add(botsie);
		 attracties.add(hawaii);
		 attracties.add(ladderKlimmen);
		 attracties.add(attractie);
		 
		 
		 for (Attractie apparaat : attracties) {
		 System.out.println(apparaat.naam + " is " + apparaat.getIsAan()); 
		 } //end for loop
		 
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("kies een getal voor bijbehorende attractie: ");
		 for (Attractie apparaat : attracties) {
		 System.out.print((attracties.lastIndexOf(apparaat) +1)+ ":"+ apparaat.naam + "  ");
		 } //end for each loop
		 
		 System.out.println("\n");
		 System.out.print("input: ");
		 
		 try {
		 
		 int input = scanner.nextInt();
		 input--;
		 System.out.println(attracties.get((input)).naam);
		 
		 String attractieAan = ((attracties.get(input).getIsAan()) ? "aan" : "uit");
		 System.out.println("de attractie staat " + attractieAan);
		 
		 } catch (NullPointerException ex) {
			 System.out.println("voer iets in!");
			 
		 }
		 
		 
		 
	} //end setup
	
	
}
