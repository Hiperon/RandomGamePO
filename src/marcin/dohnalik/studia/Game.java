package marcin.dohnalik.studia;

public class Game {
	Engine engine = new Engine();
	int test = engine.getRandomReturn(10);

	@Override
	public String toString() {
		return "Game{" +
				"test=" + test +
				'}';
	}

	private String Observers;

	public void sendResults() {
		// TODO - implement Game.sendResults
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(new Game());
		}
	}
}

