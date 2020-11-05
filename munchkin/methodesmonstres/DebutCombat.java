package munchkin;
package methodesmonstres;

public class DebutCombat(){
    
    public static void metPitBull(){
        system.out.println("Vous rencontrez Pit Bull. Si vous ne pouvez le vaincre, vous pouvez le distraire (déguerpissez automatiquement)
        en lâchant une baguette, un bâton ou une lance. Va chercher, Médor !");
        system.out.println("Incident Fâcheux : traces de morsures sur vos fesses. Perdez 2 niveaux.");
        return;
    }

    public static void metDragon(){
        system.out.println("Vous rencontrez le Dragon de Plutonium ! Ne poursuit aucun personnage de niveau 5 ou inférieur.");
        system.out.println("Incident Fâcheux : Vous êtes rôti, dévoré et mort.");
        return;
    }

    public static void metGerbo(){
        system.out.println("Vous rencontrez le Gerbosaure. Vous gagnez un niveau supplémentaire si vous le battez seul et sans bonus.");
        system.out.println("Incident Fâcheux : Jet de vomi tiède ! Défaussez toute votre main.");
        return;
    }

    public static void metPoulet(){
        system.out.println("Vous rencontrez un poulet élevé aux Stéroïdes. Frit, c'est délicieux : vous gagnez donc 1 niveau supplémentaire
        instantanément si vous tuez le poulet avec du feu ou des flammes.");
        system.out.println("Incident Fâcheux : Se faire picorer est très douloureux. Vous perdez un niveau");
        return;
    }

    public static void metNonos(){
        system.out.println("Vous rencontrez Mr. Nonos. Si vous devez vous enfuir, vous perdez un niveau même si vous arrivez à déguerpir.");
        system.out.println("Incident Fâcheux : Son contact osseux vous coûte 2 niveaux.");
        return;
    }

    public static void metBelvedere(){
        system.out.println("Vous rencontrez le Belvédère Sauvage. Nul ne peut vous aider. Vous devez affronter seul le Belvédère.");
        system.out.println("Incident Fâcheux : Perdez 3 niveaux");
        return;      
        
        // TO DO : désactiver la possibilité d'aide !!!
    } 

    public static void metLepreux(){
        system.out.println("Vous rencontrez le Lépreuxchaun. Mais il est dégueu ! +5 contre les Elfes");
        system.out.println("Incident Fâcheux : il vous prend 2 objets, choisis par chacun des 2 joueurs qui vous entourent");
        return;

        // TO DO : +5 contre les Elfes 
    }

    public static void metAmazone(){
        system.out.println("Vous rencontrez une Amazone. N'attaque pas les joueurs de sexe féminin, mais se contente de leur donner 1 trésor.");
        system.out.println("Incident Fâcheux : On s'est fait tabasser par une nana ? Lamentez-vous amèrement sur votre fierté de macho. Perdez vos classes.
        Si vous n'avez pas de classe, perdez 3 niveaux.");
        return;
        // TO DO : Si le sexe du joueur est féminin, donner 1 trésor et terminer le combat.
    }

    public static void metMucus(){
        system.out.println("Vous rencontrez un Mucus Baveux. Beeerk ! +4 contre les Elfes.");
        system.out.println("Incident Fâcheux : défaussez les chaussures que vous portez. Vous perdez 1 niveau si vous n'avez pas de chaussures");
        // TO DO : Si le joueur est un Elfe, le mucus a +4 en force de combat.
        return;
    }

    
    public static void metRat(){
        system.out.println("Vous rencontrez le Rat Musclé. Créature de l'enfer. +3 contre les prêtres.");
        system.out.println("Incident Fâcheux : la créature vous passe à tabac : perdez 1 niveau.");
        //TO DO : Si le joueur est un prêtre, le rat a +3.
        return;
    }

    public static void metGolem(){
        system.out.println("Vous rencontrez un Golem Fracassé. Vous pouvez combattre ce Golem complètement défoncé ou vous contenter de lui
        faire coucou et lui laisser son trésor. (Exception : les savoureux halfelins doivent combattre).");
        system.out.println("Incident Fâcheux : Il a la dalle. Il vous mange. Vous êtes mort.");
        return;
    }

    public static void metOct(){
        system.out.println("Vous rencontrez un Octaèdre Gélatineux. +1 pour déguerpir.");
        system.out.println("Incident Fâcheux : Vous lâchez tous vos gros objets");
        return;
    }

    public static void metRepr(){
        system.out.println("Vous rencontrez un Représentant en Assurances ! Votre niveau ne compte pas. Vous le combattez uniquement avec vos bonus");
        system.out.println("Incident Fâcheux : vous souscrivez une assurance. Défaussez pour 1000 pièces d'or d'objets. Si vous n'en avez pas autant, perdez tout ce que vous avez.");
        // TO DO : soustraire le niveau du joueur à sa FDC
    }

    public static void metBigFoot(){
        system.out.println("Vous rencontrez Big Foot, alias Grand-Pied. +3 contre les Nains et les Halfelins.");
        system.out.println("Incident Fâcheux : vous écrase comme une crêpe et vous grignote la tête. Perdez votre couvre-chef");
        // TO DO : Si le joueur est un nain ou un Halfelin, +3 à la FDC.
        
    }

    public static void metBinoc(){
        system.out.println("Vous rencontrez un Binoclard Hurleur. +6 contre les Guerriers.");
        system.out.println("Incident Fâcheux : vous devenez un humain anodin et ennuyeux. Défaussez toute carte de Race ou de Classe que vous avez en jeu.");
        // TO DO : si le joueur est un guerrier, +6 à la FDC
    }
    

    public static void metGrenouilles(){
        system.out.println("Vous rencontrez des Grenouilles Volantes. -1 pour déguerpir");
        system.out.println("Incident Fâcheux : Mais ça mord ! Perdez 2 niveaux.");
        
    }

    public static void metSucc(){
        system.out.println("Vous rencontrez une Succube langue-de-belle-Mère ! Créature de l'enfer. +4 contre les prêtres.
        Vous devez défausser un objet (que vous choisissez) avant le combat.");
        system.out.println("Incident Fâcheux : un baiser vraiment dégoûtant vous coûte 2 niveaux (3 pour les Elfes)");
        //TO DO si le joueur est un prêtre, +4
        //Le joueur doit défausser un objet
    }

    public static void metCheval(){
        system.out.println("Vous rencontrez un Cheval Zombie. +5 contre les Nains");
        system.out.println("Incident Fâcheux : mord, rue, et sent le canasson crevé. Vous perdez 2 niveaux.");
        // TO DO : si le joueur est un Nain, +5

    }

    public static void metEscargot(){
        system.out.println("Vous rencontrez des Escargots sous acide. -2 pour déguerpir");
        system.out.println("Incident Fâcheux : ils volent votre trésor. Le résultat d'un jet de dé indique combien d'objets ou de cartes
        de votre main (vous devez choisir l'un ou l'autre) vous perdez.");
        
    }

    public static void metNez(){
        system.out.println("Vous rencontrez le Nez Flottant. Si vous ne voulez pas combattre Nez Flottant, achetez le avec un obet qui vaut
        au moins 200 pièces d'or. Il vous laissera partir.");
        system.out.println("Incident Fâcheux : il vous suivra partout à l'odeur. Si vous perdez, vous ne pouvez pas fuir, quoi que vous fassiez.
        Perdez 3 niveaux.");
        

    }

    public static void metOrques(){
        system.out.println("Vous rencontrez 3872 Orques. +6 contre les Nains, en raison d'une rancune obscure, certe, mais millénaire.");
        system.out.println("Incident Fâcheux : lancez un dé. Sur un 1 ou 2, ils vous piétinent à mort. Sinon, perdez autant de niveaux qu'indiqué par le dé");
        // TO DO : si le joueur est un nain, +6

    }

    public static void metCephalo(){
        system.out.println("Vous rencontrez Céphalopodzilla ! C'est gluant ! les Elfes combattent à -4 ! Ne poursuivra aucun personnage de niveau
        4 ou inférieur, sauf si c'est un Elfe.");
        system.out.println("Incident Fâcheux : Vous êtes saisi, englué, broyé et avalé. Vous êtes mort, mort, et re-mort. Des questions ?");
        // TO DO : -4 si c'est un elfe
    }

    public static void metHippo(){
        system.out.println("Vous rencontrez un Hippogriffe ! Ne poursuivra aucun personnage de niveau 3 ou inférieur.");
        system.out.println("Incident Fâcheux : vous êtes piétiné et mâché. Vous perdez vos affaires en fuyant. En partant de votre droite,
        chaque joueur peut prendre une carte trésor posée devant vous ou dans votre main (sans regarder)");
        

    }

    public static void metTrol(){
        system.out.println("Vous rencontrez un Trôliste. Il n'a aucun pouvoir spécial, et ça le rend furax.");
        system.out.println("Incident Fâcheux : déséquilibre complètement le jeu en vous forçant à laisser le(s) joueur(s) ayant le plus haut
        niveau à vous prendre (chacun) un objet");

    }

    public static void metHuissier(){
        system.out.println("Vous rencontrez un Huissier. N'attaque pas les voleurs (entre confrères...). Un voleur qui rencontre un huissier peut
        choisir de défausser 2 cartes trésor et en tirer 2 nouvelles, face cachée.");
        system.out.println("Incident Fâcheux : Confiscation des biens ! Chacun des autres joueurs prend une carte dans votre main, en commençant par le joueur à votre gauche.
        Défaussez les cartes restantes.");
        //TO DO : tout ce qu'il se passe si le joueur est un voleur.

    }

    public static void metBalrog(){
        system.out.println("Vous rencontrez un Balrog Charolais ! Ne poursuit aucun personnage de niveau 4 ou inférieur.");
        system.out.println("Incident Fâcheux : vous êtes fouetté jusqu'à ce que mort s'ensuive. Et mort s'ensuit.");
        
    }

    public static void metManti(){
        system.out.println("Vous rencontrez une manticornithorynque. Résiste à la magie. +6 contre les Magiciens");
        system.out.println("Incident Fâcheux : défaussez toute votre main ou perdez 2 niveaux.");
        //TO DO : +6 contre magiciens.

    }

    public static void metGobelin(){
        system.out.println("Vous rencontrez un Gobelin estropié. +1 au jet pour déguerpir");
        system.out.println("Incident Fâcheux : Il vous met un coup de béquille en traitre. Vous perdez 1 niveau.");
        

    }

    public static void metPlante(){
        system.out.println("Vous rencontrez une Plante d'Ornement. Les Elfes tirent une carte trésor supplémentaire après l'avoir vaincue");
        system.out.println("Incident Fâcheux : rien du tout... Si vous devez déguerpir, vous réussissez automatiquement.");
       

    }

    public static void metFan(){
        system.out.println("Vous rencontrez un Fan de Vampire. Au lieu de le Combattre, un Prêtre peut chasser le Fan de Vampire en criant simplement <<bouga bouga !>>
        et s'emparer de son trésor. Dans ce cas il ne gagne aucun niveau");
        system.out.println("Incident Fâcheux : il verrouille la porte et vous parle longuement de son personnage. Perdez 3 niveaux");
        // TO DO : le truc avec le prêtre.

    }

    public static void metCroph(){
        system.out.println("Vous rencontrez René Crophage et Fils, Dépanneurs en Chirurgie ! Ne poursuivront aucun personnage de niveau 3 ou inférieur.
        Les personnages de niveau supérieur perdent 2 niveaux, même s'ils réussissent à déguerpir."):
        system.out.println("Incident Fâcheux : ils vous font une vidange des fluides vitaux. Vous retombez au niveau 1");
       

    }

    public static void metMorph(){
        system.out.println("Vous rencontrez des morpions. Impossible de déguerpir !");
        system.out.println("Incident Fâcheux : défaussez votre armure et tous les objets portés sous la ceinture");
        

    }

    public static void metHarp(){
        system.out.println("Vous rencontrez des Harpies(tes). Résitent à la magie. +5 contre les Magiciens.");
        system.out.println("Incident Fâcheux : elles jouent vraiment comme des manches. Perdez 2 niveaux.");
    }

    public static void metSus(){
        system.out.println("Vous rencontrez un Suceur de Tête ! C'est Dégueu ! +6 contre les Elfes.");
        system.out.println("Incident Fâcheux : quand il vous arrache le visage, votre Couvre-chef part avec ! Défaussez tout Couvre-chef porté et
        perdez un niveau.");

    }

    public static void metTut(){
        system.out.println("Vous rencontrez Tut-Tuuut-Ankh-Ammon ! Ne poursuit aucun personnage de niveau  ou inférieur. Les autres perdent 2 niveaux,
        même s'ils réussissent à déguerpir");
        system.out.println("Incident Fâcheux : perdez tous vos objets et toutes les cartes de votre main.");
        
    }

    public static void metHorreur(){
        system.out.println("Vous rencontrez une Horreur Non-Euclidienne Indicible ! +4 contre les guerriers.");
        system.out.println("Incident Fâcheux : si vous n'êtes pas magicien, une mort indicible et apocalyptiquement horrible vous attend.
        Sinon, vous ne perdez que vos pouvoirs. défaussez votre carte de Magicien.");

    }

    public static void metVampsires(){
        system.out.println("Vous rencontrez des Vamps...ires !?! Pour les combattres, vous ne pouvez utiliser aucun objet ni bonus! Vous ne pouvez
        utiliser que votre niveau.");
        system.out.println("Incident Fâcheux : Votre niveau devient équivalent à celui du joueur de plus bas niveau");
        // TO DO : Desactiver les bonus dans la FDC
    }


}

