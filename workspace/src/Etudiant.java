public class Etudiant {

    private String numeroMatricule, nom, prenom;
    private Serie serie;

    public Etudiant(String numeroMatricule, String nom , String prenom){
        this.numeroMatricule = numeroMatricule;
        this.nom = nom;
        this.prenom = prenom;

    }

    public String getNumeroMatricule() {
        return numeroMatricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return nom+" "+prenom+" "+numeroMatricule+" ";
    }

    public boolean changerSerie(Serie serie){
        if (serie==null){
            return false;
        }
        if (serie==this.serie){
            return false;
        }
        if (this.serie.getDelegue()==this){
            return false;
        }
        return true;
    }
}
