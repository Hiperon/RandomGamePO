package marcin.dohnalik.studia;

public class IOSProcessing extends RegistrationFormProcessing{

    @Override
    protected IRegistrationForm registrationForm() {
        return new RegistrationiOS();
    }
}
