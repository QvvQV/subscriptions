package ru.tutor.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class WatchVideo {
    public WatchVideo(WebDriver driver) {
        PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//*[@id=\"player_3b36671f-95c1-4ba9-be61-c17be384279c\"]/div[2]/div/div/div[1]/div[3]/div[3]/div/div[1]/button[1]")
    private static WebElement playBtn;

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[1]")
    private static WebElement textExel;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[1]/div[2]")
    private static WebElement catalog;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div/div/input")
    private static WebElement learn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/div/div/div[1]/button")
    private static WebElement excelBtn;

    public static void BtnPlay(){
        playBtn.click();
    }

    public static void btnCatalog(){
        catalog.click();
    }

    public static void LearnSearch(){
        learn.sendKeys("excel");
    }

    public static void BtnExcel(){
        excelBtn.click();
    }

    public static String getTextExel(){
        textExel.getText().trim();
        return "Excel-таблицы для начинающих";
    }


//    https://client.dev.tutorplace.ru/user/main?globalSearch=ex
}
