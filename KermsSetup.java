package kermisDanny;

import java.util.ArrayList;
import java.util.Scanner;

public class KermsSetup {

	public void setup () {
		
		ArrayList<Attractie> attracties = new ArrayList<Attractie>(); 
		
		
		System.out.println("de kermis word uitgevouwen...");
		
		 ABotsAutos botsie = new  ABotsAutos();
		 AHawaii hawaii = new AHawaii();
		 
		 
		 attracties.add(botsie);
		 attracties.add(hawaii);
		 
		 
		 for (Attractie apparaat : attracties) {
		 System.out.println(apparaat.naam + " is " + apparaat.getIsAan()); 
		 } //end for loop
		 
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("kies een getal voor bijbehorende attractie: ");
		 for (Attractie apparaat : attracties) {
		 System.out.print(attracties.lastIndexOf(apparaat)+ ": "+ apparaat.naam);
		 }
		 try {
		 
		 int input = scanner.nextInt();
		 System.out.println(attracties.get(input).naam);
		 
		 
		 } catch (NullPointerException ex) {
			 System.out.println("voer iets in!");
			 
		 }
		 
		 
		 
	} //end setup
	
	
}
