public class Article {

    private String reference ,nom ,description;
    private double prixHTVA ,tauxTVA;

    public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA){
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = tauxTVA;
    }

    public Article(String reference, String nom, String description, double prixHTVA){
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        tauxTVA = 21;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrixHTVA() {
        return prixHTVA;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrixHTVA(double prixHTVA) {
        this.prixHTVA = prixHTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    @Override
    public String toString() {
        return nom +"\n"+"Reference : "+reference;
    }

    public double calculerPrixTVAComprise(){
        return (prixHTVA*((tauxTVA+100)/100));
    }

    public double calculerPrixTVAComprise(int reduction){
        return (prixHTVA*((tauxTVA+100)/100)*(100-reduction)/100);
    }
}
