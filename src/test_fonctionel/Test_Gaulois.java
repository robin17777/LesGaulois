package test_fonctionel;

import personnages.Gaulois;
import personnages.Romain;

public class Test_Gaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("astérix", 8);
		Gaulois obelix = new Gaulois("obélix", 16);
		Romain minus = new Romain("minus", 6);
		
		
		asterix.parler("Bonjour Obélix");
		obelix.parler("on va chasser");
		asterix.parler("bonne idée");
		System.out.println("Dans la foret " + asterix + " et " + obelix + " tombe nez a nez avec le romain " + minus);
		for (int i =0; i <=2; i++) {
			obelix.frapper(minus);
		}

	}

}