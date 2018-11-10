import generics.GenericPlayerHolder;
import objects.Enemy;
import objects.Hero;
import objects.Wizard;
import objects.Wolf;

public class Main {

    public static void main(String[] args) {

        GenericPlayerHolder<Hero> playerHolder = new GenericPlayerHolder<>(new Wizard());
        playerHolder.getPlayer().sayHello();
        playerHolder.getPlayer().move("North");





    }
}
