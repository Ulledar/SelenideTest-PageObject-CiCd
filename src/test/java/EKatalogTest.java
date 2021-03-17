import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class EKatalogTest extends BaseTest {

    String steelSeriesName = "SteelSeries Rival 3 Wireless";
    String logitechName = "Logitech G Pro Wireless";

    @Epic("TEST ON eKatalog")
    @Feature("Test of search field.")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test for testing search possibility.")
    @Story("Try to pass the test")
    @Test
    void searchProduct() {
        open("/");
        $("#ek-search").val(steelSeriesName).pressEnter();
        Assert.assertTrue(title().contains(steelSeriesName));
    }

    @Epic("TEST ON eKatalog")
    @Feature("Test of search field. 2nd")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test for testing search possibility.")
    @Story("Try to pass the test. 2nd realization")
    @Test
    void searchProduct2() {
        open("/");
        $("#ek-search").val(steelSeriesName).pressEnter();
        $(".page-title").shouldHave(text(steelSeriesName));
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
        $("div[data-txt-title='Logitech G Pro Wireless']").shouldHave(text(logitechName));
    }
}