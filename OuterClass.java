class OuterClass {
    private int value = 42;

    // Creating instance of inner class and calling inner class function
    public void createInner() {
        InnerClass innerClass = new InnerClass();
        innerClass.getValue();
    }

    public int getValue() {
        // accessing private variable from outer class
        return this.value;
    }

    // inner class declarataion
    private class InnerClass {
        private int value = 24;
        
        public int getValue() {
        // accessing private variable from outer class
            return value;
        }
    }

    public static void main(String[] args) {
        // Creating outer class instance
        OuterClass outerclass = new OuterClass();

        System.out.println("value of value: " +  outerclass.getValue());
        
        // Creating inner class instance
        OuterClass.InnerClass innerclass = outerclass.new InnerClass();

        // Classing inner class method
        System.out.println("value of value: " +  innerclass.getValue());
    }
}
