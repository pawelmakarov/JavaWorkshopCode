public class Polymorphism1 {
    public String color;
    public int size;
    public boolean isVisible;

    public Polymorphism1() {
        this("Red");
    }

    public Polymorphism1(String color) {
        this.color = color;
    }

    public Polymorphism1(String color, int size) {
        this(color);
        this.size = size;
    }

    public Polymorphism1(String color, int size, boolean isVisible) {
        this(color, size);
        this.isVisible = isVisible;
    }


    public static void main(String [] args) {
        // Polymorphism1 poly = new Polymorphism1();
        // Polymorphism1 poly = new Polymorphism1("Blue");
        // Polymorphism1 poly = new Polymorphism1("Blue", 42);
        Polymorphism1 poly = new Polymorphism1("Blue", 42, true);
        
        System.out.println(poly.size);
        System.out.println(poly.color);
        System.out.println(poly.isVisible);
    }
}


