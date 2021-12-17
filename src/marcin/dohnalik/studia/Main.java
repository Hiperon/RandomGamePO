package marcin.dohnalik.studia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please provide device type:");
        DeviceType deviceType = DeviceType.valueOf(scanner.nextLine());
        RegistrationFormProcessing androidFormProcessing = new AndroidProcessing();
        RegistrationFormProcessing blackberryFormProcessing = new BlackberryProcessing();
        RegistrationFormProcessing iOSFormProcessing = new IOSProcessing();
        RegistrationFormProcessing windowsPhoneProcessing = new WindowsPhoneProcessing();

        switch (deviceType) {
            case Android -> androidFormProcessing.processForm();
            case Blackberry -> blackberryFormProcessing.processForm();
            case iOS -> iOSFormProcessing.processForm();
            case WindowsPhone -> windowsPhoneProcessing.processForm();
        }
    }

}
