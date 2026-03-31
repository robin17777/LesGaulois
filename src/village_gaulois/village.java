package village_gaulois;

import personnages.Gaulois;

public class village {
	private String nom;
	private int nbVillageois;
	private Gaulois chef;
	private Gaulois [] tab;
	
	public village(String nom, Gaulois chef,int nbMax) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.nbVillageois=1;
		this.tab=new Gaulois[nbMax];
		this.tab[0]=chef;
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
		}
	
	public Gaulois getChef() {
		return chef;
		}
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois<=this.nbVillageois) {
			return tab[numVillageois-1];
		}
		else {
			System.out.print("il y a moins de gaulois que ca dans la liste des habitant de ce merveilleux village que nous venont de constituer durant cette double heures de tp de ilu1 le 17 mars 2025");
			return null;
		}
	}
	
		
	public void ajouterVillageois(Gaulois gaulois) {
		gaulois.setVillage(this);
		this.tab[this.nbVillageois]=gaulois;
		nbVillageois++;
	}
	public void afficherVillageois() {
		System.out.println("Dans le village "+ this.nom+" du chef "+this.chef+"\r\n"
				+ "vivent les légendaires gaulois :");
		for (int i=1 ; i < this.nbVillageois;i++) {
			System.out.print(this.tab[i].getNom());
			System.out.print("\n");
		}
	}

	
	public static void main(String[] args) {
		Gaulois Abraracourcix =new Gaulois("abraracourcix",6);
		village village = new village("village des irréductibles",Abraracourcix,30);
		village.trouverVillageois(30);
		Gaulois Asterix =new Gaulois("asterix",8);
		village.ajouterVillageois(Asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		 System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		 System.out.println(gaulois);
		 village.afficherVillageois();
		 Abraracourcix.sepresenter();
		 Asterix.sepresenter();
	}
	
	
	
}
