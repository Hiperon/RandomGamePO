package marcin.dohnalik.studia;

public class BlackberryProcessing extends RegistrationFormProcessing{

    @Override
    protected IRegistrationForm registrationForm() {
        return new RegistrationBlackberry();
    }
}
