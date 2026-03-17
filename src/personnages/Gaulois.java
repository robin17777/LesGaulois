package personnages;

import village_gaulois.village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void setVillage(village village) {
		this.village=village;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(this.nom + " envoie un grand coup dans la machoire de " + nomRomain);
		int forceCoup = this.effetPotion * force/3;
		romain.recevoirCoup(forceCoup);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("astérix", 8);
		Romain r1 = new Romain("cesar", 7);
		asterix.frapper(r1);
		asterix.frapper(r1);
		asterix.frapper(r1);
		asterix.frapper(r1);
		
	}

	@Override
	public String toString() {
		return nom;
	}
	

}