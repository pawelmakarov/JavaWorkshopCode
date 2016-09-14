public class TVi {
    private int id;
    private static int serial = 100500;
    private static int total;

    TVi() {
        serial += 1;
        total += 1;
        id = serial;
    }
    public int getID() {
        return id;
    }
    public static int getTotal() {
        return total;
    }
    public String toString() {
        return "ID: " + getID() + " / Total:" + getTotal();
    }

      public static void main(String[] args) {
        TVi tv1 = new TVi();
        TVi tv2 = new TVi();
        TVi tv3 = new TVi();
        TVi tv4 = new TVi();
        TVi tv5 = new TVi();

        System.out.println(tv1);
        System.out.println(tv3);
    }
}
