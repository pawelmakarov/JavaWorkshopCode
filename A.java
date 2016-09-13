public class A {
    
    private B dependence = null;
    private String myName = null;

    public A () {
        dependence = new B();   
        myName = "I'm A class";
    }

    private String getMyName() {
        return myName;
    }

    public static void main(String[] args) {
        A aClass = new A();

        System.out.println(aClass.getMyName());
    }
}
