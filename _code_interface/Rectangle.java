public class Rectangle implements Shape {

    private final double width;
    private final double length;
    private String color;

    public Rectangle() {
        this(1, 1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "Blue";
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getClass().getName() + " Color: " 
        + getColor() + " and Perimeter " + getPerimeter();
    }
}
