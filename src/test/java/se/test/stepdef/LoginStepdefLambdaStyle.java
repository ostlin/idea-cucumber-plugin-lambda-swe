package se.test.stepdef;

import cucumber.api.java8.Sv;

public class LoginStepdefLambdaStyle implements Sv {

    public LoginStepdefLambdaStyle() {

        Givet("^användaren är inloggad med användarnamn \"([^\"]*)\" och lösenord \"([^\"]*)\" lambda style$", (String arg1, String arg2) -> {
            // Do something
        });

        Så("^är ingen användare inloggad lambda style$", () -> {
            // Do something
        });

    }
}
