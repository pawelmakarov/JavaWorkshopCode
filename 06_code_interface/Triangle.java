 public class Triangle implements Shape {
    private String color;

    public Triangle() {
        this.color = "Black";
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getClass().getName() + " Color: " + getColor();
    }
}
