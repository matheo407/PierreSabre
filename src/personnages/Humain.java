package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    // Constructeur
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    // Accesseurs en lecture
    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    // Méthodes
    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " à " + prix + " sous");
            argent -= prix;
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
        }
    }

    public void gagnerArgent(int gain) {
        argent += gain;
    }

    public void perdreArgent(int perte) {
        argent -= perte;
    }

    private void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public void dire(String texte) {
        parler(texte);
    }
}
