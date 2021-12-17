package marcin.dohnalik.studia;

import java.util.Scanner;

public class RegistrationFormProcessing {

    public void processForm(){

        IRegistrationForm registrationForm = registrationForm();
        registrationForm.register();
    }

    protected IRegistrationForm registrationForm() {
        return new RegistrationAndroid();
    }

}
