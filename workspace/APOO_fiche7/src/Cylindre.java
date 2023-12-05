import java.util.Objects;

public class Cylindre implements Solide{
    private double rayon;
    private double hauteur;

    public Cylindre(double rayon, double hauteur) {
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double calculerVolume() {
        double volume = Math.PI*rayon*rayon*hauteur;
        return volume;
    }

    @Override
    public double calculerSurface() {
        double surface = 2*Math.PI*(rayon*rayon)+2*Math.PI*rayon*hauteur;
        return surface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylindre cylindre = (Cylindre) o;
        return Double.compare(rayon, cylindre.rayon) == 0 && Double.compare(hauteur, cylindre.hauteur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon, hauteur);
    }

    @Override
    public String toString() {
        return "Cylindre de rayon "+rayon+" et de hauteur "+hauteur;
    }

}
