package tests;

import model.Product;
import page.HomePage;
import page.KidsSectionPage;
import service.SwoopExcelExportService;

import org.testng.annotations.tes'ts;
import java.util.List;

public class SwoopProductScrapingTest {

    @Test
    public void scrapeKidsProductsAndExportToExcel() {
        HomePage homePage = new HomePage();
        KidsSectionPage kidsSectionPage = new KidsSectionPage();
        SwoopExcelExportService excelService = new SwoopExcelExportService();

        homePage.openHomePage();
        homePage.clickKidsCategory();
        kidsSectionPage.waitForKidsSectionToLoad();

        List<Product> topProducts = kidsSectionPage.getTopFiveProducts();
        excelService.writeProductsToExcel(topProducts);
    }
}