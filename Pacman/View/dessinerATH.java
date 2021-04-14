package Pacman.View;

import java.awt.Graphics2D;
import Pacman.Data.DataForView;
import Pacman.Logic.EDirection;
import Pacman.Logic.Partie;

public class dessinerATH {

    // Le score, les vies ainsi que le GAME OVER ou READY
    public static void dessiner(Partie partie, Graphics2D g2d, DataForView data, Boolean inGame) {
        dessinerVies(partie, g2d, data);
        dessinerEtatPartie(partie, g2d, data, inGame);
        dessinerNiveau(partie, g2d, data);
    }

    private static void dessinerVies(Partie partie, Graphics2D g2d, DataForView data) {
        for (int i = 1; i <= partie.getVies(); i++) {
            g2d.drawImage(data.getPacmanSprites(EDirection.OUEST)[0], 18 * i, 278, null);
        }
    }

    /**
     * Affiche les éléments "READY" et "GAME OVER".
     * 
     * @param partie
     * @param g2d
     * @param data
     */
    private static void dessinerEtatPartie(Partie partie, Graphics2D g2d, DataForView data, Boolean inGame) {
        if (!inGame) {
            g2d.drawImage(data.getRGOSprite()[0], 89, 164, null);
        }
    }

    private static void dessinerScore(Partie partie, Graphics2D g2d, DataForView data) {
        // En haut de l'écran.
    }

    /**
     * Affiche le niveau actuel sous forme de fruits.
     * 
     * @param partie objet Partie permettant de récupérer le niveau actuel.
     * @param g2d    objet Graphics2D permettant de mettre à jour les sprites.
     * @param data   permet de récuperer les sprites depuis Data.
     */
    private static void dessinerNiveau(Partie partie, Graphics2D g2d, DataForView data) {
        switch (partie.getNiveau()) {
        case 1:
            g2d.drawImage(data.getFruitSprites()[0], 192, 278, null);
            break;
        case 2:
            g2d.drawImage(data.getFruitSprites()[0], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[1], 177, 278, null);
            break;
        case 3:
            g2d.drawImage(data.getFruitSprites()[0], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[1], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 165, 278, null);
            break;
        case 4:
            g2d.drawImage(data.getFruitSprites()[0], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[1], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 153, 278, null);
            break;
        case 5:
            g2d.drawImage(data.getFruitSprites()[0], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[1], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 141, 278, null);
            break;
        case 6:
            g2d.drawImage(data.getFruitSprites()[0], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[1], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 129, 278, null);
            break;
        case 7:
            g2d.drawImage(data.getFruitSprites()[1], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 129, 278, null);
            break;
        case 8:
            g2d.drawImage(data.getFruitSprites()[2], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[2], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 129, 278, null);
            break;
        case 9:
            g2d.drawImage(data.getFruitSprites()[2], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 129, 278, null);
            break;
        case 10:
            g2d.drawImage(data.getFruitSprites()[3], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[3], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 129, 278, null);
            break;
        case 11:
            g2d.drawImage(data.getFruitSprites()[3], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 129, 278, null);
            break;
        case 12:
            g2d.drawImage(data.getFruitSprites()[4], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[4], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 129, 278, null);
            break;
        case 13:
            g2d.drawImage(data.getFruitSprites()[4], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 129, 278, null);
            break;
        case 14:
            g2d.drawImage(data.getFruitSprites()[5], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[5], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 129, 278, null);
            break;
        case 15:
            g2d.drawImage(data.getFruitSprites()[5], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 129, 278, null);
            break;
        case 16:
            g2d.drawImage(data.getFruitSprites()[6], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[6], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 129, 278, null);
            break;
        case 17:
            g2d.drawImage(data.getFruitSprites()[6], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 129, 278, null);
            break;
        default:
            g2d.drawImage(data.getFruitSprites()[7], 192, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 177, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 165, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 153, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 141, 278, null);
            g2d.drawImage(data.getFruitSprites()[7], 129, 278, null);
            break;
        }
    }
}
