public class CompteEnBanque {

    private Personne titulaire;
    private Date datevaliditecdd;
    private String numero;
    private Date dateouverture;
    private double solde;

    public CompteEnBanque(Personne nTitulaire, Date nDateValiditeCdd, String nNumero, Date nDateOuverture, double nSolde) {
        titulaire = nTitulaire;
        datevaliditecdd = nDateValiditeCdd;
        numero = nNumero;
        dateouverture = nDateOuverture;
        solde = nSolde;

    }


    public Personne getTitulaire() {
        return titulaire;
    }

    public Date getDatevaliditecdd() {
        return datevaliditecdd;
    }

    public String getNumero() {
        return numero;
    }

    public Date getDateouverture() {
        return dateouverture;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "le numero de compte est "+numero +" au nom de " +  titulaire.getNom() + titulaire.getPrenom() + " à la date du " + dateouverture +" avec comme montant : " + solde +" euros.";
    }

    public void setDatevaliditecdd(Date datevaliditecdd) {
        this.datevaliditecdd = datevaliditecdd;
    }

    public boolean retirermontant(double montant) {
        if (solde > montant) {
            return true;
        } else {
            return false;
        }

    }

    public boolean deposermontant(double montant) {

        if (montant>0) {
            solde+=montant ;
            return true;

        }
        else {
            return false;
        }
    }

    public boolean fairevirement(double montant, CompteEnBanque compteEnBanque) {
        if ((solde == solde - montant) && (compteEnBanque.getSolde() == compteEnBanque.getSolde() + solde)) {
            return true;

        }
        else {
            return false;

        }
    }

}