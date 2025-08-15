package Lcture11;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MyFirstTest {
    @Test
    public void FirsTest() {
        Configuration.pageLoadTimeout = 10000; // 10 წამი

        String URL = "https://the-internet.herokuapp.com/";
        open(URL); //გახსენით საიტი
        sleep(10000); //საიტი იყოს გახსნილი 10 წამი
        $("a[href='/checkboxes']").click();//დააკლიკეთ ლინკზე "Checkboxes"
        $("#content h3").shouldHave(text("Checkboxes"));//ვადასტურებ რომ ჩანს ტექსტი


    }
}
