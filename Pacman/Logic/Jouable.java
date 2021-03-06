package Pacman.Logic;

/**
 * Classe représentant une case Jouable de la grille
 * 
 * @author François JULLION
 */
public class Jouable extends Case implements ICase{
    /**
     * Variable représentant l'objet présent dans la case
     */
    private Objet objet;

    /**
     * Constructeur de la classe Jouable
     */
    public Jouable() {
        this.objet = null;
    }

    /**
     * Permet de récupérer l'objet présent dans la case Jouable
     * @return l'objet de la case
     */
    public Objet getObjet() {
        return this.objet;
    }

    /**
     * Permet de définir l'objet présent dans la case Jouable
     * @param o, un objet
     * @pre o != null
     */
    public void setObjet(Objet o) {
        this.objet = o;
    }

    /**
     * Permet de supprimer l'objet présent dans la case Jouable
     */
    public void deleteObjet() {
        this.objet = null;
    }
}
