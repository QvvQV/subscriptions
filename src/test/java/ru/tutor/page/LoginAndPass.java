package ru.tutor.page;

import com.codeborne.selenide.SelenideElement;
import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.github.javafaker.Faker;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LoginAndPass extends Driver {

    public LoginAndPass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Оплата с главной страницы

     @FindBy(css = "input")
    private static WebElement email;

    public static void inputEmail() {
        email.isDisplayed();
        email.sendKeys("lite29@emaily1.pro");
    }

    // Регистрация с клиента

    @FindBy(name = "email")
    private static WebElement emailReg;

    public static void getEmail() {
        emailReg.sendKeys("lite40@emaily.pro");
    }

    @FindBy(name = "password")
    private static WebElement password;

    public static void getPassword() {
        password.sendKeys("12345678");
    }

    @FindBy(name = "newPassword")
    private static WebElement newPass;

    public static void getNewPass(){
        newPass.sendKeys("12345678");
    }

    @FindBy(name = "repeatPassword")
    private static WebElement repeatPassword;

    public static void getRepeat(){
        repeatPassword.sendKeys("12345678");
    }

    @FindBy(name = "name")
    private static WebElement name;

    public static void getname() {
        name.sendKeys("dfn");
    }

    @FindBy(css = "button")

    private static WebElement nextBtn;

    public static void setNext(){
        nextBtn.click();
    }

    public static void registrationNewUser(){
        getname();
        setNext();
        getEmail();
        getPassword();
        getRepeat();
        setNext();
    }

    public static void registrationUser(){
        getEmail();
        getPassword();
        ClientPrime.btnEnter();
    }


}
