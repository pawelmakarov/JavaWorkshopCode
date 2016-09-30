public class Mohigan {
    private int selfId;
    private static int id = 100500;
    private static Mohigan last;

    public Mohigan() {
        // implementation
    }
    public int getID() {
        // implementation
    }
    public static Mohigan getLast() {
        // implementation
    }
    public String toString() {
        return "selfId: " + getID() + " / Last: " + getLast().getID();
    }

     public static void main(String[] args) {
        Mohigan mohigan1 = new Mohigan();
        Mohigan mohigan2 = new Mohigan();
        Mohigan mohigan3 = new Mohigan();
        Mohigan mohigan4 = new Mohigan();
        Mohigan mohigan5 = new Mohigan();
        Mohigan mohigan6 = new Mohigan();
        Mohigan mohigan7 = new Mohigan();

        System.out.println(mohigan2);
        System.out.println(mohigan4);
        System.out.println(mohigan6);
        System.out.println(mohigan7);
    }
}
