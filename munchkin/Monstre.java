package munchkin;

import java.util.Map;

public class Monstre extends Carte {
    
    int combatForce;
    int treasures;
    int levels;
    Map<String,Integer> preFleeEffect;
    Map<String,Integer> postFleeEffect;

    public Monstre(String nom, Map<String,Integer> modifsAttributs, String emplacement, String phaseJeu, int valeurOr, int forceDeCombat, int nombreTresors, int nombreNiveaux, Map<String,Integer> effetPreFuite, Map<String,Integer> effetPostFuite) {
        super(nom, modifsAttributs, emplacement, phaseJeu, valeurOr);
        combatForce = forceDeCombat;
        treasures = nombreTresors;
        levels = nombreNiveaux;
        preFleeEffect = effetPreFuite;
        postFleeEffect = effetPostFuite;        
    }

}
