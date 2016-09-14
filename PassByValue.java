public class PassByValue {
    int x = 5; 

    public PassByValue () {
    }

    void incrementInt(int x) {
        // pass a COPY of x (the value 5) to the doStuff method
        System.out.println("x has value of " + x);
        x += 5;
        System.out.println("x has value of " + x);
    }

    private class InnerClass {
        int x = 5;

        public int getValue() {
            return x;
        }
        public void setValue(int value) {
            this.x = value;
        }
    }

    public static void main(String[] args) {
        PassByValue object = new PassByValue();
        
        int y = 5;
        object.incrementInt(y);
        System.out.println("y has value of " + y);

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
