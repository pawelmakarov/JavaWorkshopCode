public class Polymorphism2 {

    public Polymorphism2() {}

    public String toString() {
        return this.getClass().getName();
    }

    public static void main(String [] args) {
        Object object  = new Polymorphism2();

        System.out.println(object);
    }
}


