public class CercleDansLePlan {
    private double rayon;
    private Point centre;


    public CercleDansLePlan(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    public CercleDansLePlan(){
        this(1, new Point(0, 0));
    }

    public CercleDansLePlan(Point centre){
        this(1,centre);
    }



    public double getRayon() {
        return rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public String toString() {
        return "Le rayon est de "+rayon+" et les coordonnées du centre sont "+ centre;
    }
}
