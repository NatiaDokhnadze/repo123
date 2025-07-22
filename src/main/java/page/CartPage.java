package page;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

    public void assertProductCount(int expectedCount) {
        $$(".cart_item").shouldHave(size(expectedCount));
    }

    public void goToCheckout() {
        $("#checkout").click();
    }
}

