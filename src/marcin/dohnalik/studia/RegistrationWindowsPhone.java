package marcin.dohnalik.studia;

import java.util.Scanner;

public class RegistrationWindowsPhone implements IRegistrationForm{
    @Override
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide login:");
        String login = scanner.nextLine();
        System.out.println("Please provide phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please provide your e-mail address and click the confirmation link:");
        String confirmationCode = scanner.nextLine();
        System.out.println("Please follow the instructions displayed at your home screen");
        System.out.println("Please provide the generated secret key");
        String secretKey = scanner.nextLine();
        if (secretKey == "12345") {
            System.out.println("You have successfully registered with the login: " + login + " and phone number " + phoneNumber);
        }
        else {
            System.out.println("The police are on their way");
        }
    }
}
