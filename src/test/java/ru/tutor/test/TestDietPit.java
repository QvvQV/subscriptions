package ru.tutor.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tutor.page.*;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class TestDietPit {

    private static final Log log = LogFactory.getLog(TestDietPit.class);
    public static WebDriver driver;
    public static String url = "https://dev.tutorplace.ru/catalog/product/pitanie";
//    https://client.dev.tutorplace.ru/login

    public void success() throws InterruptedException {
        PayMain.PgEnd();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(visibilityOfElementLocated(By.id("access-button")));
        sleep(800);
        PayMain.PgUp();
        LoginAndPass.inputEmail();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        PayMain.getDostup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.getWindowHandles();
        driver.switchTo().frame(0);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assert.assertEquals("Банковской картой",PayMain.textButton());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        PayMain.clickBankBtn();
        Assert.assertEquals("Номер карты", PayMain.textCard());
//        PayMain.getNumber();
        PayMain.getPay();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PayMain.btnSuccess();
    }

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        kontacts kontacts = new kontacts(driver);
        PayMain Pay = new PayMain(driver);
        Dimonds dimonds = new Dimonds(driver);
        LoginAndPass loginAndPass = new LoginAndPass(driver);
        landDietPit landDietPit = new landDietPit(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }


    @Test
    @DisplayName("Should text")
    public void ShouldText() throws InterruptedException {
        success();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println(landDietPit.getText());
//        System.out.println(landDietPit.setRadioMan());
        System.out.println(landDietPit.setNewPass());
        System.out.println(landDietPit.setNextStep());
        landDietPit.setRadioMan();
        Assert.assertEquals("Получен доступ\n " + " к дневнику питания", landDietPit.header());
        Assert.assertEquals("Поздравляем! \n" + " Персональный дневник питания на 7 дней уже ждет тебя на внутренней TutorПочте. Но это еще не все!", landDietPit.first());
        Assert.assertEquals("Дальше", landDietPit.textBtn());
        landDietPit.btn();
        Assert.assertEquals("Достигни цели  без срывов и стресса", landDietPit.header2());
        Assert.assertEquals("Трекер питания поможет легко придерживаться нормы калорий. Он доступен в разделе “Сервисы”", landDietPit.two());
        landDietPit.btn();
        Assert.assertEquals("Стань гуру правильного питания за месяц\n" +
                "Приготовили для тебя подборку  курсов TutorPlace, которые помогут разобраться в теме", landDietPit.header3());
        landDietPit.btn();
        Assert.assertEquals("Подберем подходящую активность\n" + "С тренировками добиться результата проще, их также можно найти в подборке курсов на TutorПочте", landDietPit.header4());
        landDietPit.btn();
        Assert.assertEquals("Нажми на знак почты", landDietPit.setMail());
        landDietPit.setCross();
        modal.setHome();
        Assert.assertEquals("3", landDietPit.getCountMail());
        driver.get("https://client.tutorplace.ru/user/mail");

    }
}


