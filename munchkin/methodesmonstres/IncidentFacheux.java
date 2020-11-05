package munchkin;
package methodesmonstres;

public class IncidentFacheux(){

    public static void metPitBull(){
        //-2 niveaux
        Joueur.niveau-=2;
    }

    public static void metDragon(){
        //mort
    }

    public static void metGerbo(){
        //perte de toute la main.
    }

    public static void metPoulet(){
        //-1 niveau
        Joueur.niveau-=1;
    }

    public static void metNonos(){
        // -2 niveaux
        Joueur.niveau-=2;
    }

    public static void metBelvedere(){
        //-3 niveaux
        Joueur.niveau-=3;
    } 

    public static void metLepreux(){
        //chacun des joueurs qui entourent choisissent un objet à défausser 
    }

    public static void metAmazone(){
        //perte des classes. Si pas de Classe, -3 niveaux
        if (Joueur.Classe==empty){
            Joueur.niveau-=3;
        }
        else{

        }
        
    }

    public static void metMucus(){
       //perte des chaussures. Si pas de chaussures, -1 niveau
       if (){
        Joueur.niveau-=1;
    }
    else{
        
    }
    }

    public static void metRat(){
        //-1 niveau
        Joueur.niveau-=1;
    }

    public static void metGolem(){
        //Mort
    }

    public static void metOct(){
        //perte de tous les gros objets
    }

    public static void metRepr(){
        //défausser pour 1000 PO d'objets. Si pas possible, perdez tout ce que vous avez.
    }

    public static void metBigFoot(){
        //perte du couvre-chef
    }

    public static void metBinoc(){
        // Perte de Classe et Race
    }

    public static void metGrenouilles(){
        //-2 niveaux
        Joueur.niveau-=2;
    }

    public static void metSucc(){
        //-2 niveaux (3 pour les elfes)
        if(Joueur.race=="Elfe"){
            Joueur.niveau-=3;
        }
        else{
            Joueur.niveau-=2;
        }
    }

    public static void metCheval(){
        // -2 niveaux
        Joueur.niveau-=2;
    }

    public static void metEscargot(){
        // perte d'un nombre d'objets portés ou dans la main (au choix) indiqué par un jet de dé
    }

    public static void metNez(){
        //-3 niveaux
        //fuite impossible pour tout le reste du jeu (sauf sur utilisation de la potion de mauvaise haleine)
    }

    public static void metOrques(){
        //jet de dés : mort sur 1 ou 2, perte du nombre de niveau indiqué par le dé sinon
        int lancer=de();
        if (lancer==1 || lancer==2){

        }
        else{
            Joueur.niveau-=lancer;
        }

    }

    public static void metCephalo(){
        //mort
    }

    public static void metHippo(){
        //En partant de la droite, chaque joueur peut prendre une carte trésor devant soi ou dans la main sans regarder
    }

    public static void metTrol(){
        // joueurs de plus haut niveau prennent chacun un objet
    }

    public static void metHuissier(){
        //chaque joueur en commençant par celui à gauche prend une carte dans la main. Les autres sont défaussées.
    }

    public static void metBalrog(){
        //mort
    }

    public static void metManti(){
        //choix : perdre 2 niveaux ou perte de toute la main
    }

    public static void metGobelin(){
        //-1 niveau
        Joueur.niveau-=1;
    }

    public static void metPlante(){
        return;
    }

    public static void metFan(){
        // -3 niveaux
        Joueur.niveau-=3;
    }

    public static void metCroph(){
        // niveau = 1
        Joueur.niveau==1;
    }

    public static void metMorph(){
        //perte de tous les objets portés sous la ceinture et de l'armure
    }

    public static void metHarp(){
        //-2 niveaux
        Joueur.niveau-=2;
    }

    public static void metSus(){
        //-1 niveau
        Joueur.niveau-=1;
        //perte du couvre-chef
    }

    public static void metTut(){
        //perte de tous les objets et toutes les cartes en main
    }
    
    public static void metHorreur(){
        //mort si pas magicien
        //perte de magicien si magicien
    }

    public static void metVampsires(){
        // niveau = joueur de plus bas niveau
    }
}