package page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CheckoutPage {

    public void enterCheckoutInfo(String firstName, String lastName, String zip) {
        $("#first-name").setValue(firstName);
        $("#last-name").setValue(lastName);
        $("#postal-code").setValue(zip);
        $("#continue").click();
    }
//აქ ვერაფერი ვერ გავიგე
    public void assertItemTotal(double expectedTotal) {
        String itemTotalText = $(".summary_subtotal_label").getText(); // "Item total: $29.99"
        double actualTotal = Double.parseDouble(itemTotalText.replaceAll("[^0-9.]", ""));
        assert actualTotal == expectedTotal : "Expected total: " + expectedTotal + ", but got: " + actualTotal;
    }
}

