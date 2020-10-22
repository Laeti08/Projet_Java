package munchkin;

import java.util.ArrayList;
import java.util.Map;

public class Carte {
    // attributs
    protected String name;
    protected Map<String,Integer> attributeMod;
    protected String slot;
    protected String playPhase;
    protected int goldValue;

    // constructeur

    public Carte(String nom, Map<String,Integer> modifsAttributs, String emplacement, String phaseJeu, int valeurOr){
        name = nom;
        attributeMod = modifsAttributs;
        slot = emplacement;
        playPhase = phaseJeu;
        goldValue = valeurOr;
    }
 
}
