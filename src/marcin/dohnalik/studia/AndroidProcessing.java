package marcin.dohnalik.studia;

public class AndroidProcessing extends RegistrationFormProcessing{

    @Override
    protected IRegistrationForm registrationForm() {
        return new RegistrationAndroid();
    }
}
