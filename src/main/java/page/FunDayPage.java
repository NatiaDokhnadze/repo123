package page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FunDayPage {

    public FunDayPage validateOffer(String offerName) {
        $$(".product-title").findBy(text(offerName)).shouldBe(visible);
        return this;
    }
}
