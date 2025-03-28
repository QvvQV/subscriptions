package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Card extends Driver {

    public Card(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "card")
    private static WebElement card;

    public static void numberCard() {
        card.sendKeys("4242424242424242");
    }

    @FindBy(id = "date")
    private static WebElement data;

    private static void getData() {
        data.sendKeys("0627");
    }

    @FindBy(id = "cvv")
    private static WebElement cvv;

    private static void getCvv() {
        cvv.sendKeys("555");
    }

    @FindBy(css = "#app > div > div.checkout > div > div:nth-child(2) > div.content > div > div > div.payment-process__process > div > form > div > div > div.form-confirm > div > button")
    private static WebElement btnPay;

    private static void getPay() {
        btnPay.click();
    }

//    public static void setCard(){
//        numberCard();
//        getData();
//        getCvv();
//        getPay();
//    }

    public static boolean setCard() {
        try {
            numberCard();
            getData();
            getCvv();
            getPay();
            return card.isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @FindBy(css = "#app > div > div > div > div > div.repeat-action > button")
    private static WebElement successBtn;

    public static void getSuccess() {
        successBtn.isDisplayed();
        successBtn.click();
    }

    @FindBy(css = "#app > div > div > div > div > div.help > button")
    private static WebElement failBtn;

    public static void getFail() {
        failBtn.click();
    }

    @FindBy(css = "#app > div > div > div > div > div.cancel > button")
    private static WebElement cancelBtn;

    public static void getCancel() {
        cancelBtn.click();
    }

    @FindBy(css = "#app > div > div.checkout > div > div:nth-child(1) > div.content > div.result > div > div.content")
    private static WebElement textSuccess;

    public static String getTextSuccess() {
        return textSuccess.getText().trim();
    }

}