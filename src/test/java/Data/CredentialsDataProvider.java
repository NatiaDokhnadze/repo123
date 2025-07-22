package Data;

import org.testng.annotations.DataProvider;

public class CredentialsDataProvider {

    @DataProvider(name = "userCredentials")
    public Object[][] credentials() {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"invalid_user", "wrong_password"}
        };
    }
}

