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

    //Ajout le nombre de carte choisi à la main du joueur
    public void getCard(Carte card, int nombreCartePiocher){
        nombreCartes=nombreCartes+nombreCartePiocher;
        listeCarte.add(card);
    }
    

    //Retire le nombre de carte choisi de la main du joueur
    public void dropCard(Carte card, int nombreCarteRetirer){
        nombreCartes=nombreCartes+nombreCarteRetirer;
        listeCarte.remove(card);
    }

    //Verifie le nombre de carte presente dans la main du joueur
    public void verifCard(){
        int deleteCard=0;
        if (numberCard.size()>5){
            deleteCard=numberCard.size()-5;
            dropCard(card,deleteCard);

        }

    }
}
