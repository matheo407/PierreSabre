package personnages;

public class Ronin extends Humain {
    private int honneur;

    // Constructeur
    public Ronin(String nom, int argent) {
        super(nom, "shochu", argent); // La boisson préférée d'un ronin est le shochu
        this.honneur = 1; // Par défaut, l'honneur est de 1
    }

    // Méthodes
    public void donner(Commercant beneficiaire) {
        int montantDon = getArgent() / 10; // 10% de son argent
        dire("Marco prend ces " + montantDon + " sous.");
        perdreArgent(montantDon);
        beneficiaire.recevoir(montantDon);

    }

    // Accesseurs et mutateurs si nécessaire
    public int getHonneur() {
        return honneur;
    }

    public void setHonneur(int honneur) {
        this.honneur = honneur;
    }
    public void provoquer(Yakuza adversaire) {
        int forceRonin = honneur * 2;
        dire("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        if (forceRonin >= adversaire.getReputation()) {
            dire("Je t’ai eu petit yakusa!");
            int argentGagne = adversaire.perdre();
            gagnerArgent(argentGagne);
            honneur++;
        } else {
            int argentPerdu = getArgent();
            perdreArgent(argentPerdu);
            adversaire.gagner(argentPerdu);
            honneur--;
            dire("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
        }
    }
}