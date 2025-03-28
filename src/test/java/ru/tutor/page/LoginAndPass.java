package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LoginAndPass extends Driver {

    public LoginAndPass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Оплата с главной страницы

    @FindBy(css = "body > div > section.w-full.bg-\\[\\#7200CC\\].py-\\[60px\\].px-\\[50px\\].rounded-\\[20px\\].mb-\\[40px\\].max-sm\\:p-\\[30px\\].font-nunito.order-section > div > div > div > form > input")
    private static WebElement email;

    public static void inputEmail() {
        email.sendKeys("return35@emaily.pro");
    }

    // Регистрация с клиента

    @FindBy(name = "email")
    private static WebElement emailReg;

    public static void getEmail() {
//        emailReg.sendKeys("request@test.ru");
        emailReg.sendKeys("return36@emaily.pro");
    }

    //coins@test.ru - прод
//


    @FindBy(name = "password")
    private static WebElement password;

    public static void getPassword() {
        password.sendKeys("12345678");
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

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/form/div[2]/div[2]/div[1]/button")

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
