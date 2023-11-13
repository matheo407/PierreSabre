package personnages;


public class Commercant extends Humain {
    // Constructeur
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent); // La boisson préférée d'un commerçant est le thé
    }

    // Méthodes
    public int seFaireExtorquer() {
        int argentPerdu = getArgent();
        dire("J’ai tout perdu! Le monde est trop injuste...");
        perdreArgent(argentPerdu); // Utilisation de la méthode perdreArgent de la classe mère
        return argentPerdu;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent); // Utilisation de la méthode gagnerArgent de la classe mère
        dire(argent + " sous ! Je te remercie généreux donateur!");
    }
 // Dans la classe Commercant
    public void reagirARancon(String nomRanconneur) {
        parler("Tout de suite grand " + nomRanconneur + ".");
    }


}
