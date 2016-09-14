public class Iterator_ {
    private int first;
    private int step;
    private int index;

    public Iterator_(int first, int step, int index);
    public void next();
    public void prev();
    public boolean over();
    public int value();

    public static void main(String[] args) {
        Iterator_ iterator = new Iterator_(10, 2, 4);

        for ( ; !iterator.over(); iterator.next() ) {
            System.out.println(iterator.value());
        }

        for ( ; !iterator.over(); iterator.prev() ) {
            System.out.println(iterator.value());
        }
    }
}