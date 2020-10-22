package munchkin;

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
    private String [] main;

    //constructeur
    public Joueur(int numbers, String name,String sex, int level, int fightingForce, ArrayList <Carte> equipment, int chanceEscape,String [] hand){
        numero=numbers;
        nom=name;
        sexe=sex;
        niveau=level;
        forceCombat=fightingForce;
        equipement=equipment;
        chanceFuite=chanceEscape;
        main=hand;
    }

}