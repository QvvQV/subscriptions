package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class kurs extends Driver {

    public kurs(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/button")
    private static WebElement add;

    public static void setAdd(){
        add.click();
    }
//https://client.dev.tutorplace.ru/user/main?productId=387 (stop izmen)
//    https://client.dev.tutorplace.ru/user/main?productId=367
//    https://client.dev.tutorplace.ru/user/main?productId=357

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div > div._actions_mknjl_46 > button:nth-child(1)")
    private static WebElement yes;

    public static void setYes(){
        yes.click();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div > div._container_mknjl_30 > div._info_mknjl_37 > h3")
    private static WebElement dostup;

    public static String getDostup(){
        return dostup.getText().trim();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div > div._submit_1ydyj_80 > div._actions_1ydyj_87 > button:nth-child(1)")
    private static WebElement getPremium;

    public static void setGetPremium(){
        getPremium.click();
    }

    public static String textGetPremium(){
        return getPremium.getText().trim();
    }

    @FindBy(css = "body > widget-host-root > tui-root > tui-dropdowns > div > div > div > div > div > payment-module-frontend-payment-module-entry > payment-module-layout > div > div > div > card-pay-frontend-card-pay-entry > card-pay-button > button")
    private static WebElement payTutor;

    public static String textPayTutor(){
        return payTutor.getText().trim();
    }

    @FindBy(tagName = "placeholder")
    private static WebElement NumberCardLite;

    public static String getTextNubmer(){
        return NumberCardLite.getText().trim();
    }

    public static String getValue(){
        return NumberCardLite.getCssValue("placeholder");
    }

}