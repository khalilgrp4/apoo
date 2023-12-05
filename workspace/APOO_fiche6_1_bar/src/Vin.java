public class Vin extends BoissonAlcoolisee{
    private final static String[] COULEURAUTORISEES = {"Rouge","Blanc","Rosé"};
    private String cepage;
    private String couleur;
    private String region;
    private String paysOrigine;

    public Vin(String nom, int contenance, double prix, double degreAlcool, String cepage, String couleur, String region, String paysOrigine) {
        super(nom, contenance, prix, degreAlcool);
        this.cepage = cepage;
        this.couleur = couleur;
        this.region = region;
        this.paysOrigine = paysOrigine;

        for (String couleurautorisee : COULEURAUTORISEES) {
            if (couleurautorisee.equals(couleur)){
                this.couleur = couleurautorisee;
                break;
            }

        }
        if (this.couleur == null){
            throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
        }


    }

    public String getCepage() {
        return cepage;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getRegion() {
        return region;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    @Override
    public String toString() {
        return "Vin "+getCouleur()+" : "+getNom()+" ("+getContenance()+" cl)"+" à "+getPrix()+" euros (degré d'alcool :"+getDegreAlcool()+"°)"+"\n"+"Cépage : "+getCepage()+"\n"+"Origine : "+ getRegion() +" - "+getPaysOrigine();
    }
}
