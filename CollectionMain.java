import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {
        Collection<Object> list = new ArrayList<>();
        // Collection<Object> list = new LinkedList<>();

        list.add(new Object());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.hashCode());
    }
}
