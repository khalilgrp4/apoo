class Rectangle {
    double largeur;
    double longueur;

    Rectangle(double nLargeur, double nLongueur){
        largeur = nLargeur;
        longueur = nLongueur;
    }
    double calculerAir(){
        double aire = largeur;
        return aire = longueur;
    }
    double calculerPerimetre(){
        double perimetre = (largeur+longueur)/2;
        return perimetre;
    }

    @Override
    public String toString() {
        return "rectangle de longueur " + longueur + " et de largeur "+largeur ;
    }
}

