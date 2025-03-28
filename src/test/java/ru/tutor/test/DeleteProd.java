package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tutor.page.*;

import java.time.Duration;

import static java.lang.Thread.sleep;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class DeleteProd {

    public static WebDriver driver;
    public static String url = "https://client.dev.tutorplace.ru/login";
//    https://client.dev.tutorplace.ru/login

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        kontacts kontacts = new kontacts(driver);
        LoginAndPass loginAndPass = new LoginAndPass(driver);
        modal modal = new modal(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should delete prod Prime")
    public void ShouldDeleteProdPrime() {
        LoginAndPass.registrationUser();
        ClientPrime.setLoad();
        modal.registrationNewUser();
        ClientPrime.atrNull();
//        ClientPrime.setAsk();
        ClientPrime.setSearchBtn();
        ClientPrime.getNameSearchEx();
        ClientPrime.setExcel_table();
        ClientPrime.getExel();
        ClientPrime.setOstat();
        ClientPrime.getNameSearchNot();
        ClientPrime.setNotionBtn();
        ClientPrime.setPlusNotion();
        ClientPrime.setOstat();
        ClientPrime.setMenuNotion();
        ClientPrime.setDelete();
        Assert.assertEquals("Notion", ClientPrime.getMenuSearch());
    }

    @Test
    @DisplayName("Should delete prod Lite")
    public void ShouldDeleteProdLite() throws InterruptedException {
        LoginAndPass.registrationUser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        modal.registrationNewUser();
        ClientPrime.atrNull();
        driver.get("https://client.dev.tutorplace.ru/user/settings/subscription");
//        https://client.tutorplace.ru/user/settings/subscription
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ClientPrime.getChangeLite();
        Assert.assertEquals("Тарифный план “Полный доступ” отключен", ClientPrime.getTextLite());
    }

    @Test
    @DisplayName("Should delete prod Lite")
    public void ShouldDeleteLite() throws InterruptedException {
        LoginAndPass.registrationUser();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        modal.registrationNewUser();
        ClientPrime.atrNull();
        driver.get("https://client.dev.tutorplace.ru/user/settings/payments");
//        https://client.tutorplace.ru/user/settings/payments
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ClientPrime.getChange();
        Assert.assertEquals("Тарифный план “Лайт” отключен", ClientPrime.getTextChange());
    }

//    @Test
//    @DisplayName("Should play Video")
//    public void ShouldPlayVideo() throws InterruptedException {
//        LoginAndPass.getEmail();
//        LoginAndPass.getPassword();
//        ClientPrime.btnEnter();
//        sleep(6000);
//        driver.get("https://client.dev.tutorplace.ru/user/catalog");
//        sleep(2000);
//        WatchVideo.LearnSearch();
//        WatchVideo.BtnExcel();
//        Assert.assertEquals("Excel-таблицы для начинающих", WatchVideo.getTextExel());
//        WatchVideo.BtnPlay();
//        sleep(5000);
//        Assert.assertEquals("Excel-таблицы для начинающих", WatchVideo.getTextExel());
//    }

    @Test
    @DisplayName("Should text kontacts")
    public void ShouldTextKontacts() {
        driver.get("https://tutorplace.ru/contacts");
        Assert.assertEquals("Номер телефона:", kontacts.getTextNumber());
        Assert.assertEquals("+7(800) 555-32-82", kontacts.getNumbetTel());
        Assert.assertEquals("Служба поддержки:", kontacts.getTextTelephone());
        Assert.assertEquals("support@tutorplace.ru", kontacts.getTextSupport());
        Assert.assertEquals("По прочим вопросам:", kontacts.getTextQuestions());
        Assert.assertEquals("info@tutorplace.ru", kontacts.getTextInfo());
//        Assert.assertEquals("Санкт-Петербург, наб. Обводного канала, д. 199-201 литера И, помещ. 6-н",kontacts.getAdres());
        Assert.assertEquals("Все обращения принимаются только\n" +
                "в электронном виде на почту\n" +
                "support@tutorplace.ru\n" +
                "или онлайн - чат на сайте", kontacts.getOnline());
        Assert.assertEquals("ОГРН: 1227800165460", kontacts.getOgrn());
        Assert.assertEquals("ИНН: 7806606223", kontacts.getInn());
//        Assert.assertEquals("ГДЕ НАС НАЙТИ?",kontacts.getSearch());
        kontacts.PgEnd();
        Assert.assertEquals("Все обращения принимаются только в электронном виде\n" +
                "на почту support@tutorplace.ru или онлайн - чат на сайте", kontacts.getFotter1());
        Assert.assertEquals("© OOO «ДИДЖИТАЛ КОНТЕНТ» 2022–2025, ОГРН: 1227800165460 ИНН: 7806606223", kontacts.getFooter());
    }
}
