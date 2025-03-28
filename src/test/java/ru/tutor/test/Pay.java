package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tutor.page.*;

import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class Pay {

    public static WebDriver driver;
    public static String url = "https://dev.tutorplace.ru/catalog/product/excel";
//    https://client.dev.tutorplace.ru/login

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        kontacts kontacts = new kontacts(driver);
        PayMain Pay = new PayMain(driver);
        kurs kurs = new kurs(driver);
        LoginAndPass loginAndPass = new LoginAndPass(driver);
        modal modal = new modal(driver);
        Card card = new Card(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should main Pay Cancel")
    public void ShouldMainPayCancel() throws InterruptedException {
        PayMain.PgEnd();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8000));
        wait.until(visibilityOfElementLocated(By.id("access-button")));
        sleep(800);
        PayMain.PgUp();
        LoginAndPass.inputEmail();
        sleep(200);
        PayMain.getDostup();
        sleep(700);
        driver.getWindowHandles();
        driver.switchTo().frame(0);
        sleep(600);
        Assert.assertEquals("Банковской картой", PayMain.textButton());
        sleep(500);
        PayMain.clickBankBtn();
        Assert.assertEquals("Номер карты", PayMain.textCard());
        PayMain.getNumber();
        PayMain.getPay();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        PayMain.btnCancel();
    }

    @Test
    @DisplayName("Should main Pay Fail")
    public void ShouldMainPayFail() throws InterruptedException {
        PayMain.PgEnd();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8000));
        wait.until(visibilityOfElementLocated(By.id("access-button")));
        sleep(800);
        PayMain.PgUp();
        LoginAndPass.inputEmail();
        sleep(200);
        PayMain.getDostup();
        sleep(700);
        driver.getWindowHandles();
        driver.switchTo().frame(0);
        sleep(600);
        Assert.assertEquals("Банковской картой", PayMain.textButton());
        sleep(500);
        PayMain.clickBankBtn();
        Assert.assertEquals("Номер карты", PayMain.textCard());
        PayMain.getNumber();
        PayMain.getPay();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        PayMain.btnFail();
    }

    @Test
    @DisplayName("Should main Pay Success")
    public void ShouldMainPaySuccess() throws InterruptedException {
        PayMain.PgEnd();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8000));
        wait.until(visibilityOfElementLocated(By.id("access-button")));
        sleep(800);
        PayMain.PgUp();
        LoginAndPass.inputEmail();
        sleep(200);
        PayMain.getDostup();
        sleep(700);
        driver.getWindowHandles();
        driver.switchTo().frame(0);
        sleep(600);
        Assert.assertEquals("Банковской картой",PayMain.textButton());
        sleep(500);
        PayMain.clickBankBtn();
        Assert.assertEquals("Номер карты", PayMain.textCard());
//        PayMain.getNumber();
        PayMain.getPay();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        PayMain.btnSuccess();
        wait.until(visibilityOfElementLocated(By.cssSelector("body > div > div > section > h2")));
    }

    @Test
    @DisplayName("Registration on website New User + success Pay")
    public void RegistrationOnWebsite() throws InterruptedException {
        driver.get("https://client.dev.tutorplace.ru/");
        LoginAndPass.registrationUser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        modal.registrationNewUser();
        ClientPrime.atrNull();
        driver.get("https://client.dev.tutorplace.ru/user/subscribe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        ClientPrime.atrNull();
        PayMain.getAccess();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        String title = driver.getTitle();
        Assert.assertEquals("Покупка доступа TutorPlace", title);
        Card.setCard();
        driver.getWindowHandles();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.switchTo().frame(0);
        Card.getSuccess();
        driver.switchTo().window((String) windowHandles[0]);
        String title0 = driver.getTitle();
        Assert.assertEquals("Оформить подписку | TutorPlace", title0);

//        Assert.assertEquals("Оплата картой прошла успешно",Card.getTextSuccess());
}
}