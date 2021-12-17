package marcin.dohnalik.studia;

import java.util.Scanner;

public class RegistrationBlackberry implements IRegistrationForm{
    @Override
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide login:");
        String login = scanner.nextLine();
        System.out.println("Please provide phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please provide Blackberry device id:");
        String confirmationCode = scanner.nextLine();
        System.out.println("You will receive a confirmation link shortly in your Blackberry profile. Login: " + login);
    }
}
