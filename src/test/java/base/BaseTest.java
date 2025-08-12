package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @Parameters({"browser", "baseUrl"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser,
                      @Optional("https://www.saucedemo.com") String baseUrl) {
        Configuration.browser = browser;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        open(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
