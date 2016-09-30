public class Paper {
    private int maxAmount;
    private int currentAmount;
    private StringBuffer content = new StringBuffer();

    Paper() {
        this.maxAmount = 50;
        this.currentAmount = 0;
    }

    Paper(int maxAmount) {
        // implementation
    }
    
    public void addContent(String message) throws Throwable {
        // implementation
    }
    public void show() {
        System.out.println("Text on paper: " + content.toString());
    }

    public int getMaxAmount() {
        return maxAmount;
    }
    public int currentAmount() {
        return currentAmount;
    }
}
