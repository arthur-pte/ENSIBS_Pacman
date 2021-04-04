package Pacman.Logic;

/**
 * Classe représentant la grille de Jeu
 * 
 * @author François JULLION
 */
public class Grille {

    /**
     * Variable représentant le tableau de cases de la grille
     */
    private Case[][] cases;

    /**
     * Variable représentant l'entité Pacman
     */
    private Pacman pac;

    /**
     * Variable représentant l'entité Blinky
     */
    private Blinky blinky;

    /**
     * Variable représentant l'entité Clyde
     */
    private Clyde clide;

    /**
     * Variable représentant l'entité Inky
     */
    private Inky inky;

    /**
     * Variable représentant l'entité Pinky
     */
    private Pinky pinky;

    /**
     * Constructeur de la classe Grille
     * @param c, un tableau 2D de cases
     */
    public Grille(Case[][] c) {
        this.cases = c;
        this.pac = new Pacman();
    }

    /**
     * Permet de récupérer l'entité Pacman présente dans la grille
     * @return l'entité pacman
     */
    public Pacman getPacman() {
        return this.pac;
    }

    /**
     * Permet de récupérer l'entité Pinky présente dans la grille
     * @return l'entité pinky
     */
    public Pinky getPinky() {
        return this.pinky;
    }

    /**
     * Permet de récupérer l'entité Clyde présente dans la grille
     * @return l'entité clyde
     */
    public Clyde getClyde() {
        return this.clide;
    }

    /**
     * Permet de récupérer l'entité Inky présente dans la grille
     * @return l'entité Inky
     */
    public Inky getInky() {
        return this.inky;
    }

    /**
     * Permet de récupérer l'entité Blinky présente dans la grille
     * @return l'entité Blinky
     */
    public Blinky getBlinky() {
        return this.blinky;
    }

    /**
     * Permet de récupérer le tableau 2D de cases
     * @return tableau 2D de cases
     */
    public Case[][] getCases() {
        return this.cases;
    }
}
