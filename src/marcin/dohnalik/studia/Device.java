package marcin.dohnalik.studia;

public abstract class Device {

	private int id;
	private int selectedNotify;

	public abstract void fillRegistrationForm();

	public void notifyDevice(int gameId) {
		if(selectedNotify == gameId) System.out.println("Device" + this.id + " has been notified!");
	}

	public void followGame(int gameId) {
		selectedNotify = gameId;
	}

}