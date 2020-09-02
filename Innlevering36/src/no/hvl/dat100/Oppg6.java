package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg6 {

	public static void main(String[] args) {
		
	    
		int n = Integer.parseInt(showInputDialog("Hva tall vil du ha fakultet av?"));
		
	    int x = 1;
		
		while(n > 1) {
			x *= n;
			n--;
		}
		
		if(n <= 0) {
			System.out.println("Velg et tall over 0.");
		}
		System.out.println(x);
	}
}