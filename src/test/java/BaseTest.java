import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeEach
    void start() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("enableVNC", true);
        Configuration.browserCapabilities = dc;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://ek.ua/";
        Configuration.driverManagerEnabled = false;
    }

}
