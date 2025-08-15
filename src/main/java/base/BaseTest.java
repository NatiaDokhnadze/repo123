package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.microsoft.playwright.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    // Playwright ცვლადები
    protected Playwright playwright;
    protected Browser browserPW;
    protected BrowserContext contextPW;
    protected Page pagePW;

    // Selenium/Selenide ცვლადი
    protected WebDriver driver;

    @Parameters({"framework", "browser", "baseUrl"})
    @BeforeMethod
    public void setUp(@Optional("selenide") String framework,
                      @Optional("chrome") String browser,
                      @Optional("https://books.toscrape.com") String baseUrl) {

        if (framework.equalsIgnoreCase("selenide")) {
            Configuration.browser = browser;
            Configuration.browserSize = "1920x1080";
            Configuration.timeout = 5000;
            open(baseUrl);
            driver = WebDriverRunner.getWebDriver(); // დავამატე ეს ხაზი
        } else if (framework.equalsIgnoreCase("playwright")) {
            playwright = Playwright.create();
            if (browser.equalsIgnoreCase("firefox")) {
                browserPW = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
            } else if (browser.equalsIgnoreCase("webkit")) {
                browserPW = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
            } else {
                browserPW = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            }
            contextPW = browserPW.newContext();
            pagePW = contextPW.newPage();
            pagePW.navigate(baseUrl);
        } else {
            throw new IllegalArgumentException("Unknown framework: " + framework);
        }
    }

    @AfterMethod
    @Parameters({"framework"})
    public void tearDown(@Optional("selenide") String framework) {
        if (framework.equalsIgnoreCase("selenide")) {
            closeWebDriver();
        } else if (framework.equalsIgnoreCase("playwright")) {
            browserPW.close();
            playwright.close();
        }
    }
}
