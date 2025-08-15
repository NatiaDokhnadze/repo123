package homework14;

import org.testng.annotations.Test;
import homework15.LoginPage;
import homework15.ProductsPage;

public class ShoppingCartTest extends BaseTest {

    @Test(priority = 2)
    public void testShoppingCartFlow() {
        // Login
        homework17.LoginPage loginPage = new LoginPage()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Products
        ProductsPage productsPage = new ProductsPage();
        productsPage.addProductToCart("Sauce Labs Backpack");
    }
}
