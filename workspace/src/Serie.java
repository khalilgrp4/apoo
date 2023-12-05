public class Serie {
    private char nomSerie;
    private Etudiant delegue;

    public Serie(char nomSerie){
        this.nomSerie = nomSerie;
        this.delegue = null;
    }

    public char getNomSerie() {
        return nomSerie;
    }

    public Etudiant getDelegue() {
        return delegue;
    }

    @Override
    public String toString() {
        if (delegue != null) {
            return delegue.getNom() + delegue.getPrenom() + nomSerie;
        }
        return null;
    }

}
