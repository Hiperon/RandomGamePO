package marcin.dohnalik.studia;

public class IPhoneDevices extends Devices {

    private String firstName;
    private int phoneNumber;

    public IPhoneDevices(String firstName, int phoneNumber) {
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    public void notify(Game game) {
        System.out.println("IPhone (" + firstName + "): " + game.getGameName() + " has result: "+ game.getGameResult());
    }
}
