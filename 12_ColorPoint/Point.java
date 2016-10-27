public class Point {
    public double x = 0;
    public double y = 0;

    public Point() {}

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point other) {
         // implementation
    }

    public double distance(Point other) {
        return Math.hypot(x-other.x, y-other.y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
