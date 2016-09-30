public class CMain {

    public static void main(String[] args) throws Throwable {
        Point point = new Point(4.4, 5.5);
        Car car1 = new Car();
        Car car2 = new Car("BMW", 60, 30, 3.8, point);

        System.out.println(car1 + "\n");
        System.out.println(car2 + "\n");

        car1.goAuto(point);
        System.out.println(car1 + "\n");

        car1.tank(36);
        System.out.println(car1 + "\n");

        car1.upgradeMaxCapacity(120);
        car1.upgradeConsumption(21);
        System.out.println("MaxCapacity: " + car1.getMaxCapacity());
        System.out.println(car1 + "\n");
    }
}