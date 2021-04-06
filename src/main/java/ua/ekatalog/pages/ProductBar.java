package ua.ekatalog.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductBar {

    private final By
            computers = By.cssSelector("a[href='/k169.htm']"),
            mousesAndKeyboards = By.cssSelector("a[href='/k304.htm']");

    @Step("chose mouse & keyboards directory")
    public void mousesAndKeyboards() {
        $(computers).click();
        $(By.linkText("Клавиатуры и мышки")).click();
//        $(mousesAndKeyboards).click();    //поиск клавиатур и мышек по css
    }

}
