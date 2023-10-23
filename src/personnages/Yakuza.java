package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    // Constructeur
    public Yakuza(String nom, int argent, String clan) {
        super(nom, "whisky", argent); // La boisson préférée d'un yakuza est le whisky
        this.clan = clan;
        this.reputation = 0; // Par défaut, la réputation est de 0
    }

    // Méthodes
    public void extorquer(Commercant victime) {
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        dire("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    // Accesseurs et mutateurs si nécessaire
    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        dire("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return argentPerdu;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        dire("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous !");
    }
}
