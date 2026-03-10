package personnages;

public class Romain {
	private String nom;
	private int force;
	private int health;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte +"\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void takeDamage(int damage) {
		this.parler("Aie");
		this.health -= damage;
		if (this.health<=0) {
			System.out.println(this.prendreParole() + " est mort");
			this.force = 0;
		}
	}
	
	public void hit(Gaulois g) {
		this.parler("prend ca!");
		g.takeDamage(force);
	}
	
	public static void main(String[] args) {
		Romain R1 = new Romain("cesar", 100);
		R1.parler("bonjour");
	}
	
}
