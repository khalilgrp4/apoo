import java.util.Objects;

public class Sphere implements Solide{

    private double rayon;

    @Override
    public double calculerVolume() {
        double volume = 4*Math.PI*(rayon*rayon*rayon)/3;
        return volume;
    }

    @Override
    public double calculerSurface() {
        double surface = 4*Math.PI*(rayon*rayon);
        return surface;
    }

    public Sphere(double rayon) {
        this.rayon = rayon;

    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(rayon, sphere.rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }

    @Override
    public String toString() {
        return "Sphère de rayon "+rayon;
    }
}
