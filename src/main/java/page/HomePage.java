package page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePage {
    public void openHomePage() {
        open("https://swoop.ge/");
        $("body").shouldBe(visible); // ვალიდაცია რომ გვერდი ჩაიტვირთა
    }

    public void clickKidsCategory() {
        $x("//a[contains(text(),'საბავშვო')]").click();
    }
}
