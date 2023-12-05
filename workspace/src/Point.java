public class Point {
    private double x;
    private double y;

    public Point(double nX, double nY) {
        x = nX;
        y = nY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return("(" + x + ","+ y + ")");
    }
}
