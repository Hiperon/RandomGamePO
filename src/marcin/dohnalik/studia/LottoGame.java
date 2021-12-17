package marcin.dohnalik.studia;

public class LottoGame {

    public static void main(String[] args) {

        //Create Game
        Game1 game1 = new Game1();
        Game2 game2 = new Game2();

        //Create Observers
        AndroidDevices android1 = new AndroidDevices("Tom", "666-777-333");
        AndroidDevices android2 = new AndroidDevices("Iwona", "666-777-331");
        BlackBerryDevices blackBerry = new BlackBerryDevices("Janusz", "700-700-700");
        IPhoneDevices iPhone = new IPhoneDevices("Anna", "800-800-800", "anna_dziewanna@icloud.com");
        WindowsPhoneDevices windowsPhone = new WindowsPhoneDevices("Ewa", 400-400-400);

        game1.addObserver(android1);
        game1.addObserver(iPhone);
        game1.addObserver(windowsPhone);

        game2.addObserver(android1);
        game2.addObserver(android2);
        game2.addObserver(iPhone);
        game2.addObserver(blackBerry);

        for(int i =0; i<300; i++){
            game1.updateGameResult((int)(Math.random()*101)+1);
            game2.updateGameResult((int)(Math.random()*101)+1);
        }


    }
}
