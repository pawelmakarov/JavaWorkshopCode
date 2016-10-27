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
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double distance(Point other) {
        return hypot(this.x-other.x, this.y-other.y); 
    }

    public boolean equals(Point other) {
        // implementation
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
