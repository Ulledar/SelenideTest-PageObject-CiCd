import io.qameta.allure.Epic;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class EKatalogTest extends BaseTest{

    String steelSeriesName = "SteelSeries Rival 3 Wireless";
    String logitechName = "Logitech G Pro Wireless";


    @Epic("TEST ON eKatalog")
    @Test
    void searchProduct() {
        open("/");
        $("#ek-search").val(steelSeriesName).pressEnter();
        Assert.assertTrue(title().contains(steelSeriesName));
    }

    @Epic("TEST ON eKatalog")
    @Test
    void searchProduct2() {
        open("/");
        $("#ek-search").val(steelSeriesName).pressEnter();
        $(".page-title").shouldHave(text(steelSeriesName));
    }

    @Epic("TEST ON eKatalog")
    @Test
    void findMouse() throws InterruptedException {
        open("/");
        $("a[href='/k169.htm'").click(); //компьютеры
        $("a[href='/k304.htm']").click(); //клавы и мышки
        $("a[href='/k267.htm']").click(); //мышки
        //$("#br_all").click();; //все бренды
        //$("a[href='/list/267/steelseries/']").click(); //стилсериес
        $("label[for='br124']").click(); //logitech
        $(".show-models").click();
        //$("span.u:contains(SteelSeries Rival 3 Wireless)").click();
        $("a[title='Мышка Logitech G Pro Wireless ']").click();
        $("div[data-txt-title='Logitech G Pro Wireless']").shouldHave(text(logitechName));
        Thread.sleep(3000);
    }
}