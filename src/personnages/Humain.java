package personnages;

import java.util.ArrayList;

public class Humain {
    private String nom;
    protected String boissonFavorite;
    private int argent;
    private static final int MAX_CONNAISSANCES = 30;
    protected ArrayList<Humain> connaissances = new ArrayList<>();
    private int nbConnaissance = 0;

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
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
            argent -= prix;
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
        }
    }

    public void gagnerArgent(int gain) {
        argent += gain;
    }

    public void perdreArgent(int perte) {
        argent -= perte;
    }

    protected void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public void dire(String texte) {
        parler(texte);
    }
    public void faireConnaissanceAvec(Humain autreHumain) {
        direBonjour();
        memoriser(autreHumain);
        autreHumain.repondre(this);
        autreHumain.memoriser(this);
    }

    protected void memoriser(Humain humain) {
        if (nbConnaissance == MAX_CONNAISSANCES) {
            connaissances.remove(0); // Oublie la première connaissance
        } else {
            nbConnaissance++;
        }
        connaissances.add(humain);
    }

    private void repondre(Humain humain) {
        direBonjour();
    }
    public void listerConnaissance() {
        StringBuilder sb = new StringBuilder();
        sb.append("Je connais beaucoup de monde dont : ");

        for (int i = 0; i < connaissances.size(); i++) {
            sb.append(connaissances.get(i).getNom());
            if (i < connaissances.size() - 1) {
                sb.append(", ");
            }
        }

        dire(sb.toString());
    }
}