package marcin.dohnalik.studia;
import java.util.Random;
public class Engine{
	private int randomReturn;
	private Random random;

	public Engine() {
		this.random = new Random();
		randomReturn = -1;
	}

	public int getRandomReturn(int howBig) {
		return (randomReturn = this.random.nextInt(howBig));
	}

}