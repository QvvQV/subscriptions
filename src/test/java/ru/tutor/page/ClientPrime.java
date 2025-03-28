package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class ClientPrime extends Driver {

    public ClientPrime(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div/button")
    private static WebElement enterBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/button")
    private static WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/form/div/div[2]/button")
    private static WebElement nextBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/button")
    private static WebElement close;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/button[2]")
    private static WebElement dontAsk;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[1]")
    private static WebElement searchBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/div[1]/div/div/div/input")
    private static WebElement search;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/div[2]/button[1]")
    private static WebElement excel_table;

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[3]/button")
    private static WebElement exelProd;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/button[1]")
    private static WebElement ostat;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[2]/div/button/div")
    private static WebElement notionBtn;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div/div[2]/button[1]")
    private static WebElement plusNotion;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[1]/button/div[2]/button")
    private static WebElement menuNotion;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[2]/button/div[2]/button")
    private static WebElement menuExel;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[1]/button/div[2]/button[3]")
    private static WebElement delete;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div[1]/div")
    private static WebElement nameSearch;

    //Lite
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]")
    private static WebElement profil;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button")
    private static WebElement change_control;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[2]/div[2]/h4")
    private static WebElement textLite;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[2]/div/button")
    private static WebElement btn_change;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[2]/h4")
    private static WebElement textChange;

    @FindBy(css = "body > div:nth-child(6)")
    private static WebElement serch;

    @FindBy(css = "body > div:nth-child(6) > div > div > div > div > div > form > div:nth-child(1) > div > div > label")
    private static WebElement textTelephone;

    @FindBy(css = "body > div:nth-child(6) > div > div > div > div > div > form > div:nth-child(1) > div > div > input")
    private static WebElement inputTelephone;

    @FindBy(css = "body > div:nth-child(6) > div > div > div > div > div > form > div:nth-child(3) > button")
    private static WebElement tie;

    @FindBy(css = "body > div:nth-child(6) > div > div > div > button")
    private static WebElement buttonCrossTie;

    public static boolean atrNull(){
        try {
            inputTelephone.sendKeys("9548562546");
            buttonCrossTie.click();
            return search.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }

    public static void getProfil() {
        profil.click();
    }

    public static void getChangeLite() { //Lite + main
        change_control.isDisplayed();
        change_control.click();
    }


    public static void setLoad() {
        Duration.ofSeconds(6000);
    }

    public static void btnEnter() {
        enterBtn.click();
    }

    public static void contBtn() {
        continueBtn.click();
    }

    public static void setNextBtn() {
        nextBtn.click();
    }

    public static void setClose() {
        close.click();
    }

    public static void setAsk() {
        dontAsk.click();
    }

    public static void setSearchBtn() {
        searchBtn.click();
    }

    public static void getNameSearchEx() {
        search.sendKeys("Excel");
    }

    public static void getNameSearchNot() {
        search.sendKeys("no");
    }

    public static void getNameSearch() {
        search.sendKeys("Крав");
    }

    public static void setExcel_table() {
        excel_table.click();
    }

    public static void setNotionBtn() {
        notionBtn.click();
    }

    public static void getExel() {
        exelProd.click();
    }

    public static void setPlusNotion() {
        plusNotion.click();
    }

    public static void setOstat() {
        ostat.click();
    }

    public static void setDelete() {
        delete.click();
    }

    public static void setMenuNotion() {
        menuNotion.click();
    }

    public static void setMenuExel() {
        menuExel.click();
    }

    public static String getMenuSearch() {
        return nameSearch.getText();
    }

    public static String getTextLite() {
        return textLite.getText().trim();
    }

    public static String getTextChange() {
        return textChange.getText().trim();
    }

    public static void getChange() {
        btn_change.isDisplayed();
        btn_change.click();
    }
}
