 public class Triangle implements Shape {

    private final double a, b, c; //sides
    private String color;

    public Triangle() {
        this(1, 1, 1);
    }
    public Triangle(double a, 
                    double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = "Green";
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getClass().getName() + " Color: " 
        + getColor() + " and Perimeter :" + getPerimeter();
    }
}
