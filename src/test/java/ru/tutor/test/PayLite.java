package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tutor.page.*;

import java.time.Duration;

import static java.lang.Thread.sleep;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class PayLite {

    public static WebDriver driver;
    public static String url = "https://client.dev.tutorplace.ru/login";
//    https://client.dev.tutorplace.ru/login

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        kontacts kontacts = new kontacts(driver);
        PayMain Pay = new PayMain(driver);
        kurs kurs = new kurs(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should Pay Cancel of Lite")
    public void ShoulPayCancelOfLite() throws InterruptedException {
        LoginAndPass.getEmail();
        LoginAndPass.getPassword();
        ClientPrime.btnEnter();
        sleep(6000);
//        driver.get("https://client.dev.tutorplace.ru/user/main?productId=387");
//        sleep(2000);
//        kurs.setAdd();
//        sleep(4000);
//        driver.get("https://client.dev.tutorplace.ru/user/main?productId=367");
//        sleep(2000);
//        kurs.setAdd();
//        driver.get("https://client.dev.tutorplace.ru/user/settings/subscription");
////        https://client.tutorplace.ru/user/settings/subscription
//        sleep(2000);
//        ClientPrime.getChangeLite();
//        Assert.assertEquals("Тарифный план “Полный доступ” отключен", ClientPrime.getTextLite());
        driver.get("https://client.dev.tutorplace.ru/user/main?productId=357");
        sleep(600);
        Assert.assertEquals("Доступ к курсу", kurs.getDostup());
        kurs.setYes();
        Assert.assertEquals("Получить Премиум доступ за 99₽", kurs.textGetPremium());
        sleep(200);
        kurs.setGetPremium();
        sleep(200);
//        driver.switchTo().defaultContent();
        driver.getWindowHandles();
        driver.switchTo().frame(0);
//        sleep(600);
//        Assert.assertEquals("Покупка доступа TutorPlace", kurs.textPayTutor());
//        Assert.assertEquals("Банковской картой",PayMain.textButton());
        sleep(700);
//        PayMain.clickBankBtn();
        System.out.println(kurs.getValue());
        Assert.assertEquals("Номер карты", kurs.getTextNubmer());
//        PayMain.getNumber();
//        PayMain.getPay();
//        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
//        PayMain.btnCancel();

    }
}