package marcin.dohnalik.studia;

public class AndroidDevices extends Devices {

    /* 1) Zmieniłam wszędzie phone number na String, normalnie tak się je przechowuje bo często zawierają znaki specjalne (+, -) a poza tym nie podlegają działaniom matematycznym ani innym operacjom.
    Operacje na numerach telefonu to zwykle operacje tekstowe jak np dodawanie country code z przodu lub usuwanie go, wyciąganie prefixu odpowiadającego za miasto etc.
    A poza tym mogą mieć zero na początku

    2) Refaktorowałam firstName na login bo będzie bardziej reprezentatywny
    */

    private String login;
    private String phoneNumber;

    public AndroidDevices(String login, String phoneNumber) {
        this.login = login;
        this.phoneNumber=phoneNumber;
    }

    public void notify(Game game) {
        System.out.println("Android (" + login + "): " + game.getGameName() + " has result: "+ game.getGameResult());
    }
}
