package homework14;

import Data.CredentialsDataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "userCredentials", dataProviderClass = CredentialsDataProvider.class, priority = 1)
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage()
                .enterUsername(username)
                .enterPassword(password);
        loginPage.clickLogin();

        if (username.equals("standard_user") || username.equals("problem_user")) {
            loginPage.assertSuccessfulLogin();
        } else {
            loginPage.assertLoginErrorVisible();
        }
    }
}

