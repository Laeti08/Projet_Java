package munchkin;

import java.util.Map;

public class Monstre extends Carte {
    
    int combatForce;
    int treasures;
    int levels;
    Map<String,Integer> preFleeEffect;
    Map<String,Integer> postFleeEffect;
    boolean mortVivant;

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
        nom+="Vamps...ires!?!";
        forceDeCombat+=8;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;

    }

    public void metHorreur(){
        nom+="Horreur_non_euclidienne_Indicible";
        forceDeCombat+=14;
        nombreNiveaux+=1;
        nombreTresors+=4;
        mortVivant=true;
    }

    public void metTut(){
        nom+="Tut_Tuuut_Ankh_Ammon";
        forceDeCombat+=16;
        nombreNiveaux+=2;
        nombreTresors+=4;
        mortVivant=true;
    }

    public void metSus(){
        nom+="Suceur_de_tete";
        forceDeCombat+=8;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metHarp(){
        nom+="Harpies(tes)";
        forceDeCombat+=4;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metMorp(){
        nom+="Morpions";
        forceDeCombat+=1;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metCroph(){
        nom+="Rene_Crophage_et_fils";
        forceDeCombat+=16;
        nombreNiveaux+=2;
        nombreTresors+=4;
        mortVivant=true;
    }

    public void metFan(){
        nom+="Fan_de_vampire";
        forceDeCombat+=12;
        nombreNiveaux+=1;
        nombreTresors+=3;
        mortVivant=false;
    }

    public void metPlante(){
        nom+="Plante_d'ornement";
        forceDeCombat+=1;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metGobelin(){
        nom+="Gobelin_estropie";
        forceDeCombat+=1;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metManti(){
        nom+="Manticornithorynque";
        forceDeCombat+=6;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metBalrog(){
        nom+="Balrog_charolais";
        forceDeCombat+=12;
        nombreNiveaux+=2;
        nombreTresors+=5;
        mortVivant=false;
    }

    public void metHuissier(){
        nom+="Huissier";
        forceDeCombat+=6;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metTrol(){
        nom+="Troliste";
        forceDeCombat+=10;
        nombreNiveaux+=1;
        nombreTresors+=3;
        mortVivant=false;
    }

    public void metHippo(){
        nom+="Hippogriffe";
        forceDeCombat+=16;
        nombreNiveaux+=2;
        nombreTresors+=4;
        mortVivant=false;
    }

    public void metCephalo(){
        nom+="Cephalopodzilla";
        forceDeCombat+=18;
        nombreNiveaux+=2;
        nombreTresors+=4;
        mortVivant=false;
    }

    public void metOrques(){
        nom+="3872_orques";
        forceDeCombat+=10;
        nombreNiveaux+=1;
        nombreTresors+=3;
        mortVivant=false;
    }

    public void metNez(){
        nom+="Nez_flottant";
        forceDeCombat+=10;
        nombreNiveaux+=1;
        nombreTresors+=3;
        mortVivant=false;
    }

    public void metEscargot(){
        nom+="Escargots_sous_acide";
        forceDeCombat+=4;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metCheval(){
        nom+="Cheval_zombie";
        forceDeCombat+=4;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=true;
    }

    public void metSucc(){
        nom+="Succube_langue_de_belle_mere";
        forceDeCombat+=12;
        nombreNiveaux+=1;
        nombreTresors+=3;
        mortVivant=false;
    }

    public void metGrenouilles(){
        nom+="Grenouilles_volantes";
        forceDeCombat+=2;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metBinoc(){
        nom+="Binoclard_hurleur";
        forceDeCombat+=6;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metBigFoot(){
        nom+="Bigfoot_alias_grand-pied";
        forceDeCombat+=12;
        nombreNiveaux+=1;
        nombreTresors+=3;
        mortVivant=false;
    }

    public void metRepr(){
        nom+="Representant_en_assurances";
        forceDeCombat+=14;
        nombreNiveaux+=1;
        nombreTresors+=4;
        mortVivant=false;
    }

    public void metOct(){
        nom+="Octaedre_gelatineux";
        forceDeCombat+=2;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metGolem(){
        nom+="Golem_Fracasse0;"
        forceDeCombat+=14;
        nombreNiveaux+=1;
        nombreTresors+=4;
        mortVivant=false;
    }

    public void metRat(){
        nom+="Rat_muscle";
        forceDeCombat+=1;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metMucus(){
        nom+="Mucus_baveux";
        forceDeCombat+=1;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metAmazone(){
        nom+="Amazone";
        forceDeCombat+=8;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metLepreux(){
        nom+="LepreuxChaun";
        forceDeCombat+=4;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metBelvedere(){
        nom+="Belvedere_sauvage";
        forceDeCombat+=8;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metNonos(){
        nom+="Mr._Nonos";
        forceDeCombat+=2;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=true;
    }

    public void metPoulet(){
        nom+="Poulet";
        forceDeCombat+=2;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }

    public void metGerbo(){
        nom+="Gerbausaure";
        forceDeCombat+=6;
        nombreNiveaux+=1;
        nombreTresors+=2;
        mortVivant=false;
    }

    public void metDragon(){
        nom+="Dragon_de_plutonium";
        forceDeCombat+=20;
        nombreNiveaux+=2;
        nombreTresors+=5;
        mortVivant=false;
    }

    public void metPitBull(){
        nom+="Pit_Bull";
        forceDeCombat+=2;
        nombreNiveaux+=1;
        nombreTresors+=1;
        mortVivant=false;
    }


}
