package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public Boolean resterPotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		this.quantitePotion -= 1;
		if (!(this.resterPotion())) {
			this.forcePotion = 0;
		}
		return this.forcePotion;
	}
}