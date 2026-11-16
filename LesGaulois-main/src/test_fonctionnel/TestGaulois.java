package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import village_gaulois.Village;

public class TestGaulois {
	public static void main(String[] args) {
		// 1. Instances et dialogue
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);
		Village village = new Village("Village des Irréductibles",abraracourcix,30);
		village.trouverVillageois(30); 
		village.ajouterVilageois(asterix);
		village.ajouterVilageois(obelix);
		village.afficherVillageois();
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
		
		Gaulois gaulois = village.trouverVillageois(1); 
		System.out.println(gaulois); 
		gaulois = village.trouverVillageois(2); 
		System.out.println(gaulois); 
		
	}}
		
		/*		
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

		// 3.3 Baston contre Minus
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la forêt " + asterix + " et " + obelix
				+ " tombent nez à nez sur le romain " + minus.getNom() + ".");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}

		// 4.5 Les gaulois sous influence
		System.out.println();
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}*/

