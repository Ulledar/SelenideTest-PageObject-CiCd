import static com.codeborne.selenide.Selenide.title;
import org.junit.Assert;

public class Check {

    void checkTheTitle(String query) {
        Assert.assertTrue(title().contains(query));
    }

}
