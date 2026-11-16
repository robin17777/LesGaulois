package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, int nbVillageoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVilageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 1 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		} else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}

	public void afficherVillageois() {
		System.out.println(
				"Dans le village \"" + nom + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");

		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
}
