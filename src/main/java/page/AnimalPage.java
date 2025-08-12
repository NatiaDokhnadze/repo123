package page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AnimalPage {

    public AnimalPage openAnimalSection() {
        // "ცხოველები" განყოფილების გახსნა
        $$(".category-title").findBy(text("ცხოველები")).click();
        return this;
    }

    public AnimalPage clickLogo() {
        // Swoop-ის ლოგოზე დაკლიკება
        $(".header-logo").click();
        return this;
    }

    public AnimalPage validateHomePage() {
        // მთავარი გვერდის ვალიდაცია
        $("body").shouldHave(text("დღის შეთავაზება"));
        return this;
    }

    // --- ახალი დამატებული მეთოდები ---

    public AnimalPage setPriceRange(int minPrice, int maxPrice) {
        // მინიმალური და მაქსიმალური ფასების შეყვანა ფილტრში
        $("[name='minPrice']").setValue(String.valueOf(minPrice));
        $("[name='maxPrice']").setValue(String.valueOf(maxPrice));
        $("[type='submit']").click();
        return this;
    }

    public AnimalPage validatePriceRange(int minPrice, int maxPrice) {
        // ვალიდაცია, რომ ყველა შეთავაზება მოცემულ დიაპაზონშია
        $$(".product-price").forEach(priceElement -> {
            double price = Double.parseDouble(priceElement.getText().replaceAll("[^\\d.]", ""));
            assert price >= minPrice && price <= maxPrice :
                    "ფასის დიაპაზონი დარღვეულია: " + price;
        });
        return this;
    }
}
