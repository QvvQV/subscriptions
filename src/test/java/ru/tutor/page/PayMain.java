package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class PayMain extends Driver {

    public PayMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body > div > div > section > div.w-full.max-w-\\[618px\\].flex.flex-col.max-\\[1080px\\]\\:max-w-full > button")
    private static WebElement BtnStart;

    public static void PgEnd() {
        BtnStart.sendKeys(Keys.END);
    }

    public static void clickBtnStart() {
        BtnStart.click();
    }

    @FindBy(id = "access-button")
    private static WebElement Dostup;

    public static void PgUp() {
        Dostup.sendKeys(Keys.PAGE_UP);
    }

    public static void getDostup() {
        Dostup.click();
    }

    @FindBy(css = "body > div > section.w-full.bg-\\[\\#7200CC\\].py-\\[60px\\].px-\\[50px\\].rounded-\\[20px\\].mb-\\[40px\\].max-sm\\:p-\\[30px\\].font-nunito.order-section > div > div > div > form > input")
    private static WebElement email;

    public static void inputEmail() {
        email.sendKeys("qa@test.ru");
    }

    @FindBy(css = "body > widget-host-root > tui-root > tui-dropdowns > div > div > div > div > div > payment-module-frontend-payment-module-entry > payment-module-layout > div > div > div > card-pay-frontend-card-pay-entry > card-pay-button > button")
    private static WebElement BankBtn;

    public static void clickBankBtn() {
        BankBtn.click();
    }

    public static String textButton() {
        return BankBtn.getText().trim();
    }

    @FindBy(css = "body > widget-host-root > tui-root > tui-dropdowns > div > div > div > div > div > payment-module-frontend-payment-module-entry > payment-module-layout > div > div > div > card-pay-frontend-card-pay-entry > card-pay-edit > div.tui-space_bottom-6.ng-star-inserted > tui-input-card-group > div:nth-child(1) > label")
    private static WebElement numberCard;

    public static void getNumber() {
        numberCard.sendKeys("42424242424242420455555");
    }

    public static String textCard() {
        return numberCard.getText().trim();
    }

    @FindBy(css = "body > widget-host-root > tui-root > tui-dropdowns > div > div > div > div > div > payment-module-frontend-payment-module-entry > payment-module-layout > div > div > div > card-pay-frontend-card-pay-entry > card-pay-edit > button")
    private static WebElement Pay;

    public static void getPay() {
        Pay.click();
    }

    @FindBy(css = "#app > div > div > div > div > div.cancel > button")
    private static WebElement cancel;

    public static void btnCancel() {
        cancel.click();
    }

    public static String textCancel(){
        return cancel.getText().trim();
    }

    @FindBy(css = "#app > div > div > div > div > div.help > button")
    private static WebElement fail;

    public static void btnFail() {
        fail.click();
    }

    @FindBy(css = "body > widget-host-root > tui-root > tui-dropdowns > div > div > div > img")
    private static WebElement cross;

    public static void btnCross() {
        cross.click();
    }

    @FindBy(css = "#app > div > div > div > div > div.repeat-action > button > div")
    private static WebElement success;

        public static void btnSuccess() {
        success.click();
    }

}
