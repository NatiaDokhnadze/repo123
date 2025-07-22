package page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ProductsPage {

    public void addProductToCart(String productName) {
        $x("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button").click();
    }

    public void goToCart() {
        $(".shopping_cart_link").click();
    }
}
