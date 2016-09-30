public class A {
    public void foo() {
        System.out.println("A class");
    }

    public class B extends A {
        public void foo() {
            System.out.println("B class");
        }
    }

    public class C extends A {
        public void foo() {
            System.out.println("C class");
        }
    }
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A().new B();
        A obj3 = new A().new C();

        obj1.foo();
        obj2.foo();
        obj3.foo();
    }
}
