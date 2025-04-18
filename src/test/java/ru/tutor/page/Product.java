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

public class Product extends Driver {

    public Product(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.sc-fRLnnz.kYQpYS > div > div > input")
    private static WebElement inputSearch;

    //https://client.dev.tutorplace.ru/user/main?globalSearch=крав

    @FindBy(css = "div.sc-iJwpsc.gfFtvH > div > div > div > button")
    private static WebElement product;

    @FindBy(css = "div._preview_uzo09_1 > div:nth-child(2) > button")
    private static WebElement clickAdd;

    public static boolean setClickAdd() {
        try {
            clickAdd.isDisplayed();
            clickAdd.click();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void addKrav_Maga() {
        inputSearch.sendKeys("крав");
        product.isDisplayed();
        product.click();
        setClickAdd();
        modal.setKursSuccesfullAdd();
        modal.clickStay();
    }

    public static void Targetolog() {
        inputSearch.sendKeys("тарг");
        product.isDisplayed();
        product.click();
        setClickAdd();
        modal.setKursSuccesfullAdd();
        modal.clickStay();
    }

    public static void Clear(){
        inputSearch.sendKeys(Keys.DELETE);
    }

    public static void diet() {
        inputSearch.sendKeys("рацион");
        product.isDisplayed();
        product.click();
    }

}


