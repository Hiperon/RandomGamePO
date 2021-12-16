package marcin.dohnalik.studia;

public class BlackBerryDevices extends Devices {

    private String firstName;
    private int phoneNumber;

    public BlackBerryDevices(String firstName, int phoneNumber) {
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    public void notify(Game game) {
        System.out.println("BlackBerry (" + firstName + "): " + game.getGameName() + " has result: "+ game.getGameResult());
    }
}
