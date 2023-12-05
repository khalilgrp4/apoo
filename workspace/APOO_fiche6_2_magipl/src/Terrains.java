public class Terrains extends Carte{

    private final static char[] COULEURAUTORISEES = {'B','b','n','r','v'};

    private char couleur;
    private final static char COULEURPARDEFAUT = 'i';

    public Terrains(int cout, char couleur) {
        super(cout);
        this.couleur = couleur;

        for (char couleurautorisee : COULEURAUTORISEES) {
            if (couleurautorisee == couleur) {
                this.couleur = couleurautorisee;
                break;
            }
        }
    }
}
