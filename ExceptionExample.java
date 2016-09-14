import java.io.*;

class ExceptionExample {

    public InputStream fallingBlocks() throws FileNotFoundException {
        String fileName = "./README.txt";
        InputStream inputStream = new FileInputStream(fileName);

        return inputStream;
    }

    public void foo() {
        // doStaff
        try {
            fallingBlocks();
            System.out.println("It works!!!");
        } catch (FileNotFoundException ee) {
            System.out.println("Handle the exception");
            // Handle the exception
        } finally {
            System.out.println("finally block is always executed. cleanup: closing connection, stream etc.");
            // finally block is always executed
            // cleanup: closing connection, stream etc.
        }
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();

        example.foo();
    }
}




