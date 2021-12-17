package marcin.dohnalik.studia;

import java.util.Scanner;

public class RegistrationiOS implements IRegistrationForm {

    @Override
    public void register() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please provide login:");
        String login = scanner.nextLine();
        System.out.println("Please provide phone number:");
        String phoneNumber = scanner.nextLine();
        //AppleID would normally be communicated to some interface to check its correctness
        System.out.println("Please provide your Apple id:");
        String AppleID = scanner.nextLine();
        System.out.println("You have successfully registered with the AppleID: " + AppleID);
    }
}
