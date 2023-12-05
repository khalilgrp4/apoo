import java.util.Objects;

public class Cube implements Solide{
    private double cote;

    public Cube(double arrete) {
        this.cote = arrete;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public double calculerVolume() {
        double volume = cote * cote * cote;
        return volume;
    }

    @Override
    public double calculerSurface() {
        double surface = 6*(cote * cote);
        return surface;
    }

    @Override
    public String toString() {
        return "Cube de côté "+cote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cote, cube.cote) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }
}
