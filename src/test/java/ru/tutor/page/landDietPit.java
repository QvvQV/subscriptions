package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class landDietPit extends Driver {

    public landDietPit(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.sc-jdkBTo.hjnZer > form > div.sc-epqpcT.bkqkGp > label:nth-child(1) > input")
    private static WebElement radioMan;

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.sc-jdkBTo.hjnZer > h2")
    private static WebElement text;

    public static String getText(){
        return text.getText().trim();
    }

    public static boolean setRadioMan() {
        return radioMan.isDisplayed();
//        radioMan.click();
    }

    public static boolean setNewPass() {
       return newPass.isEnabled();
//        return newPass.getText().trim();
    }

    public static boolean setNextStep() {
        return nextStep.isEnabled();
    }

    @FindBy(name = "newPassword")
    private static WebElement newPass;

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.sc-jdkBTo.hjnZer > form > button")
    private static WebElement nextStep;

//    public static boolean setRadioMan(){
//        try {
//            radioMan.click();
//            LoginAndPass.getname();
//            newPass.sendKeys("12345678");
//            LoginAndPass.getRepeat();
//            nextStep.click();
//            return true;
//        } catch (NoSuchElementException e){
//            return false;
//        }
//    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div > h2")
    private static WebElement headerFirstPage;

    public static String header() {
        return headerFirstPage.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div > p")
    private static WebElement firstPage;

    public static String first() {
        return firstPage.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.sc-edKZPI.eawkAA > button")
    private static WebElement btnNext;

    public static void btn() {
        btnNext.click();
    }

    public static String textBtn() {
        return btnNext.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div > h2")
    private static WebElement headerTwoPage;

    public static String header2() {
        return headerTwoPage.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div > p")
    private static WebElement twoPage;

    public static String two() {
        return twoPage.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div")
    private static WebElement headerThreePage;

    public static String header3() {
        return headerThreePage.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div > p")
    private static WebElement threePage;

    public static String three() {
        return threePage.getText().trim();
    }

    @FindBy(css = "#root > div.sc-bmzYkS.oRjkM > div > div > div.swiper.swiper-fade.swiper-initialized.swiper-horizontal.swiper-watch-progress.sc-faUjhM.kyoIdE.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-visible.swiper-slide-active > div")
    private static WebElement headerFourPage;

    public static String header4() {
        return headerFourPage.getText().trim();
    }

    @FindBy(css = "#react-joyride-step-0 > div > div > div.sc-ijgWfs.cullXO > div > h2")
    private static WebElement mail;

    @FindBy(css = "#react-joyride-step-0 > div > div > div.sc-ijgWfs.cullXO > button")
    private static WebElement crossModal;

    public static String setMail() {
        if (mail.isDisplayed() && mail.isEnabled()) ;
        return mail.getText().trim();
    }

    public static void setCross() {
        setMail();
        crossModal.click();
    }

    @FindBy(css = "#root > div.sc-eDPaeg.dKOioX > div.sc-elxqWl.iJudFN > div > div.sc-fedTIj.kEvJnh > a > span")
    private static WebElement countMail;

    public static String getCountMail() {
        return countMail.getText().trim();
    }

}
