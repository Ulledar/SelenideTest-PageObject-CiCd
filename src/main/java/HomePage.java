import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    void search(String query) {
        $("#ek-search").val(query).pressEnter();
    }


}
