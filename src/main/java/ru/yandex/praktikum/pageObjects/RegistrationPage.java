package ru.yandex.praktikum.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.SelenideElement;

public class RegistrationPage {

    @FindBy(how = How.XPATH, using = "//*[text()='Имя']/following-sibling::*")
    private SelenideElement nameInput;

    @FindBy(how = How.XPATH, using = "//*[text()='Email']/following-sibling::*")
    private SelenideElement emailInput;

    @FindBy(how = How.XPATH, using = "//*[text()='Пароль']/following-sibling::*")
    private SelenideElement passwordInput;

    @FindBy(how = How.XPATH, using = "//*[text()='Зарегистрироваться']")
    private SelenideElement registerButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Вход']")
    private SelenideElement singInButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Некорректный пароль']")
    private SelenideElement errorPassword;

    @FindBy(how = How.XPATH, using = "//*[text()='Уже зарегистрированы?']/child::*")
    private SelenideElement singUpButton;

    public void openPage(String url){
        Selenide.open(url);
    }

    public void setNameInput(String name){
        nameInput.setValue(name);
    }

    public void setEmailInput(String email){
        emailInput.setValue(email);
    }

    public void setPasswordInput(String password){
        passwordInput.setValue(password);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void clickSignUpButton(){
        singUpButton.click();
    }

    public void checkRegistration(){
        singInButton.shouldBe(Condition.visible);
    }

    public void checkPassword(){
        errorPassword.shouldBe(Condition.visible);
    }
}
