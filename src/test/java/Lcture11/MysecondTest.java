package Lcture11;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class MysecondTest {
    @Test
    public void secondtest() {
        Configuration.pageLoadTimeout = 10000;
        String url = "https://the-internet.herokuapp.com";

        // გავხსნათ საიტი
        open(url);
        sleep(5000);

        // დავაკლიკოთ ღილაკზე Add/Remove Elements
        $("a[href='/add_remove_elements/']").click();

        // დავაკლიკოთ ღილაკზე Add Element
        $("button[onclick='addElement()']").click();

        // უნდა გამოჩნდეს delete
        $(".added-manually").shouldBe(Condition.visible);
        sleep(2000);

        // დავაკლიკოთ Delete -ზე
        $(".added-manually").click();

        // Delete  გაქრეს
        $(".added-manually").shouldNotBe(Condition.visible);
        sleep(2000);
    }
}
