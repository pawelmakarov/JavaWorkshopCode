public class B {
    
    // private A circularDependence = null;
    private String myName = null;

    public B () {
        // circularDependence = new A();
        this.myName = "I'm B class";
    }

    private String getMyName() {
        return this.myName;
    }
}
