package marcin.dohnalik.studia;

public class IPhoneDevices extends Devices {

    private String firstName;
    private String phoneNumber;
    private String appleID;

    public IPhoneDevices(String firstName, String phoneNumber, String appleID) {
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
        this.appleID=appleID;
    }

    public void notify(Game game) {
        System.out.println("IPhone (" + firstName + "): " + game.getGameName() + " has result: "+ game.getGameResult());
    }
}
