package munchkin;

import java.util.ArrayList;

public class Hand {
    //attribut
    private int nombreCartes;
    private ArrayList <Carte> listeCarte=new ArrayList <Carte>();


    //constructeur
    public Hand(int numberCard, ArrayList <Carte> listCard){
        nombreCartes=numberCard;
        listeCarte=listCard;
    }

    //methodes

    public void getCard(){

    }
    
    public void dropCard(){

    }
}
