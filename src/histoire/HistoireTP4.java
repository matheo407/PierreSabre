package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
    public static void main(String[] args) {
        // Création de l'objet Prof de type Humain
        Humain prof = new Humain("Prof", "kombucha", 54);

        // Scénario
        prof.direBonjour();
        prof.acheter("boisson", 12);
        prof.boire();
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", 30, "Warsong");
        yakuLeNoir.direBonjour();
        yakuLeNoir.dire("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        yakuLeNoir.dire("Marco, si tu tiens à la vie donne moi ta bourse !");
        yakuLeNoir.extorquer(marco); 
        Ronin roro = new Ronin("Roro", 60);
        roro.direBonjour();
        roro.donner(marco); 
        roro.provoquer(yakuLeNoir);
    }
}
