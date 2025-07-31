package homework15;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {

    public ElementsCollection getProductImages() {
        return $$(".inventory_item_img img");
    }

    public void addProductToCart(String sauceLabsBackpack) {
    }
}

