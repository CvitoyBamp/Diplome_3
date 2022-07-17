package ru.yandex.praktikum.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.praktikum.API.BaseClient;

public class MainPage{

    @FindBy(how = How.XPATH, using = "//p[text()='Личный Кабинет']")
    private SelenideElement personalAccountButton;

    @FindBy(how = How.XPATH, using = "//p[text()='Конструктор']")
    private SelenideElement constructorButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Булки']")
    private SelenideElement bunButton;

    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Булки']")
    private SelenideElement bunChecker;

    @FindBy(how = How.XPATH, using = "//*[text()='Соусы']")
    private SelenideElement sauceButton;

    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Соусы']")
    private SelenideElement sauceChecker;

    @FindBy(how = How.XPATH, using = "//*[text()='Начинки']")
    private SelenideElement fillingButton;

    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Начинки']")
    private SelenideElement fillingChecker;

    @FindBy(how = How.XPATH, using = "//button[text()='Войти в аккаунт']")
    private SelenideElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[text()='Выход']")
    private SelenideElement logoutButton;

    @FindBy(how = How.XPATH, using = "//*[text()='В этом разделе вы можете изменить свои персональные данные']")
    private SelenideElement accountPersonalText;

    @FindBy(how = How.XPATH, using = "//*[text()='Оформить заказ']")
    private SelenideElement createOrderButton;

    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement siteLogo;

    @FindBy(how = How.XPATH, using = "//div[@class='Auth_login__3hAey']/h2")
    private SelenideElement loginText;

    public void openPage(String url){
        Selenide.open(url);
    }

    public void clickPersonalAccountButton() {
        personalAccountButton.click();
    }

    public void clickConstructorButton() {
        constructorButton.click();
    }

    public void clickBunButton() {
        bunButton.click();
    }

    public void clickSauceButton() {
        sauceButton.click();
    }

    public void clickFillingButton() {
        fillingButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void checkPersonalAccount(){ accountPersonalText.shouldBe(Condition.visible); }

    public void checkMainPage(){ createOrderButton.shouldBe(Condition.visible); }

    public void clickLogo(){ siteLogo.click(); }

    public void checkLogout(){ loginText.shouldBe(Condition.visible); }

    public void checkBun(){ bunChecker.shouldBe(Condition.visible); }

    public void checkSauce(){ sauceChecker.shouldBe(Condition.visible); }

    public void checkFilling(){ fillingChecker.shouldBe(Condition.visible); }
}
