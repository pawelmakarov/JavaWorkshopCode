public class HelloWorld {

    public HelloWorld() {
         System.out.println("I'm constructor!");
    }

    public String getWord() {
        return "HelloWorld!";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().getWord());
    }
}
