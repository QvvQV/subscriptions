package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class matrix extends Driver {

    public matrix(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#app > main > div > section.quiz-item.quiz-item--1.active > section > div > div > h1")
    private static WebElement header1;

    public static String getHeader(){
        return header1.getText().trim();
    }

    @FindBy(css = "#app > main > div > section.quiz-item.quiz-item--1.active > section > div > div > p")
    private static WebElement start;

    public static String getStart(){
        return start.getText().trim();
    }

    @FindBy(css = "#app > main > div > section.quiz-item.quiz-item--1.active > section > div > div > button")
    private static WebElement btn;

    public static String setBtn(){
        return btn.getText().trim();
    }

    @FindBy(css = "#app > main > div > section.quiz__section.quiz__section--1.quiz__section--active > div > section.intro > div > div.intro__head > h1")
    private static WebElement headerMatrixDestiny;

    public static String getHeaderMatrixDestiny(){
        return headerMatrixDestiny.getText().trim();
    }

    @FindBy(id = "personal-brand")
    private static WebElement personBrand;

    public static boolean getPersonBrand(){
        return personBrand.isEnabled();
    }
}