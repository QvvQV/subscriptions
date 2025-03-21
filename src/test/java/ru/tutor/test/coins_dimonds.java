package ru.tutor.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

public class coins_dimonds {

    private static final Log log = LogFactory.getLog(coins_dimonds.class);
    public static WebDriver driver;
    public static String url = "https://client.dev.tutorplace.ru/login";
//    https://client.dev.tutorplace.ru/login

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        kontacts kontacts = new kontacts(driver);
        PayMain Pay = new PayMain(driver);
        Dimonds dimonds = new Dimonds(driver);
        LoginAndPass loginAndPass = new LoginAndPass(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should Leaders")
    public void ShouldLeaders() throws InterruptedException
    {
        LoginAndPass.getEmail();
        LoginAndPass.getPassword();
        ClientPrime.btnEnter();
        sleep(6000);

        System.out.println(ClientPrime.atrNull());
        driver.get("https://client.dev.tutorplace.ru/user/my-profile/leaders");
        sleep(4000);
//        Assert.assertEquals("Монеты", Dimonds.textMoney());
        Dimonds.clickBanner();
        sleep(500);
        Assert.assertEquals("Далее", Dimonds.textButton());
        Dimonds.clickButton();
        sleep(200);
        Dimonds.clickButton();
        sleep(200);
        Assert.assertEquals("Получай алмазы за призовые места\n" +
                "в каждой из категорий", Dimonds.getText());
        Dimonds.clickButton();
        sleep(200);
        Assert.assertEquals("Копи алмазы и крути на них колесо,\n" +
                "чтобы выиграть крутые призы!", Dimonds.getFourPage());
    }

    @Test
    @DisplayName("Should Fortune")
    public void ShouldFortune() throws InterruptedException
    {
        LoginAndPass.getEmail();
        LoginAndPass.getPassword();
        ClientPrime.btnEnter();
        sleep(6000);

//        System.out.println(ClientPrime.atrNull());
        Dimonds.clickBtnFortune();
        sleep(200);
        Assert.assertEquals("Также у тебя есть возможность крутить колесо за алмазы, которые легко заработать, занимаясь саморазвитием: проходя уроки, выполняя задания и прокачивая свой уровень", Dimonds.textModalka());
        Dimonds.clickCrossModalka();
        sleep(100);
        Dimonds.clickBtnPlay();
        sleep(300);
        Assert.assertEquals("Здесь ты можешь испытать свою удачу. Вращай колесо один раз в день бесплатно и получай разнообразные призы: алмазы и опыт твоего профиля", Dimonds.textUslWelcome());
        Dimonds.clickCrossBtn();
        sleep(100);
        Assert.assertEquals("https://client.dev.tutorplace.ru/img/wheel/diamond.png",Dimonds.valueImgCoins());
        Dimonds.clickQuestion();
        sleep(200);
        Assert.assertEquals("Также у тебя есть возможность крутить колесо за алмазы, которые легко заработать, занимаясь саморазвитием: проходя уроки, выполняя задания и прокачивая свой уровень", Dimonds.textSecondModal());
        Dimonds.clickCrossBtn();
        Dimonds.clickSecondQuestion();
        sleep(100);
        Assert.assertEquals("Также у тебя есть возможность крутить колесо за алмазы, которые легко заработать, занимаясь саморазвитием: проходя уроки, выполняя задания и прокачивая свой уровень", Dimonds.textSecondModal());
        Dimonds.clickCrossBtn();
        sleep(100);
        Assert.assertEquals("КРУТИТЬ", Dimonds.textTwist());
        Dimonds.TwistUsl();
        sleep(3000);
        Dimonds.btnTwistCross();
        Assert.assertEquals("КРУТИТЬ\n30",Dimonds.TwistUsl());
        sleep(200);
}
}