package jeu;

public class Plateau{

    //attributs
    public String joueurs;
    public int pioches;
    public int emplacements;
    public int numeroTour;
    public String phaseTour;
    public String joueurActif;


    //constructeur
    public Plateau(String j,int p,int e, int nT, String pT, String jA){
        joueurs=j;
        pioches=p;
        emplacements=e;
        numeroTour=nT;
        phaseTour=pT;
        joueurActif=jA;

    }

    //méthodes
    public display(){

    }


    public startTour(){

    }

    public ouverture(){

    }

    public noCombat(){

    }

    public phaseCombat(){

    }

    public modifJoueur(){

    }

    public de(){

    }

    public echange(){

    }

    public endTour(){

    }

    public chngementJoueurActif(){

    }

    public chngementPhase(){

    }

    public tourSuivant(){

    }
}