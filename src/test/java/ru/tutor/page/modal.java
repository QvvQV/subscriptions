package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class modal extends Driver {

    public modal(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.sc-jdUcAg.ciaN > button")
    private static WebElement btnModalkaNext;


    public static boolean atrBtnModalka() {
        try {
            btnModalkaNext.click();
            return btnModalkaNext.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @FindBy(id = "react-select-2-placeholder")
    private static WebElement maleModal;

    @FindBy(id = "react-select-2-input")
    private static WebElement aria;

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > form > div > div.sc-jdUcAg.ciaN > button")
    private static WebElement secondBtn;

//    public static String text() {
//        maleModal.click();
//        aria.sendKeys(Keys.ENTER);
//        secondBtn.click();
//        return aria.getAttribute("aria-activedescendant");
//    }

    public static boolean atrSecondModalka() {
        try {
            maleModal.click();
            aria.sendKeys(Keys.ENTER);
            secondBtn.click();
            return maleModal.isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > button")
    private static WebElement crossModal;

    public static boolean crossModalka() {
        try {
            crossModal.click();
            return crossModal.isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void registrationNewUser(){
        atrBtnModalka();
        atrSecondModalka();
        crossModalka();
    }

}
