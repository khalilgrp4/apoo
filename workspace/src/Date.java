public class Date {
    private int annee, mois, jour;

    public Date(int nJour, int nMois,int nAnnee ){
        annee = nAnnee;
        mois = nMois;
        jour = nJour;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return jour + "/" + mois+ "/" + annee;
    }
}
