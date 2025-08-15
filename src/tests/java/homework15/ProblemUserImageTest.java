package homework15;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class ProblemUserImageTest extends BaseTest {

    @Test(description = "Image check for problem_user")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Your Name")
    @Epic("UI Tests")
    @Feature("Image Validation")
    @Story("Check if problem_user images are correct")
    public void testProblemUserImages() {
        LoginPage loginPage = new LoginPage();
    }
}
