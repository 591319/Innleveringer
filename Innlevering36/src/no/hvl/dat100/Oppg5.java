package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg5 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
		
		int poengSum = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du?"));
		
		while(poengSum < 0 || poengSum > 100) {
			poengSum = Integer.parseInt(showInputDialog("Tallet må være mellom 100 og 0."));
			
		}
		
		if(poengSum <= 39) {
			System.out.println("Du får karakteren F.");
		} else if(poengSum <= 49) {
			System.out.println("Du får karakteren E.");
		} else if(poengSum <= 59) {
			System.out.println("Du får karakteren D.");
		} else if(poengSum <= 79) {
			System.out.println("Du får karakteren C.");
		} else if(poengSum <= 89) {
			System.out.println("Du får karakteren B.");
		} else if(poengSum <= 100) {
			System.out.println("Du får karakteren A.");
		} 
		
		}
		
		
	}

}
