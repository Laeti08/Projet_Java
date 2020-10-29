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

    //Methodes

    public void metVampsires(){

    }

    public void metHorreur(){
        
    }

    public void metTut(){
        
    }

    public void metSus(){
        
    }

    public void metHarp(){
        
    }

    public void metMorp(){
        
    }

    public void metCroph(){
        
    }

    public void metFan(){
        
    }

    public void metPlante(){
        
    }

    public void metGobelin(){
        
    }

    public void metManti(){
        
    }

    public void metBalrog(){
        
    }

    public void metHuissier(){
        
    }

    public void metTrol(){
        
    }

    public void metHippo(){
        
    }

    public void metCephalo(){
        
    }

    public void metOrques(){
        
    }

    public void metNez(){
        
    }

    public void metEscargot(){
        
    }

    public void metCheval(){
        
    }

    public void metSucc(){
        
    }

    public void metGrenouilles(){
        
    }

    public void metBinoc(){
        
    }

    public void metBigFoot(){
        
    }

    public void metRepr(){
        
    }

    public void metOct(){
        
    }

    public void metGolem(){
        
    }

    public void metRat(){
        
    }

    public void metMucus(){
        
    }

    public void metAmazone(){
        
    }

    public void metLepreux(){
        
    }

    public void metBelvedere(){
        
    }

    public void metNonos(){
        
    }

    public void metPoulet(){
        
    }

    public void metGerbo(){
        
    }

    public void metDragon(){
        
    }

    public void metPitBull(){
        
    }


}
