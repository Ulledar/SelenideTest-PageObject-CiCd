package ua.ekatalog.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MousesKeyboardsPage {

    private final By
            mouse = By.cssSelector("a[href='/k267.htm']"),
            keyboard = By.cssSelector("a[href='/k179.htm']");

    @Step("chose mouses")
    public void mouseChose() {
        $(mouse).click();
    }

    @Step("chose keyboards")
    public void keyboardChose() {
        $(keyboard).click();
    }

}
