public abstract class Shape {
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

    public abstract double getPerimeter();
}
