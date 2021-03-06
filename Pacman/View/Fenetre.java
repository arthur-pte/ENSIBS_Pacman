package Pacman.View;

import javax.swing.JFrame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import Pacman.Logic.Partie;

/**
 * 
 * La classe Fenetre permet de générer la fenêtre ainsi que ses composants.
 * 
 * @author Arthur Pêtre
 */
public class Fenetre extends JFrame {

    /**
     * Contructeur de la classe.
     * 
     * @param Partie partie actuelle que l'on va représenter.
     */
    public Fenetre(Partie partie) {
        // Echelle par défaut de la fenêtre.
        double scale = 2.0;

        // Création du plateau de jeu (la grille et ses composants).
        Plateau plateau = new Plateau(partie, scale);
        int width = (int) (229 * plateau.getScale());
        int height = (int) (310 * plateau.getScale());

        // Modification de la fenêtre (dimensions, titre etc) ainsi que l'ajout du
        // plateau de jeu.
        add(plateau);
        setSize(width, height);
        setResizable(true);
        setTitle("Pac-man by JULLION - PETRE - SOBOLEWSKI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Lorsque la fenêtre est redimmensionnée on change l'échelle du jeu.
        this.getRootPane().addComponentListener(new ComponentListener() {
            public void componentResized(ComponentEvent e) {
                double height = e.getComponent().getBounds().getHeight();
                plateau.setScale(height / 295.0);
            }

            @Override
            public void componentMoved(ComponentEvent e) {
            }

            @Override
            public void componentShown(ComponentEvent e) {
            }

            @Override
            public void componentHidden(ComponentEvent e) {
            }
        });
    }
}
