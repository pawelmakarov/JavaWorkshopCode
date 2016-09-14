public class Rectangle extends Shape {
    
    private final double width;
    private final double length;

    public Rectangle() {
        this(1, 1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return this.getClass().getName() + " Color: " 
        + getColor() + " and Perimeter " + getPerimeter();
    }
}
