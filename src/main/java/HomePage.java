import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    @Step("input to search field")
    void search(String query) {
        $("#ek-search").val(query).pressEnter();
    }

    @Step("press Log In button")
    void logIn() {
        $("span.wu_entr").click();
    }

    @Step("press Sign Up button")
    void signUp() {
        $("span[class='j-wrap orange']").click();
    }

    @Step("input test name to name field")
    void nameField(String name) {
        $("div.registration-name input").val(name);
    }

    @Step("input test email in email field")
    void emailField(String email) {
        $(".registration-email input").val(email);
    }

    @Step("input test password to password field")
    void passwordField(String password) {
        $(".registration-password input").val(password);
    }

    @Step("press on Sign Up button")
    void clickSignUpButton() {
        $(".registration-actions button.ek-form-btn.blue").click();
    }

    @Step("click on account name at header")
    void clickAccountName() {
        $("#mui_user_login_row a").click();
    }

}
