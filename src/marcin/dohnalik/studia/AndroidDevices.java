package marcin.dohnalik.studia;

public class AndroidDevices extends Devices {

    private String firstName;
    private int phoneNumber;

    public AndroidDevices(String firstName,int phoneNumber) {
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    public void notify(Game game) {
        System.out.println("Android (" + firstName + "): " + game.getGameName() + " has result: "+ game.getGameResult());
    }
}
