// LoginTest.java
package homework17;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    // ამ მეთოდს ვუშვებთ მხოლოდ ერთხელ ტესტის დაწყებამდე — გადმოწერს და შეცვლის testfile.txt-ს
    @BeforeClass
    public void setup() throws Exception {
        Configuration.downloadsFolder = System.getProperty("user.home") + "/Downloads";
        FileHandler.downloadAndModifyFile();
    }

    // ძირითადი ტესტი — ყველა იუზერით ლოგინი
    @Test(dataProvider = "usersFromFile", dataProviderClass = UserDataProvider.class)
    public void testLoginWithDifferentUsers(String username, String password) {
        loginPage.openPage();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        loginPage.assertLoginBehavior(username); // იუზერის ქცევის ვალიდაცია
    }
}
