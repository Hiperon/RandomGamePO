package marcin.dohnalik.studia;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Game2 extends Game {
    private final int ZAKRESLOSOWANIA = 60;
    private final int ILOSCLOSOWAN = 8;
    final ScheduledExecutorService executorService;
    public Game2(){
        this.setName("Game2");
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(this::runGame, 0, 1, TimeUnit.SECONDS);
    }
    public void runGame() {
        int[] resultGame2;
        GameEngine engine2 = new GameEngine();
        resultGame2 = engine2.getRandomReturn(ZAKRESLOSOWANIA, ILOSCLOSOWAN);
        this.updateGameResult(resultGame2);
    }

}
