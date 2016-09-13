public class HelloWorld {

    public HelloWorld() {
         System.out.println("I'm constructor!");
    }

    public HelloWorld(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(new HelloWorld("Call me!").getWord());

    }

    public String getWord() {
        return "Hello!";
    }
}
