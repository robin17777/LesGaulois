package personnages;

import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements;
    private int nbEquipement = 0;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        this.equipements = new Equipement[2]; // ✅ correction importante
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }

    public void recevoirCoup(int forceCoup) {
        this.force -= forceCoup;
        if (this.force < 1) {
            this.parler("J'abandonne");
        } else {
            this.parler("aie");
        }
    }

    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {

            case 2:
                afficher("est déjà bien protégé !");
                break;

            case 1:
                if (equipements[0] == equipement) {
                    afficher("possède déjà un " + equipement.toString().toLowerCase() + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;

            case 0:
                ajouterEquipement(equipement);
                break;
        }
    }

    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        afficher("s'équipe avec un " + equipement.toString().toLowerCase() + ".");
    }

    private void afficher(String message) {
        System.out.println("Le soldat " + nom + " " + message);
    }

    public static void main(String[] args) {
        Romain r1 = new Romain("Cesar", 100);
        Romain minus = new Romain("Minus", 100);

        r1.parler("bonjour");

        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }
}