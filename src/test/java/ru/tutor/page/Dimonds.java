package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Dimonds extends Driver {

    public Dimonds(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div.sc-hJEfkz.ivVgil > div.sc-fczETm.ktQnij > div > div.sc-bsFTsJ.cpmkNt > div:nth-child(1) > div > div > div.swiper-wrapper > div:nth-child(3) > div > div.sc-kOgNDd.fObRwW > h6")
    private static WebElement money;

    public static String textMoney() {
        return money.getText().trim();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/div[1]/div[2]")
    private static WebElement banner;

    public static void clickBanner() {
        banner.click();
    }

    @FindBy(css = "body > div:nth-child(8) > div > div > div > div > div.swiper.swiper-initialized.swiper-horizontal.sc-gBJoiw.fhhFmY.swiper-backface-hidden > button")
    private static WebElement buttonNext;

    public static String textButton() {
        return buttonNext.getText().trim();
    }

    public static void clickButton() {
        buttonNext.click();
    }

    @FindBy(css = "body > div:nth-child(8) > div > div > div > div > div.swiper.swiper-initialized.swiper-horizontal.sc-gBJoiw.fhhFmY.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-active > p")
    private static WebElement textMoneyBanner;

    public static String getText() {
        return textMoneyBanner.getText().trim();
    }

    @FindBy(css = "body > div:nth-child(8) > div > div > div > div > div.swiper.swiper-initialized.swiper-horizontal.sc-gBJoiw.fhhFmY.swiper-backface-hidden > div.swiper-wrapper > div.swiper-slide.swiper-slide-active > p")
    private static WebElement fourTextPage;

    public static String getFourPage() {
        return fourTextPage.getText().trim();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/div/div[1]/div/button")
    private static WebElement fortuneBtn;

    public static void clickBtnFortune() {
        fortuneBtn.click();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div._container_1wiar_33 > div > p:nth-child(3)")
    private static WebElement modalkaUsl;

    public static String textModalka() {
        return modalkaUsl.getText().trim();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > button")
    private static WebElement crossModalka;

    public static void clickCrossModalka() {
        crossModalka.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/button")
    private static WebElement playButton;

    public static void clickBtnPlay() {
        playButton.click();
    }

    @FindBy(css = "body > div._ModalSheet_6fudz_1 > div > div > div.react-modal-sheet-content > div > div > div > p")
    private static WebElement WelcomeUsl;

    public static String textUslWelcome() {
        return WelcomeUsl.getText().trim();
    }

//    public static boolean textUslWel(){
//        try {
//            WelcomeUsl.getText().trim();
//            return WelcomeUsl.isDisplayed();
//        } catch (NoSuchElementException e){
//            return false;
//        }
//    }

    @FindBy(css = "body > div._ModalSheet_6fudz_1 > div > div > button")

    private static WebElement crossBtn;

    public static void clickCrossBtn() {
        crossBtn.click();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div._title_6m3zm_147 > div > span")
    private static WebElement question;

    public static void clickQuestion() {
        question.click();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div._question_6m3zm_189")
    private static WebElement secondQuestion;

    public static void clickSecondQuestion() {
        secondQuestion.click();
    }

    @FindBy(css = "body > div._ModalSheet_6fudz_1 > div > div > div.react-modal-sheet-content > div > div > div._container_1wiar_33 > div > p:nth-child(3)")
    private static WebElement secondModal;

    public static String textSecondModal() {
        return secondModal.getText().trim();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div._wheelContainer_6m3zm_232 > div > button")
    private static WebElement twist;

    public static String textTwist() {
        return twist.getText().trim();
    }

    public static String TwistUsl() {
        if (twist.getText().equals("КРУТИТЬ")) {
            twist.click();
        } else if (twist.getText().equals("КРУТИТЬ\n30")) {
            return twist.getText();
        }
        return twist.getText();
    }

    @FindBy(css = "body > div._ModalSheet_6fudz_1._ModalSheet_1ec1j_9 > div > div > button")
    private static WebElement twistCross;

    public static void btnTwistCross() {
        twistCross.click();
    }

    @FindBy(css = "body > div._Overlay_cd7ce_1 > div > div > div._balance_6m3zm_123 > img")
    private static WebElement imgCoins;

    public static String valueImgCoins() {
        return imgCoins.getAttribute("src");
    }
}
