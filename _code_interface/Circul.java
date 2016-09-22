public class Circul extends Rectangle implements Shape {
    private String color;

    public Circul() {
        this("Red");
    }

    public Circul(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getClass().getName() + " Color: " 
        + getColor() + " and Perimeter from base class: " + super.getPerimeter();
    }
}
