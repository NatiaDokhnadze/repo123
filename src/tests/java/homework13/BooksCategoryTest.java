package homework13;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class BooksCategoryTest {
    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        open("http://books.toscrape.com/");//step1-open website.
    }

    @AfterMethod
    public void teardown() {
        closeWebDriver();
    }

    //step2-choose the category.
    @Test(dataProvider = "categoryProvider", dataProviderClass = CategoryDataProvider.class, priority = 1)
    public void checkCategoryPageOpens(String category) {
        // კატეგორიაზე დაკლიკება
        $$(".side_categories a").findBy(text(category)).click();
        //დაადასტურეთ რომ გვერდი ჩაიტვირთა წიგნებით
        $$(".product_pod").shouldHave(null);
    }

    @Test(dataProvider = "categoryProvider", dataProviderClass = CategoryDataProvider.class, priority = 2)
    public void checkBookPricesAreValid(String category) {
        $$(".side_categories a").findBy(text(category)).click();

        //შეამოწმეთ რომ წიგნის ფასი არ არის 0.5-ზე ნაკლები
        $$(".price_color").forEach(priceElement -> {
            String priceText = priceElement.getText().replace("£", "");
            double price = Double.parseDouble(priceText);
            assertTrue(price >= 0.5, "Price is less than 0.5: " + price);
        });
    }
}

