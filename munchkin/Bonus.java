package munchkin;

import java.util.Map;

public class Bonus extends Carte {

    //attribut 
    public int possiblePhase;
    
    //constructeur
    public Bonus(String nom, Map<String, Integer> modifsAttributs, String emplacement, String phaseJeu, int valeurOr,int phasePossible) {
        super(nom, modifsAttributs, emplacement, phaseJeu, valeurOr);
        possiblePhase=phasePossible;
    }
    

    //methode

    
}
