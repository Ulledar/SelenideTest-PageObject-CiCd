import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseTest {

    @BeforeEach
    void start() {
        Configuration.remote = "http://192.168.0.121:4444/wd/hub";
        Configuration.baseUrl = "https://ek.ua/";
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("enableVNC", true);
        Configuration.browserCapabilities = dc;
        Configuration.savePageSource = false;
        Configuration.screenshots = false;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

}
