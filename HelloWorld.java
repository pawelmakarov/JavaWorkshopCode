public class HelloWorld {

    public HelloWorld() {
         System.out.println("I'm constructor!");
    }

    public HelloWorld(String text) {
        System.out.println(text);
    }

    public String getWord() {
        return "Hello!";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().getWord());
        
        System.out.println(new HelloWorld("Call me!").getWord());
    }
}
