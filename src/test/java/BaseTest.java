import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeEach
    void start() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://ek.ua/";
    }

}
