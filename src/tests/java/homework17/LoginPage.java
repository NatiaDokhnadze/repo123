package homework17;

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
//
//     ამ მეთოდით ხდება იმის შემოწმება, წარმატებული უნდა იყოს ლოგინი თუ არა,
//     იმაზე დაყრდნობით, თუ რომელი იუზერია.
//
//     locked_out_user- მა უნდა გამოიტანოს შეცდომა (assertLoginErrorVisible)
//     დანარჩენებმა უნდა იმუშაოს წარმატებით (assertSuccessfulLogin)
//
    public void assertLoginBehavior(String username) {
        if (username.equals("locked_out_user")) {
            // ამ იუზერს სპეციალურად არ უნდა შეეძლოს ლოგინი
            assertLoginErrorVisible();
        } else {
            // დანარჩენებისთვის წარმატებული ლოგინი უნდა მოხდეს
            assertSuccessfulLogin();
        }
    }
}
