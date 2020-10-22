package munchkin;

import java.util.Random;

public class Plateau{

    //attributs
    public String player;
    public int pile;
    public int slots;
    public int roundNumber;
    public String roundPhase;
    public String activePlayer;

    
    //constructeur
    public Plateau(Joueur joueurs,int pioches,int emplacements, String joueurActif){
        player = joueurs;
        pile = pioches;
        slots = emplacements;
        activePlayer = joueurActif;

    }

    //méthodes
    
    public void display(){

    }


    public void startTour(){

    }

    public void ouverture(){

    }

    public void noCombat(){

    }

    public void phaseCombat(){

    }

    public void modifJoueur(){

    }

    public int de(){

        Random jet = new Random();
        return jet.nextInt(6)+1;
    }

    public void echange(){

    }

    public void endTour(){

    }

    public void chngementJoueurActif(){

    }

    public void chngementPhase(){

    }

    public void tourSuivant(){

    }
}