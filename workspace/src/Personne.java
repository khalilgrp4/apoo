public class Personne {
    private String nom, prenom;
    private Date dateDeNaissance;
    private Adresse domicile;

    public Personne(String nNom, String nPrenom, Date nDateDeNaissance , Adresse nDomicile) {
        nom = nNom;
        prenom = nPrenom;
        dateDeNaissance = nDateDeNaissance;
        domicile = nDomicile;
    }

    public int calculerAge(){
        int age = 2023 - dateDeNaissance.getAnnee();
        return age;
    }

    public int calculerAgeEn(int an){
        return (an - dateDeNaissance.getAnnee());
    }

    public void demenager(String nRue, String nNumero, String nCodePostal, String nVille) {
        domicile = new Adresse(nRue, nNumero, nCodePostal, nVille);

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getDomicile(){
        return domicile;
    }
    public Date getDateDeNaissance(){
        return dateDeNaissance;
    }

    @Override
    public String toString() {
        return nom + " " + prenom +" né le "+ dateDeNaissance.toString() + " domicilié au " + domicile.toString();
    }
}
