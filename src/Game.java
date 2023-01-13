import utils.InputParser;

import java.util.ArrayList;

public class Game {
    private final InputParser inputParser;

    public Game(InputParser inputParser){
        this.inputParser = inputParser;

        ArrayList<Joueurs> joueur = new ArrayList<Joueurs>();
    }

    public void start() throws InterruptedException {
        Cartes pierre = new Cartes_Bleues("Pierre");
        Cartes Brique = new Cartes_Grises("Brique");
        Joueurs Sofiane = new Joueurs("Sofiane");

        Sofiane.affichecartes();
        Sofiane.getCarte(pierre);
        Sofiane.affichecartes();
        Sofiane.getCarte(Brique);
        Sofiane.affichecartes();
        System.out.println(Sofiane.wonder.nom);
    }
}
