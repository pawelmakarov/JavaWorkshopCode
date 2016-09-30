import static java.lang.Math.hypot;

public class Point extends Object {
    private double x;
    private double y;

    Point() {
        this.x = 0;
        this.y = 0;
    }
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point other) {
        return hypot(x-other.x, y-other.y); 
    }

    public boolean equals(Point other) {
        return x == other.x && y == other.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
