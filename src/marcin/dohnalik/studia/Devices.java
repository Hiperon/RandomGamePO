package marcin.dohnalik.studia;

import java.util.Arrays;

public class Devices implements IObserver {


    @Override
    public void notify(Game game) {
        System.out.println("Wynikiem gry: " + game.getGameName() + " jest: " + Arrays.toString(game.getGameResult()));
    }
}
