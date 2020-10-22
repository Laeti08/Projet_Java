package munchkin;

public class Malediction extends Carte {
    //attribut 
    public int possiblePhase;


    //constructeur

    public Race(String nom, Map<String,Integer> modifsAttributs, String emplacement, String phaseJeu, int valeurOr, int forceDeCombat, int nombreTresors, int nombreNiveaux, Map<String,Integer> effetPreFuite, Map<String,Integer> effetPostFuite,int phasePossible) {
        super(nom, modifsAttributs, emplacement, phaseJeu, valeurOr);
         possiblePhase=phasePossible;   
    }

    //methode
}
