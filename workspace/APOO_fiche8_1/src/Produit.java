public abstract class Produit {
    private String titre;
    private String reference;
    private double prix;

    public Produit(String titre, String reference, double prix) {
        this.titre = titre;
        this.reference = reference;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public String getReference() {
        return reference;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
