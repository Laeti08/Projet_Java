package jeu;

import java.util.ArrayList;

public class Joueur{

    //attributs
    private int numero;
    public String nom;
    public String sexe;
    public int niveau;
    public int forceCombat;
    ArrayList <Equipement> equipement=new ArrayList<Equipement>;
    private int chanceFuite;
    public String couleur;
    private String [] main;

    //constructeur
    public Joueur(int n, String name,String s, int level, int fC,int cF, String c,String [] m){
        numero=n;
        nom=name;
        sexe=s;
        niveau=level;
        forceCombat=fC;
        chanceFuite=cF;
        couleur=c;
        main=m;
    }

}