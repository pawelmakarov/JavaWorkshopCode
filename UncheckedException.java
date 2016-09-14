public class UncheckedException {
    public static void main(String args[]) {
        String arr[] = {"Google", "Yahoo", "Amazon", "eBay" };
        String myString = crunchifyArr[4];  //This throws ArrayIndexOutOfBoundException()

        String fileName = null;             //This throws NullPointerException()

        int x = 10 / 0;                     //This throws ArithmeticException()

        Object object = Integer.valueOf(42);
        String value = (String)object;      //This throws ClassCastException.
    }
}


