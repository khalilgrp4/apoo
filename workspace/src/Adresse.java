public class Adresse {

    private String rue, numero, codePostal, ville;

    public Adresse(String nRue, String nNumero, String nCodepostal, String nVille) {
        rue = nRue;
        numero = nNumero;
        codePostal = nCodepostal;
        ville = nVille;

    }

    public String getRue() {
        return rue;
    }

    public String getNumero() {
        return numero;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    @Override
    public String toString() {
        return rue + "," + numero + " " + codePostal + " " + ville;
    }
}
