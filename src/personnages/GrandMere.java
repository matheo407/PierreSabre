package personnages;
import java.util.Random;

public class GrandMere extends Humain {
    private static final int MAX_MEMOIRE = 5;
    private TypeHumain[] types = TypeHumain.values();
    private Random random = new Random();

    // Constructeur de GrandMere
    public GrandMere(String nom, int argent) {
        super(nom, "tisane", argent); // Appelle le constructeur de Humain avec "tisane" comme boisson favorite
    }

    @Override
    protected void memoriser(Humain humain) {
        if (connaissances.size() < MAX_MEMOIRE) {
            super.memoriser(humain);
        } else {
            parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
        }
    }

    private String humainHasard() {
        int index = random.nextInt(types.length);
        return types[index].toString();
    }

    public void ragoter() {
        for (Humain connaissance : connaissances) {
            if (connaissance instanceof Traitre) {
                parler("Oh, je sens que " + connaissance.getNom() + " est un traître !");
            } else {
                parler("Je me demande si " + connaissance.getNom() + " est un(e) " + humainHasard() + "...");
            }
        }
    }

    // Redéfinition de la méthode boire pour que GrandMere ne boive que de la tisane
    @Override
    public void boire() {
        parler("Mmmm, un bon verre de tisane ! GLOUPS !");
    }

    // Énuméré pour les types de personnages
    private enum TypeHumain {
        COMMERCANT,
        RONIN,
        SAMOURAI,
        TRAITRE,
        HABITANT // Pour un Humain ordinaire
    }
}
