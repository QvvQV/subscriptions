package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tutor.page.*;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class PaySuccessfullLite {

    public static WebDriver driver;
//    public static String url = "https://dev.tutorplace.ru/catalog/product/excel";
//    https://client.dev.tutorplace.ru/login

    public void BeforeRegistration() {
        driver.get("https://client.dev.tutorplace.ru/login");
        LoginAndPass.registrationUser();
        System.out.println(modal.modalTelephone());
        System.out.println(modal.modalDailyCall());
    }

    public void doubleClick() {
        WebElement clickable = driver.findElement(By.cssSelector("div.sc-fRLnnz.kYQpYS > div > div > input"));
        new Actions(driver)
                .doubleClick(clickable)
                .perform();
        Product.Clear();
    }

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        PayMain Pay = new PayMain(driver);
        LoginAndPass loginAndPass = new LoginAndPass(driver);
        modal modal = new modal(driver);
        Card card = new Card(driver);
        ClientLite clientLite = new ClientLite(driver);
        Product product = new Product(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.get(url);
    }

    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Downgrade Premium for Lite")
    public void DowngradePremiumForLite() {
        BeforeRegistration();
        driver.get("https://client.dev.tutorplace.ru/user/settings/subscription");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(elementToBeClickable(By.tagName("button")));
        System.out.println(ClientLite.text());
        ClientLite.getChangeLite();
        Assert.assertEquals("Тарифный план “Полный доступ” отключен", ClientLite.getTextLite());
    }

    @Test
    @DisplayName("Pay Successfull Lite")
    public void PaySuccessfullLite() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        BeforeRegistration();
        driver.get("https://client.dev.tutorplace.ru/user/catalog");
        Product.addKrav_Maga();
        doubleClick();
        Product.Targetolog();
        doubleClick();
        Product.diet();
        modal.setYes();
        System.out.println(modal.textForPremium99());
        wait.until(elementToBeClickable(By.cssSelector("div._actions_1ydyj_87 > button:nth-child(1)")));
        System.out.println(modal.getPremiumFor99());
        wait.until(elementToBeClickable(By.tagName("iframe")));
        driver.getWindowHandles();
        driver.switchTo().frame(0);
        wait.until(elementToBeClickable(By.cssSelector("card-pay-button > button")));
        Assert.assertEquals("Банковской картой", PayMain.textButton());
        PayMain.clickBankBtn();
        wait.until(elementToBeClickable(By.cssSelector("body > widget-host-root > tui-root > tui-dropdowns > div > div > div > div > div > payment-module-frontend-payment-module-entry > payment-module-layout > div > div > div > card-pay-frontend-card-pay-entry > card-pay-edit > div.tui-space_bottom-6.ng-star-inserted > tui-input-card-group > div:nth-child(1) > label"))).isDisplayed();
        Assert.assertEquals("Номер карты", Card.textCard());
        PayMain.getPay();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        wait.until(elementToBeClickable(By.cssSelector("div.repeat-action > button > div")));
        PayMain.btnSuccess();
        driver.get("https://client.dev.tutorplace.ru/user/settings/subscription");
        wait.until(elementToBeClickable(By.tagName("button")));
        Assert.assertEquals("Полный доступ", ClientPrime.setTextPremium());
    }
}
