package se.test.stepdef;

import cucumber.api.java.sv.Givet;
import cucumber.api.java.sv.Så;

public class LoginStepdefOldStyle {

    @Givet("^användaren är inloggad med användarnamn \"([^\"]*)\" och lösenord \"([^\"]*)\" old style$")
    public void login(String arg0, String arg1) {
        // Do something
    }

    @Så("^är ingen användare inloggad old style$")
    public void noUserLoggedIn() {
        // Do something
    }

}
