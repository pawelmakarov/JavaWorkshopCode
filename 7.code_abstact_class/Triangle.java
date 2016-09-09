public class Triangle extends Shape {

    private final double a, b, c; //sides 

    public Triangle() {
        this(1, 1, 1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String toString() {
        return this.getClass().getName() + " Color: " 
        + getColor() + " and Perimeter " + getPerimeter();
    }
}


