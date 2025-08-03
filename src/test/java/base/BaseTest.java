package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
        open("https://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
