public class ColorPoint extends Point {
    private StringBuffer color = new StringBuffer();

    ColorPoint() {
        super();
        color.append("White");
    }
    ColorPoint(double x, double y, String newColor) {
        // implementation
    }
    public String getColor() {
        return color.toString();
    }
    public boolean equals(ColorPoint cp) {
        // implementation
    }
    public String toString() {
        // implementation
    }

    public static void main(String[] args) {
        ColorPoint a = new ColorPoint(2.1, 4.1, "Black");
        ColorPoint b = new ColorPoint();

        System.out.println("ColorPoint a: " + a);
        System.out.println("ColorPoint b: " + b);

        System.out.println(a.equals(b));
    }

}