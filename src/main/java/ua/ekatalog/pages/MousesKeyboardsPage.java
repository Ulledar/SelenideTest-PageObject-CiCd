package ua.ekatalog.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MousesKeyboardsPage {

    private final By
            mouses = By.cssSelector("a[href='/k267.htm']"),
            keyboards = By.cssSelector("a[href='/k179.htm']");

    @Step("chose mouses")
    public void mouseChose() {
        $(mouses).click();
//        $(By.linkText("Мышки")).click();  //поиск по тексту
    }

    @Step("chose keyboards")
    public void keyboardChose() {
        $(keyboards).click();
    }

}
