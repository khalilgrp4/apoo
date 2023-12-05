public class Biere extends BoissonAlcoolisee{
    private boolean pression;

    public Biere(String nom, int contenance, double prix, double degreAlcool, boolean pression) {
        super(nom, contenance, prix, degreAlcool);
        this.pression = pression;
    }

    public boolean isPression() {
        return pression;
    }

    @Override
    public String toString() {
        if (isPression()){
            return "Bière pression : "+getNom()+" ("+getContenance()+" cl)"+" à "+getPrix()+" euros (degré d'alcool : "+ getDegreAlcool()+"°)";
        }
        return "Bière en bouteille : "+getNom()+" ("+getContenance()+" cl)"+" à "+getPrix()+" euros (degré d'alcool : "+ getDegreAlcool()+"°)";

    }

}
