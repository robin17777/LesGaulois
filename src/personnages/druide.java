package personnages;

import objets.Chaudron;

public class druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public druide(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron();
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		this.chaudron.remplirChaudron(quantite, forcePotion);
	}
	
	public void booster(Gaulois gaulois) {
		boolean contientPotion =  this.chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if (contientPotion) {
			if (nomGaulois == "obélix") {
				this.parler("non" + nomGaulois + " tu est tomber dedans quant tu était petit");
			} else {
				int forcePotion = this.chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				this.parler("tien " + nomGaulois + " un  peu de potion magique");
			}
		} else {
			this.parler("désoler il n'y a plus de potion");
		}
	}
	
	public static void main(String[] args) {
	
	}

	@Override
	public String toString() {
		return nom;
	}
	

}