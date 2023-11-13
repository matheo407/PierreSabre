package personnages;

public class Samourai extends Ronin {
    private String seigneur;

    public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
        super(nom, argent); // Un samouraï est un ronin avec un seigneur
        this.seigneur = seigneur;
        this.boissonFavorite = boissonFavorite; // Boisson favorite peut être différente pour un samouraï
    }

    @Override
    public void direBonjour() {
        super.direBonjour(); // Appelle d'abord la méthode de Ronin/Humain
        parler("Je suis fier de servir le seigneur " + seigneur + ".");
    }

    public void boire(String boisson) {
        parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
    }
}