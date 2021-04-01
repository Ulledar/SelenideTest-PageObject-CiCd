package ua.ekatalog.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final By
            searchSelector = By.cssSelector("#ek-search"),
            logInSelector = By.cssSelector("span.wu_entr"),
            signUpSelector = By.cssSelector("span[class='j-wrap orange']"),
            nameFieldSelector = By.cssSelector("div.registration-name input"),
            emailFieldSelector = By.cssSelector(".registration-email input"),
            passwordFieldSelector = By.cssSelector(".registration-password input"),
            clickSignUpButtonSelector = By.cssSelector(".registration-actions button.ek-form-btn.blue"),
            clickAccountNameSelector = By.cssSelector("#mui_user_login_row a");


    @Step("input to search field")
    public void search(String query) {
        $(searchSelector).val(query).pressEnter();
    }

    @Step("press Log In button")
    public void logIn() {
        $(logInSelector).click();
    }

    @Step("press Sign Up button")
    public void signUp() {
        $(signUpSelector).click();
    }

    @Step("input test name to name field")
    public void nameField(String name) {
        $(nameFieldSelector).val(name);
    }

    @Step("input test email in email field")
    public void emailField(String email) {
        $(emailFieldSelector).val(email);
    }

    @Step("input test password to password field")
    public void passwordField(String password) {
        $(passwordFieldSelector).val(password);
    }

    @Step("press on Sign Up button")
    public void clickSignUpButton() {
        $(clickSignUpButtonSelector).click();
    }

    @Step("click on account name at header")
    public void clickAccountName() {
        $(clickAccountNameSelector).click();
    }

}
