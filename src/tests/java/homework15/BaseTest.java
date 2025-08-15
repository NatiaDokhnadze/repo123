package homework15;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = String.valueOf(true);
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
        open("https://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}

