public class Iterator {
    private int first;
    private int step;
    private int index;

    public Iterator(int first, int step, int index) {
        // implementation
    }
    public void next() {
        // implementation
    }
    public void prev() {
        // implementation
    }
    public boolean over() {
        // implementation
    }
    public int value() {
        // implementation
    }

    public static void main(String[] args) {
        Iterator iterator = new Iterator(10, 2, 4);

        // for ( ; !iterator.over(); iterator.next() ) {
        //     System.out.println(iterator.value());
        // }

        for ( ; !iterator.over(); iterator.prev() ) {
            System.out.println(iterator.value());
        }
    }
}