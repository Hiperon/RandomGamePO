package marcin.dohnalik.studia;

public class Game2 extends Game {
	private int[] score = {0,0,0};
	//TODO table initialization by unknow number of parameters

	public Game2() {
		for(int i = 0; i < 3; i++){
			this.score[i] = engine.getRandomReturn((i+2)*10);
		}
	}

	public int[] getScore() {
		return this.score;
	}

	public static void main(String[] args) {
		Game2 game = new Game2();
		int[] test = game.getScore();
		for (int number:test) {
			System.out.println("test wynik = " + number);
		}
	}

}