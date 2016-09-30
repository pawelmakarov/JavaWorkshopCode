public class A {
    
    private B circularDependence = null;
    private String myName = null;

    public A () {
        this.circularDependence = new B();   
        this.myName = "I'm A class";
    }

    private String getMyName() {
        return this.myName;
    }

    public static void main(String[] args) {
        A aClass = new A();

        System.out.println(aClass.getMyName());
    }
}
