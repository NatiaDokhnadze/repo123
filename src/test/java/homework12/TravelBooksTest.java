package homework12;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TravelBooksTest {
    @Test
    public void TravelBooksTest() {
        String url = "https://books.toscrape.com/index.html";//url-ს მივანიჭოთ ლინკი
        open(url);//გავხსნათ ლინკი
        sleep(2000);//2 წამი იყოს საიტი გახსნილი

        //Travel ღილაკზე დაკლიკება
        $x("//a[text()='Travel']").click();
        //საიტი გადავიდა გვერზე     ვერ მივხვდი ფრჩხილებში წერტილამდე ეგრე რატო დავწერეთ
        $("div.page-header h1").shouldHave(text("Travel"));
        // წიგნების კოლექცია
        ElementsCollection books = $$("ol.row > li");
        for (int i = 0; i < books.size(); i++) {
            // წიგნის ელემენტის ხელახლა მოძებნა რეფრეშის შემდეგ რომ იმუშაოს
            books = $$("ol.row > li");

            //**შეინახეთ** წიგნის მონაცემები (სათაური, ფასი, მარაგი)
            String title = books.get(i).$("h3 a").getAttribute("title").trim();
            String price = books.get(i).$(".price_color").getText().trim();
            String stock = books.get(i).$(".instock.availability").getText().trim();
            //**დააკლიკეთ** წიგნზე და გადადით დეტალურ გვერდზე
            books.get(i).$("h3 a").click();

            //**შეამოწმეთ** დეტალურ გვერდზე სათაური ემთხვევა თუ არა შენახულს
            $("div.product_main h1").shouldHave(text(title));
            //**შეამოწმეთ** დეტალურ გვერდზე ფასი ემთხვევა თუ არა შენახულს
            $("div.product_main .price_color").shouldHave(text(price));
            //**შეამოწმეთ** რომ მარაგის რაოდენობა არ არის 0
            $("div.product_main .instock.availability").shouldNotHave(text("Out of stock"));
            //**დაბრუნდით** Travel გვერდზე შემდეგი წიგნისთვის
            back();
        }
        }

    }
