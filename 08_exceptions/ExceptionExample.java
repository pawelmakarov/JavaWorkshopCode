import java.io.*;

class ExceptionExample {

    public InputStream fallingBlocks() throws FileNotFoundException {
        String fileName = "./_README.txt";
        InputStream inputStream = new FileInputStream(fileName);
        return inputStream;
    }

    public void foo() {
        // doStaff
        try {
            fallingBlocks();
            System.out.println("It works!!!");
        } catch (FileNotFoundException ee) {
            System.out.println("Handle the exception: " +  ee);
            // Handle the exception
        } finally {
            System.out.println("finally block is always executed. cleanup: closing connection, stream etc.");
            // finally block is always executed
            // cleanup: closing connection, stream etc.
        }
    }

    public static void main(String[] args) {
        new ExceptionExample().foo();
    }
}


