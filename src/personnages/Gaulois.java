package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int health;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.health = 100;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void takeDamage(int damage) {
		this.parler("Aie");
		this.health -= damage;
		if (this.health<=0) {
			System.out.println(this.prendreParole() + " est mort");
			this.force = 0;
		}
	}
	
	public void hit(Romain r) {
		this.parler("prend ça");
		r.takeDamage(force);
	}
	
	public static void main(String[] args) {
		Gaulois G1 = new Gaulois("astérix", 50);
		Romain R1 = new Romain("cesar", 10);
		G1.parler("Bonjour je suis "+ G1.getNom());
		G1.hit(R1);
		R1.hit(G1);
		G1.hit(R1);
		
	}
	

}