package personnages;

public class Traitre extends Samourai {
    private int niveauTraitrise;

    public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
        super(seigneur, nom, boissonFavorite, argent);
        this.niveauTraitrise = 0;
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
    }

    public void ranconner(Commercant commercant) {
        if (niveauTraitrise < 3) {
            int argentRanconner = commercant.getArgent() * 2 / 10;
            parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi " + argentRanconner + " sous ou gare à toi !");
            commercant.perdreArgent(argentRanconner);
            commercant.reagirARancon(this.getNom()); // Ajoutez cette ligne pour que le commerçant réagisse
            this.gagnerArgent(argentRanconner);
            niveauTraitrise++;
        } else {
            parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
        }
    }


    public void faireLeGentil() {
        if (connaissances.size() < 1) {
            parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
        } else {
            int don = getArgent() / 20;
            Humain ami = connaissances.get((int) (Math.random() * connaissances.size()));
            parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom() + ".");
            ami.gagnerArgent(don);
            this.perdreArgent(don);
            if (niveauTraitrise > 0) {
                niveauTraitrise--;
            }
        }
    }
}