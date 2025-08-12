package page;

import model.Product;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class KidsSectionPage {

    public void waitForKidsSectionToLoad() {
        $$(".product-block").first().shouldBe(visible);
    }

    public List<Product> getTopFiveProducts() {
        List<Product> products = new ArrayList<>();

        $$(".product-block").stream().limit(5).forEach(productElement -> {
            String title = productElement.$(".title").text();
            String description = ""; // თუ არის, დაამატე
            String price = productElement.$(".price").text();
            String discount = productElement.$(".sale").exists() ? productElement.$(".sale").text() : "0%";
            String sold = productElement.$(".deal-buy-counter").exists() ? productElement.$(".deal-buy-counter").text() : "N/A";

            Product product = new Product(title, description, price, discount, sold);
            products.add(product);
        });

        return products;
    }
}
