package ua.ekatalog;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    @BeforeEach
    public void start() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("enableVNC", true); //turn on selenoid
        Configuration.browserCapabilities = dc;
        Configuration.remote = "http://192.168.0.118:4444/wd/hub"; //ubunta
        Configuration.baseUrl = "https://ek.ua/";
        Configuration.browser = "chrome";
        Configuration.startMaximized = true; //open browser window in max
        Configuration.fastSetValue = true; // fast (copy/past) way to output
        Configuration.savePageSource = false;
        Configuration.screenshots = false;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        open("/");
    }

}


//        Configuration.remote = "http://192.168.0.121:4444/wd/hub"; //run test in selenoid windows