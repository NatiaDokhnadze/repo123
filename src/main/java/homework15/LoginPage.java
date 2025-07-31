package homework15;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {

    public void login(String username, String password) {
        $("#user-name").setValue(username);
        $("#password").setValue(password);
        $("#login-button").click();
        $("#inventory_container").should(appear);
    }

    public page.LoginPage enterUsername(String standardUser) {
        return null;
    }
}

