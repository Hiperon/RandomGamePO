package marcin.dohnalik.studia;

import java.util.Arrays;

public class BlackBerryDevices extends Devices {

    private String firstName;
    private String phoneNumber;

    public BlackBerryDevices(String firstName, String phoneNumber) {
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    public void notify(Game game) {
        System.out.println("BlackBerry (" + firstName + "): " + game.getGameName() + " has result: "+ Arrays.toString(game.getGameResult()));
    }
}
