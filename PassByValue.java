public class PassByValue {
    private int x = 5;

    public PassByValue () {
    }

    public void incrementInt(int y) {
        // pass a COPY of x (the value 5) to the doStuff method
        System.out.println("x has value of " + y);
        y += 15;
        System.out.println("x has value of " + y);
    }

    private class InnerClass {
        int x = 8;

        public int getValue() {
            return x;
        }
        public void setValue(int value) {
            x = value;
        }
    }

    public static void main(String[] args) {
        PassByValue object = new PassByValue();
        int z = 15;

        // object.incrementInt(z);
        // System.out.println("z has value of " + z);

        PassByValue.InnerClass innerClassOne = object.new InnerClass();
        PassByValue.InnerClass innerClassTwo = innerClassOne;
        
        System.out.println("innerClassOne: " + innerClassOne.getValue() 
            + " / hashCode: " + innerClassOne.hashCode());
        System.out.println("innerClassTwo: " + innerClassTwo.getValue() 
            + " / hashCode: " + innerClassTwo.hashCode());

        innerClassOne.setValue(42);
        
        System.out.println("innerClassOne: " + innerClassOne.getValue());
        System.out.println("innerClassTwo: " + innerClassTwo.getValue());
    }
}
