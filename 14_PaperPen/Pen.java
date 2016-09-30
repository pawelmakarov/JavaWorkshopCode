public class Pen {
    public int currentCapacity;
    public int maxCapacity;
    public Paper paper;

    Pen() {
        this.currentCapacity = 0;
        this.maxCapacity = 30;
        this.paper = new Paper();
    }
    Pen(Paper paper, int maxCapacity) {
        // implementation
    }
    
    public void write(Paper paper, String message) throws Throwable {
        // implementation
    }

    public void refill(int ink) throws Throwable {
          // implementation
    }

    public String toString() {
        return  "Current capacity of ink: " + getCurrentCapacity();
    }
     public int getCurrentCapacity() {
        return currentCapacity;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
}
