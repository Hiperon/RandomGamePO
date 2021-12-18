package marcin.dohnalik.studia;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Game1 extends Game {
    private final int ZAKRESLOSOWANIA = 50;
    private final int ILOSCLOSOWAN = 6;
    final ScheduledExecutorService executorService;

    public Game1(){
        this.setName("Game1");
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(this::runGame, 0, 2687, TimeUnit.MILLISECONDS);
    }

    public void runGame() {
        int[] resultGame1;
        GameEngine engine1 = new GameEngine();
        resultGame1 = engine1.getRandomReturn(ZAKRESLOSOWANIA, ILOSCLOSOWAN);
        this.updateGameResult(resultGame1);
    }
}
