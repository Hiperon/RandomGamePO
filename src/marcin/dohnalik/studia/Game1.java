package marcin.dohnalik.studia;

public class Game1 extends Game {
	private int[] score = {0};
	//TODO can i move scores to Game

	public Game1() {
		this.score[0] = engine.getRandomReturn(100);
	}

	public int[] getScore() {
		return this.score;
	}

}