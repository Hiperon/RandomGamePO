package marcin.dohnalik.studia;

public class WindowsPhoneProcessing extends RegistrationFormProcessing{

    @Override
    protected IRegistrationForm registrationForm() {
        return new RegistrationWindowsPhone();
    }
}
