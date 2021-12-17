package marcin.dohnalik.studia;

import java.util.Scanner;

public class RegistrationAndroid implements IRegistrationForm {
    @Override
    public void register() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please provide login:");
        String login = scanner.nextLine();
        System.out.println("Please provide phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please provide 6 digit confirmation code:");
        String confirmationCode = scanner.nextLine();
        AndroidDevices androidDevice = new AndroidDevices(login, phoneNumber);
        System.out.println("You have successfully registered with the login: " + login + " and phone number " + phoneNumber);
    }
}
