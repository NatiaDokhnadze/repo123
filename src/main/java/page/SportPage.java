package page;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SportPage {

    public SportPage openSportSection() {
        // მენიუდან "სპორტი" განყოფილების გახსნა
        $$(".category-title").findBy(text("სპორტი")).click();
        return this;
    }

    public SportPage setPriceRange(int minPrice, int maxPrice) {
        // მინიმალური და მაქსიმალური ფასების შეყვანა ფილტრში
        $("[name='minPrice']").setValue(String.valueOf(minPrice));
        $("[name='maxPrice']").setValue(String.valueOf(maxPrice));
        $("[type='submit']").click();
        return this;
    }

    public SportPage validatePriceRange(int minPrice, int maxPrice) {
        // ვალიდაცია, რომ ყველა შეთავაზება მოცემულ დიაპაზონშია
        $$(".product-price").forEach(priceElement -> {
            double price = Double.parseDouble(priceElement.getText().replaceAll("[^\\d.]", ""));
            assert price >= minPrice && price <= maxPrice :
                    "ფასის დიაპაზონი დარღვეულია: " + price;
        });
        return this;
    }
}

// ახალი დამატებული მეთოდები ↓↓↓
