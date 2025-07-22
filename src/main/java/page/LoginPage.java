package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {
    public LoginPage enterUsername(String username) {
        $("#user-name").setValue(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        $("#password").setValue(password);
        return this;
    }

    public void clickLogin() {
        $("#login-button").click();
    }

    public void assertSuccessfulLogin() {
        $(".inventory_list").shouldBe(visible);
    }

    public void assertLoginErrorVisible() {
        $(".error-message-container").shouldBe(visible);
    }
}
