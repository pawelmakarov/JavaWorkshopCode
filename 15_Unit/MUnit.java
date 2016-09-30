public class MUnit {

    public static void main(String[] args) throws Throwable {
        Unit unit1 = new Unit();
        Unit unit2 = new Unit(20, 5);

        System.out.print("Current Hit Points of first Unit: ");
        System.out.println(unit1.getHitPoints());

        System.out.print("If dead the second Unit: ");
        System.out.println(unit2.isDead());

        unit1.doAttack(unit2);

        System.out.print("Current Hit Points of second Unit: ");
        System.out.println(unit2.getHitPoints());

        System.out.print("If dead the second Unit: ");
        System.out.println(unit2.ifDead());
    }
}