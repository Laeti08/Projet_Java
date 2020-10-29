package munchkin;

import java.util.ArrayList;
import munchkin.Carte;

public class Pioches {

    //attributs
    protected ArrayList<Carte> piocheTresors = new ArrayList<Carte>();
    protected ArrayList<Carte> piochePorte=new ArrayList <Carte>();
    protected ArrayList<Carte> defausseTresors=new ArrayList <Carte>();
    protected ArrayList<Carte> defaussePorte=new ArrayList <Carte>();

    //constructeur
    public Pioches(ArrayList<Carte> pTresors,ArrayList<Carte> pPorte, ArrayList<Carte> dTresors, ArrayList<Carte> dPorte){
        piocheTresors=pTresors;
        piochePorte=pPorte;
        defausseTresors=dTresors;
        defaussePorte=dPorte;

    }


    //methodes

    //Remplissages des pioches
    public void setPioche(){
        
    
    }

    //Piocher une carte porte
    public void getCardPorte(card){
        if (phaseJeu=debutTour){
            card=pPorte.get(0);
            pPorte.remove(0);
        }
    }

    //Piocher une carte trésors
    public void getCardTresors(card,int nbCard){
        for(int i=0;i<nbCard;i++){
            
            card=pTresors.get(i);
            pTresors.remove(i);
            
        }
        
    }

    
}
