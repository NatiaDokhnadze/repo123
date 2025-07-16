import org.testng.annotations.DataProvider;

public class CategoryDataProvider {
    @DataProvider(name = "categoryProvider")
    public Object[][] categories() {
        return new Object[][] {
                {"Science Fiction"},
                {"History"},
                {"Science"},
                {"Novels"}
        };
    }
}
