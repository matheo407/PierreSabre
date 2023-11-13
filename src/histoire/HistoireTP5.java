package histoire; 
import personnages.*;

public class HistoireTP5 {
    public static void main(String[] args) {
        // Création des personnages
        Commercant marco = new Commercant("Marco", 20);
        Commercant chonin = new Commercant("Chonin", 40);
        Commercant kumi = new Commercant("Kumi", 10);
        Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "Warsong");
        Ronin roro = new Ronin("Roro", 60);
        Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
        Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);

     // Masako tente de faire le gentil sans connaître personne
        masako.faireLeGentil();

        // Rançons par Masako
        masako.ranconner(kumi);
        masako.ranconner(chonin);
        masako.ranconner(marco);

        // Akimoto se présente
        akimoto.direBonjour();

        // Masako se présente
        masako.direBonjour();

        // Tentative de rançon supplémentaire par Masako pour déclencher la ligne "Mince je ne peux plus rançonner..."
        masako.ranconner(new Commercant("Test", 10)); // Commercant fictif pour cette interaction

        // Yaku Le Noir se présente
        yaku.direBonjour();

        // Masako fait connaissance avec Yaku et tente de faire le gentil
        masako.faireConnaissanceAvec(yaku);
        masako.faireLeGentil();

        // Roro se présente
        roro.direBonjour();
    }
}