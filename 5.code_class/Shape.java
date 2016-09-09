public class Shape {
    private String color;

    public Shape() {
        this("Red");
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String [] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(shape.getColor());
    }
}
