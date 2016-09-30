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
        
        Shape shapeRectangle = new Rectangle();
        Shape shapeTriangle = new Triangle();

        // System.out.println(shapeRectangle.getPerimeter());
        System.out.println(shapeRectangle);
        System.out.println(shapeTriangle);
        System.out.println(shape.getColor());
    }
}
