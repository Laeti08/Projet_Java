package munchkin;

import java.util.Map;

public class Malediction extends Carte {
    //attribut 
    public int possiblePhase;


    //constructeur

    public Malediction(String nom, Map<String,Integer> modifsAttributs, String emplacement, String phaseJeu, int valeurOr, int forceDeCombat, int nombreTresors, int nombreNiveaux, Map<String,Integer> effetPreFuite, Map<String,Integer> effetPostFuite,int phasePossible) {
        super(nom, modifsAttributs, emplacement, phaseJeu, valeurOr);
         possiblePhase=phasePossible;   
    }

    //methodes

    public void metPerteNiveau(int nombreAPerdre){
        //le joueur perd le nombre de niveau indiqué
        //il y a 2 cartes de perte de 1 niveau
    }

    public void metCanard(){
        //le joueur perd 2 niveaux
    }

    public void metGrossePerte(){
        //le joueur choisi un gros objet à défausser
    }

    public void metPetitePerte(){
        //le joueur choisit un petit objet à défausser. Tout ce qui n'est pas gros est petit.
        //Il y a 2 petites pertes dans le paquet
    }

    public void metPerteChaussures(){
        //le joueur perd ses chaussures s'il en a
    }

    public void metPerteChapeau(){
        //le joueur perd son couvre-chef
    } 

    public void metPerteArmure(){
        //le joueur perd son armure
    }

    public void metTropInjuste(){
        //le joueur perd l'objet qui lui donne le plus gros bonus
    }

    public void metChangementRace(){
        //sans effet si le joueur n'a pas de race. Sinon, il parcours les cartes de la défausses (à l'envers donc) et prend la première race qu'il trouve
        //Si la défausse n'a pas de race, il perd sa race.
        //Si le joueur avait la carte "sang mêlé" en jeu, cette dernière est défaussée
    }

    public void metCommunMortel(){
        //le joueur perd sa race. Si il avait sang mêlé, il la perd aussi
    }

    public void metChangementClasse(){
        //pareil que changement race mais pour la classe
    }

    public void declasse(){
        //le joueur perd sa classe. si il a super Munchkin, elle est aussi perdue
    }

    public void metImpotRevenu(){
        //Le joueur défausse un objet de son choix. Chaque joueur doit défausser un ou des objets pour une valeur supérieure ou égale
        //Si un joueur ne peut pas, il perd tous ses objets ainsi que 1 niveau
    }

    public void metpouletSurLaTete(){
        //-1 à tous les jets de dé. Tout ce qui fait perdre le couvre chef (malédiction ou incident fâcheux) retire aussi le poulet.
    }

    public void metMirroirPerfide(){
        //Au prochain combat uniquement, le joueur ne peut compter sur aucun bonus à part son armure.
        //Si le joueur utilise un anneau de souhait AVANT son prochain combat, la malédiction est levée
    }

    public void metChangSexe(){
        // le joueur change de sexe de façon permanente.
        //il subit -5 à son prochain combat
    }

    public void metPerte2Cartes(){
        //le joueur à gauche de la victime prend une carte, puis le joueur à sa droite fait de même
    }

}
