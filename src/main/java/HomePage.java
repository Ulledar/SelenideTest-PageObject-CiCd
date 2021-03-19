import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    void search(String query) {
        $("#ek-search").val(query).pressEnter();
    }

    void logIn() {
        $("span.wu_entr").click();
    }

    void signUp() {
        $("span[class='j-wrap orange']").click();
    }

    void nameField(String name) {
        $("div.registration-name input").val(name);
    }

    void emailField(String email) {
        $(".registration-email input").val(email);
    }

    void passwordField(String password) {
        $(".registration-password input").val(password);
    }

    void clickSignUpButton() {
        $(".registration-actions button.ek-form-btn.blue").click();
    }

    void clickAccountName() {
        $("#mui_user_login_row a").click();
    }

}
