package objects;

public interface Player {

    int getHealthPoint();

    int getMaxHealthPoint();

    void move(String direction);

    int attacked(Player attacker, int attachPower, int attackZone);


}
