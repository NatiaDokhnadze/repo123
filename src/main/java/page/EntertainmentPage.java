package page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class EntertainmentPage {

    public EntertainmentPage openEntertainmentSection() {
        // "გართობა" განყოფილების გახსნა
        $$(".category-title").findBy(text("გართობა")).click();
        return this;
    }

    public String findMostExpensiveOffer() {
        // ყველა ფასის წამოღება და მაქსიმალურის პოვნა
        ElementsCollection prices = $$(".product-price");
        double maxPrice = prices.stream()
                .mapToDouble(el -> Double.parseDouble(el.getText().replaceAll("[^\\d.]", "")))
                .max().orElse(0);
        return String.valueOf(maxPrice);
    }

    public EntertainmentPage sortByDescendingPrice() {
        // ძვირიდან იაფისკენ სორტირება
        $$(".sort-options option").findBy(text("ფასის კლებადობით")).click();
        return this;
    }

    public EntertainmentPage validateMostExpensiveFirst(String mostExpensive) {
        // პირველ პოზიციაზე ყველაზე ძვირია
        String firstPrice = $$(".product-price").first().getText().replaceAll("[^\\d.]", "");
        assert firstPrice.equals(mostExpensive) :
                "პირველი შეთავაზება არ არის ყველაზე ძვირი. მოსალოდნელი: " + mostExpensive + ", რეალური: " + firstPrice;
        return this;
    }

    // --- ახალი დამატებული მეთოდები ---

    public EntertainmentPage setPriceRange(int minPrice, int maxPrice) {
        // მინიმალური და მაქსიმალური ფასების შეყვანა ფილტრში
        $("[name='minPrice']").setValue(String.valueOf(minPrice));
        $("[name='maxPrice']").setValue(String.valueOf(maxPrice));
        $("[type='submit']").click();
        return this;
    }

    public EntertainmentPage validatePriceRange(int minPrice, int maxPrice) {
        // ვალიდაცია, რომ ყველა შეთავაზება მოცემულ დიაპაზონშია
        $$(".product-price").forEach(priceElement -> {
            double price = Double.parseDouble(priceElement.getText().replaceAll("[^\\d.]", ""));
            assert price >= minPrice && price <= maxPrice :
                    "ფასის დიაპაზონი დარღვეულია: " + price;
        });
        return this;
    }
}
