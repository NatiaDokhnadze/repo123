package Tests;

import base.BaseTest;
import org.testng.annotations.Test;
import page.MainPage;
import utils.DatabaseUtils;
import util.OfferData;

public class FunDayPageTests extends BaseTest {

    @Test(priority = 1)
    public void databaseValidationTest() {
        OfferData offer = DatabaseUtils.getRandomOffer();
        new MainPage()
                .openMainPage()
                .searchOffer(offer.getOfferName())
                .validateOffer(offer.getOfferName());
    }

    // დანარჩენი ტესტები: filterTest, priceRangeTest, logoTest, descendingOrderTest
}
