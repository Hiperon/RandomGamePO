package marcin.dohnalik.studia;

import java.util.Arrays;

public class WindowsPhoneDevices extends Devices {

    private String firstName;
    private int phoneNumber;

    public WindowsPhoneDevices(String firstName, int phoneNumber) {
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    public void notify(Game game) {
        System.out.println("WindowsPhone (" + firstName + "): " + game.getGameName() + " has result: "+ Arrays.toString(game.getGameResult()));
    }
}
