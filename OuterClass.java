class OuterClass {
    private int value = 42;

    // Creating instance of inner class and calling inner class function
    public void createInner() {
        InnerClass innerClass = new InnerClass();
        innerClass.getValue();
    }

    // inner class declarataion
    private class InnerClass {
        // private int value = 24;
        
        public void getValue() {
        // accessing private variable from outer class
            System.out.println("value of value: " + value);
        }
    }

    public static void main(String[] args) {
        // Creating outer class instance
        OuterClass outerclass = new OuterClass();
        
        // Creating inner class instance
        OuterClass.InnerClass innerclass = outerclass.new InnerClass();

        // Classing inner class method
        innerclass.getValue();
    }
}
