package page;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage openMainPage() {
        open("https://swoop.ge");
        return this;
    }

    public FunDayPage searchOffer(String offerName) {
        $("[placeholder='ძიება']").setValue(offerName).pressEnter();
        return new FunDayPage();
    }
}
