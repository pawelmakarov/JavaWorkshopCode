public class Car extends Object {
    private String mark; 
    private int maxCapacity;
    private int currentAmount;
    private double consumption;
    private Point location;

    Car() {}

    Car(String mark, int maxCapacity, int currentAmount, 
        double consumption, Point point) {
        // implementation
    }
    public void goAuto(Point point) throws Throwable {
        // implementation
    }
    public void tank(int litres) throws ToMuchOfPetrol {
        // implementation
    }
    public void upgradeMaxCapacity(int litre) {
        // implementation
    }
    public void upgradeConsumption(double newConsumption) {
        // implementation
    }

    public String toString() {
        return "Mark: " + getMark() + "\n" + "Location: " + getLocation() + "\n" + "Consumption: " + getConsumption() + "\n" + "Pertol: " + getCurrentAmount();
    }
    public String getMark() {
        return mark;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public int getCurrentAmount() {
        return currentAmount;
    }
    public double getConsumption() {
        return consumption;
    }
    public Point getLocation() {
        return location;
    }
}
