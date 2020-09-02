package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg4 {

	public static void main(String[] args) {
	
	float bruttoInntekt = Integer.parseInt(showInputDialog("Hva er brutto lønnen din?"));
		
		
	if(bruttoInntekt <= 164100) {
		
			System.out.println("Du betlaer ingen trinnskatt.");
	} else if(bruttoInntekt <= 230950) {
			System.out.println("Du betlaer 0，93% i trinnskatt. Det utgjør " + bruttoInntekt * 0.0093 + " av lønnen din.");
	} else if(bruttoInntekt <= 580650) {
			System.out.println("Du betaler 2,41% i trinnskatt. Det utgjør " + bruttoInntekt * 0.0241 + " av lønnen din.");
	} else if(bruttoInntekt <= 934050) {
			System.out.println("Du betaler 11,52 i trinnskatt. Det utgjør " + bruttoInntekt * 0.1152 + " av lønnen din.");
	} else if(bruttoInntekt <= 934051) {
			System.out.println("Du betaler 14,52% i trinnskatt. Det utgjør " + bruttoInntekt * 0.1452 + " av lønnen din.");
	}
	}
	}