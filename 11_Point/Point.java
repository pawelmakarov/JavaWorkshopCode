public class Point {
    public double x = 0;
    public double y = 0;

    public Point() {}

    public boolean equals(Point other) {
        // implementation
    }

    public double distance(Point other) {
        return Math.hypot(x-other.x, y-other.y);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(3, 4);
        // Point c = a;

        // c.x = 42;

        System.out.println(a);
        System.out.println(a.distance(b));

        if ( a.equals(b) ) {
            System.out.println("Equals");
        } else {
            System.out.println("Unequals");
        }
    }
}
