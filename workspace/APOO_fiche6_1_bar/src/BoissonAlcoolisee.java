public class BoissonAlcoolisee extends Boisson{
    private double degreAlcool;

    public BoissonAlcoolisee(String nom, int contenance, double prix, double degreAlcool) {
        super(nom, contenance, prix);
        this.degreAlcool = degreAlcool;
    }

    public double getDegreAlcool() {
        return degreAlcool;
    }

    @Override
    public String toString() {
        return getNom() + " ("+getContenance()+" cl)"+" à "+getPrix()+" euros ( degré d'alcool : "+ degreAlcool+ "°)";
    }
}
