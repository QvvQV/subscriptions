package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tutor.page.matrix;

import java.time.Duration;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class matrixTest {

    public static WebDriver driver;
//    public static String url = "https://client.dev.tutorplace.ru/login";
//    https://client.dev.tutorplace.ru/login

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        matrix matrix = new matrix(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should text matrix")
    public void ShouldTextMatrix() {
        driver.get("https://matrixv.tutorplace.ru/");
        Assert.assertEquals("Добро пожаловать в настоящее астральное путешествие.", matrix.getHeader());
        Assert.assertEquals("Анализ натальной карты, астрологические прогнозы на год, анализ совместимости и многое другое", matrix.getStart());
        Assert.assertEquals("Получите свой астральный план", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Should text matrixSud")
    public void ShouldTextMatrixSud() {
        driver.get("https://matrixvd.tutorplace.ru/");
        Assert.assertEquals("Составьте свою Матрицу судьбы с полной расшифровкой", matrix.getHeader());
        Assert.assertEquals("Разбор матрицы судьбы, составление натальной карты, астрологические прогнозы на год, анализ совместимости, отношения и многое другое!", matrix.getStart());
        Assert.assertEquals("Получить Матрицу Судьбы", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Should text natal chart")
    public void ShouldTextNatalChart() {
        driver.get("https://matrixvd3.tutorplace.ru");
        Assert.assertEquals("Рассчитайте Натальную карту с полной расшифровкой", matrix.getHeader());
        Assert.assertEquals("Судьба в вашей карте рождения! Узнайте свои сильные стороны, слабости и важные периоды жизни", matrix.getStart());
        Assert.assertEquals("Составить Натальную карту", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Should text Aschendent")
    public void ShouldTextAschendent() {
        driver.get("https://matrixvd4.tutorplace.ru");
        Assert.assertEquals("Узнайте свой Асцендент", matrix.getHeader());
        Assert.assertEquals("Окружающие не воспринимают вас так, как вы себя ощущаете? Узнайте свой Асцендент и научитесь использовать его силу!", matrix.getStart());
        Assert.assertEquals("Узнать свой Асцендент", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Should text Arkan")
    public void ShouldTextArkan() {
        driver.get("https://matrixvd5.tutorplace.ru");
        Assert.assertEquals("Узнайте свой Аркан", matrix.getHeader());
        Assert.assertEquals("Какой урок вам дан в этой жизни? Аркан судьбы покажет ваши главные задачи и таланты!", matrix.getStart());
        Assert.assertEquals("Узнать свой Аркан", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Should text Money code")
    public void ShouldTextMoneyCode() {
        driver.get("https://matrixvd6.tutorplace.ru");
        Assert.assertEquals("Узнайте свой Денежный код", matrix.getHeader());
        Assert.assertEquals("Почему деньги к вам не идут? Рассчитайте свой Денежный код и узнайте, как привлечь финансовый поток!", matrix.getStart());
        Assert.assertEquals("Узнать свой Денежный код", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Should text Compatibility")
    public void ShouldTextCombatibility() {
        driver.get("https://matrixvd7.tutorplace.ru");
        Assert.assertEquals("Проверьте свою совместимость с другим человеком.", matrix.getHeader());
        Assert.assertEquals("Будет ли гармония в отношениях? Анализ совместимости: любовь, дружба, бизнес-партнёрство", matrix.getStart());
        Assert.assertEquals("Проверить совместимость", matrix.setBtn());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    @DisplayName("Calculation of the Matrix of Destiny")
    public void CalculationOfTheMatrixOfDestiny(){
        driver.get("https://matrixsm1.tutorplace.ru/");
        Assert.assertEquals("Расчёт Матрицы Судьбы!", matrix.getHeaderMatrixDestiny());
        Assert.assertEquals(true, matrix.getPersonBrand());
    }

    @Test
    @DisplayName("Female Matrix of Destiny")
    public void FemaleMatrixOfDestiny(){
        driver.get("https://matrixsm2.tutorplace.ru/");
        Assert.assertEquals("Женская Матрица Судьбы!", matrix.getHeaderMatrixDestiny());
        Assert.assertEquals(true, matrix.getPersonBrand());
    }

    @Test
    @DisplayName("Female Matrix of Destiny2")
    public void FemaleMatrixOfDestiny2(){
        driver.get("https://matrixsm3.tutorplace.ru/");
        Assert.assertEquals("Женская Матрица Судьбы!", matrix.getHeaderMatrixDestiny());
        Assert.assertEquals(false, matrix.getPersonBrand());
    }
}

