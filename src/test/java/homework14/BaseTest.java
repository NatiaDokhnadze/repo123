package homework14;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        open("https://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}

