package homework14;

import org.testng.annotations.Test;
import page.*;

public class ShoppingCartTest extends BaseTest {

    @Test(priority = 2)
    public void testShoppingCartFlow() {
        // Login
        pages.LoginPage loginPage = new pages.LoginPage()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Products
        page.ProductsPage productsPage = new page.ProductsPage();
        productsPage.addProductToCart("Sauce Labs Backpack");
        productsPage.addProductToCart("Sauce Labs Bike Light");
        productsPage.goToCart();

        // Cart
        CartPage cartPage = new CartPage();
        cartPage.assertProductCount(2);
        cartPage.goToCheckout();

        // Checkout
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.enterCheckoutInfo("Luka", "Tester", "12345");
        checkoutPage.assertItemTotal(29.99 + 9.99);
    }
}

