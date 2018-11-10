package objects;

public class Wizard implements Hero {

    public int getHealthPoint() {
        return 0;
    }

    public int getMaxHealthPoint() {
        return 0;
    }

    public void move(String direction) {
        System.out.println("Wizard moved to " + direction);

    }

    public int attacked(Player attacker, int attachPower, int attackZone) {
        return 0;
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
