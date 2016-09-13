public class B {
    
    private A dependence = null;
    private String myName = null;

    public B () {
        dependence = new A();
        myName = "I'm B class";
    }

    private String getMyName() {
        return myName;
    }
}
