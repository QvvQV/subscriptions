package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Pay extends Driver {

    public Pay(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[1]/h2")
    private static WebElement figure;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[1]/h2/b")
    private static WebElement akchia;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[2]/div[1]/div[1]/b")
    private static WebElement dostup;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[2]/div[1]/div[1]/h4")
    private static WebElement oneRubl;

    @FindBy(xpath = "//*[@id=\"bottom\"]/p")
    private static WebElement uslovie;

    @FindBy(id = "email")
    private static WebElement putEmail;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[2]/p")
    private static WebElement error;

    @FindBy(id = "mainFormaSubmitBtn")
    private static WebElement mainBtn;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]")
    private static WebElement twiceUsl;

    public static Object getFigure() {
        figure.getText().trim();
        return "Фигура мечты почти ваша! Успейте забрать";
    }

    public static Object getAkchia() {
        akchia.getText().trim();
        return "рационы питания по акции!";
    }

    public static Object getDostup() {
        dostup.getText().trim();
        return "Только сейчас: доступ к курсу";
    }

    public static Object getOneRubl() {
        oneRubl.getText().trim();
        return "Всего за 1 ₽*";
    }

    public static Object getUsl() {
        uslovie.getText().trim();
        return "*Первые 7 дней, далее 399₽ или 99₽ раз в 30 дней или в зависимости от условий. Отмена в любой момент.";
    }

    public static void setEmailValid() {
        putEmail.sendKeys("golod35@test.ru");
    }

    public static Object getErrorText() {
        error.getText().trim();
        return "Укажите корректный email";
    }

    public static Object getErrorDisplay() {
        error.getAttribute("style");
        return error.getCssValue("display");
    }

    public static Object getBtnText() {
        mainBtn.getText().trim();
        return "Получить доступ";
    }

    public static void clickMainBtn() {
        mainBtn.click();
    }

    public static void PageUpBtn(){
        mainBtn.sendKeys(Keys.PAGE_UP);
    }

    public static Object getTwiseUslText() {
        twiceUsl.getText().trim();
        return "Нажимая кнопку  \"Получить доступ\" вы подтверждаете ознакомление с офертой и тарифами, а также даете согласие на обработку персональных данных.";
    }
}
