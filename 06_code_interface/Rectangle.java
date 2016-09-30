public class Rectangle implements Shape {
    private String color;

    public Rectangle() {
        this.color = "White";
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getClass().getName() + " Color: " + getColor();
    }
}
