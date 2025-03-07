package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class kontacts extends Driver {

    public kontacts(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(1) > div.flex.flex-col > span")
    private static WebElement number;

    public static String getTextNumber() {
        return number.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(2) > div.flex.flex-col > span")
    private static WebElement telephone;

    public static String getTextTelephone() {
        return telephone.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(2) > div.flex.flex-col > a")
    private static WebElement support;

    public static String getTextSupport() {
        return support.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(3) > div.flex.flex-col > span")
    private static WebElement questions;

    public static String getTextQuestions() {
        return questions.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(3) > div.flex.flex-col > a")
    private static WebElement info;

    public static String getTextInfo() {
        return info.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > div > p:nth-child(1)")
    private static WebElement ogrn;

    public static String getOgrn() {
        return ogrn.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > div > p:nth-child(2)")
    private static WebElement Inn;

    public static String getInn() {
        return Inn.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div.w-full.max-w-\\[690px\\].flex.flex-col.py-10.px-12.contactUsForm.rounded-\\[25px\\].max-sm\\:p-\\[30px\\].font-nunito > form > button")
    private static WebElement btn;

    public static void PgEnd() {
        btn.sendKeys(Keys.END);
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.pt-\\[60px\\].max-sm\\:pt-10.font-nunito > h2")
    private static WebElement search;

    public static String getSearch() {
        return search.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(4) > div.flex.flex-col > span.text-\\[\\#161616\\].text-\\[24px\\].font-bold.leading-\\[130\\%\\].max-w-\\[495px\\].max-sm\\:text-\\[14px\\]")
    private static WebElement adres;

    public static String getAdres() {
        return adres.getText().trim();
    }

    @FindBy(css = "body > footer > div > div.relative.w-full.flex.items-start.justify-between.gap-\\[40px\\].max-\\[1080px\\]\\:flex-wrap.max-md\\:gap-\\[12px\\].max-md\\:flex-col > section.w-full.h-full.min-h-\\[368px\\].max-w-\\[400px\\].flex.flex-col.justify-between.max-\\[1280px\\]\\:max-w-max.max-md\\:min-h-max.max-md\\:flex-row.max-md\\:max-w-full.max-md\\:justify-between.max-md\\:mb-\\[13px\\] > div.w-full.flex.flex-col.gap-\\[30px\\] > p.w-full.max-w-\\[250px\\].text-\\[\\#747375\\].text-\\[12px\\].max-md\\:hidden")
    private static WebElement footer;

    public static String getFooter() {
        return footer.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section.w-full.flex.items-center.justify-between.gap-\\[60px\\].max-xl\\:flex-col.max-sm\\:gap-\\[30px\\] > div:nth-child(1) > ul > li:nth-child(1) > div.flex.flex-col > a")
    private static WebElement numberTel;

    public static String getNumbetTel() {
        return numberTel.getText().trim();
    }

    @FindBy(id = "mainFormaSubmitBtn")
    private static WebElement btnLand;

    public static void PgEndLand() {
        btnLand.sendKeys(Keys.END);
    }

    @FindBy(css = "body > footer > div > div.relative.w-full.flex.items-start.justify-between.gap-\\[40px\\].max-\\[1080px\\]\\:flex-wrap.max-md\\:gap-\\[12px\\].max-md\\:flex-col > section.w-full.h-full.min-h-\\[368px\\].max-w-\\[400px\\].flex.flex-col.justify-between.max-\\[1280px\\]\\:max-w-max.max-md\\:min-h-max.max-md\\:flex-row.max-md\\:max-w-full.max-md\\:justify-between.max-md\\:mb-\\[13px\\] > div.w-full.flex.flex-col.gap-\\[30px\\] > p.w-full.max-w-\\[340px\\].text-\\[\\#747375\\].text-\\[12px\\].max-md\\:hidden")
    private static WebElement fotter1;

    public static String getFotter1() {
        return fotter1.getText().trim();
    }

    @FindBy(css = "body > div.w-full.max-w-\\[1400px\\].flex.flex-col.mx-auto.px-10.py-\\[60px\\].max-sm\\:py-10.max-sm\\:px-5.font-nunito > section > div:nth-child(1) > p")
    private static WebElement online;

       public static String getOnline() {
        return online.getText().trim();
    }
}
