package munchkin;
import java.util.Map;

public class Equipement extends Carte {

    String size;
    String objectType;
    int occupiedHands;
    

    public Equipement(String nom, Map<String, Integer> modifsAttributs, String emplacement, String phaseJeu,
            int valeurOr, String taille, int nombreDeMains, String typeObjet ) {
        super(nom, modifsAttributs, emplacement, phaseJeu, valeurOr);
        size = taille;
        objectType = typeObjet;
        occupiedHands = nombreDeMains;
    }
   
}
