package marcin.dohnalik.studia;

import java.util.ArrayList;
import java.util.Random;

public class GameEngine {
    private ArrayList<Integer> randomReturn = new ArrayList<Integer>();
    private Random random;

    public GameEngine() {
        this.random = new Random();
    }

    public int[] getRandomReturn(int howBigRandomInt, int howMuchInts) {
        for (int i = 0; i < howMuchInts; i++) {
            this.randomReturn.add(this.random.nextInt(howBigRandomInt));
        }
        int[] randomArrayInt = randomReturn.stream().mapToInt(i->i).toArray();
        return (randomArrayInt);
    }
}
