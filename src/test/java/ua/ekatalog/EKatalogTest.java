package ua.ekatalog;

import ua.ekatalog.pages.HomePage;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class EKatalogTest extends BaseTest {

    final String STEELSERIES = "SteelSeries Rival 3 Wireless";
    final String LOGITECH = "Logitech G Pro Wireless";

    @Epic("TEST ON eKatalog")
    @Feature("sign up")
    @Severity(SeverityLevel.NORMAL)
    @Description("full way to sign up")
    @Story("open login window for sign up and check succes")
    @Test
    void registration() {
        String testName = "test";
        HomePage homePage = new HomePage();
        open("/");
        homePage.logIn();
        homePage.signUp();
        homePage.nameField(testName);
        homePage.emailField("test");
        homePage.passwordField("test");
        homePage.clickSignUpButton();
        homePage.clickAccountName();
        Assertions.assertEquals($("#mui_user_login_row a").getText(), testName);
    }

    @Epic("TEST ON eKatalog")
    @Feature("Test of search field.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test for testing search possibility.")
    @Story("Try to pass the test")
    @Test
    void searchProduct1() {
        open("/");
        new HomePage().search(STEELSERIES);
        Assert.assertTrue(title().contains(STEELSERIES));
    }

    @Epic("TEST ON eKatalog")
    @Feature("Test of search field.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test for testing search possibility.")
    @Story("Try to pass the test. 2nd realization")
    @Test
    void searchProduct2() {
        open("/");
        new HomePage().search(STEELSERIES);
        $(".page-title").shouldHave(text(STEELSERIES));
    }

    @Epic("TEST ON eKatalog")
    @Feature("Test for finding Logitech")
    @Severity(SeverityLevel.NORMAL)
    @Description("Looking for Logitech mouse.")
    @Test
    void findMouse() {
        open("/");
        $("a[href='/k169.htm'").click(); //компьютеры
        $("a[href='/k304.htm']").click(); //клавы и мышки
        $("a[href='/k267.htm']").click(); //мышки
        $("form#form_match label[for='br124']").click(); //logitech
        $(".show-models").click();
        $(" a#product_1539438").click();
        $("div[data-txt-title='Logitech G Pro Wireless']").shouldHave(text(LOGITECH));
    }
}