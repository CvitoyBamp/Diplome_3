package ru.yandex.praktikum.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.praktikum.API.BaseClient;

public class AuthPage extends BaseClient {

    @FindBy(how = How.XPATH, using = "//div[@class='input pr-6 pl-6 input_type_text input_size_default']/input")
    private SelenideElement emailInputAlreadyRegistered;

    @FindBy(how = How.XPATH, using = "//div[@class='input pr-6 pl-6 input_type_password input_size_default']/input")
    private SelenideElement passwordInputAlreadyRegistered;

    @FindBy(how = How.XPATH, using = "//*[text()='Войти']")
    private SelenideElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Зарегистрироваться']")
    private SelenideElement registerButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Оформить заказ']")
    private SelenideElement createOrderButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Восстановить пароль']")
    private SelenideElement retrievePasswordButton;

    public void openPage(String url){
        Selenide.open(url);
    }

    public void setEmailInputAlreadyRegisteredUser(String email) {
        emailInputAlreadyRegistered.setValue(email);
    }

    public void setPasswordInputAlreadyRegisteredUser(String password) {
        passwordInputAlreadyRegistered.setValue(password);
    }

    public void clickSignInButton() {
        signInButton.scrollTo().click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void checkAuth(){
        createOrderButton.shouldBe(Condition.visible);
    }

    public void clickRetrievePasswordButton() {
        retrievePasswordButton.click();
    }
}
