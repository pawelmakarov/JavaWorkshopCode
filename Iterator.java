public class Iterator {
    private int first;
    private int step;
    private int index;

    public Iterator(int first, int step, int index) {
        this.first = first;
        this.step = step;
        this.index = index;
    }
    public void next() {
        if ( over() ) {
            return;
        }
        first += step;
        index -= 1;
    }
    public void prev() {
        if ( over() ) {
            return;
        }
        first -= step;
        index -= 1;
    }
    public boolean over() {
        return index == 0;
    }
    public int value() {
        return first;
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