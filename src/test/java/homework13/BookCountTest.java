package homework13;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.testng.Assert.*;

public class BookCountTest {

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        open("http://books.toscrape.com/");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @DataProvider(name = "categoryProvider")
    public Object[][] categories() {
        return new Object[][] {
                {"Travel"},
                {"Mystery"},
                {"Historical Fiction"},
                {"Sequential Art"},
                {"Classics"}

        };
    }

    @Test(dataProvider = "categoryProvider")
    public void checkBookCountMatchesResultsText(String category) {
        // მარცხენა მხარეს ჩამონათვალში დავაკლიკოთ კატეგორიას
        $$(".side_categories a").findBy(text(category)).click();

        // დავთვალოთ წიგნების რაოდენობა გვერდზე
        int booksCount = $$(".product_pod").size();

        // Results ტექსტის მოძებნა
        // აქთვის .form-horizontal strong სელექტორი - ეს კონკრეტულ საიტზე არის ასეთი ტექსტი
        String resultsText = $(".form-horizontal strong").text();  // მაგ: "12"

        // Results-ში მითითებული ჯამური წიგნების რაოდენობა (რადგან strong-ია ციფრი)
        int resultsNumber = Integer.parseInt(resultsText);

        // შედარება
        assertEquals(booksCount, resultsNumber, "Books count does not match results number!");
    }
}

