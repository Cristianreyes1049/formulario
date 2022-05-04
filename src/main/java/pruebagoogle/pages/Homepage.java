package pruebagoogle.pages;
//package io.github.picodotdev.blogbitix.holamundoapachepoi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homepage {

    WebDriver driver;
    By searchField1 = By.name("Name_First");
    By searchField2 = By.name("Name_Last");
    By birthDate1 = By.xpath("//span/div/input[@id=\"Date-date\"]");
    By radio1 = By.xpath("//span/input[@id=\"Radio_1\"]");
    By radio2 = By.xpath("//span/input[@id=\"Radio_2\"]");


    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertName(String text) {
        driver.manage().window().maximize();
        driver.findElement(searchField1).sendKeys(text);
    }

    public void insertLastName(String text2) {
        driver.findElement(searchField2).sendKeys(text2);
    }

    public void birthDate(String dateTime) {

        driver.findElement(birthDate1).sendKeys(dateTime);
        //driver.findElement(birthDate1).sendKeys(Keys.ENTER);
        driver.findElement(birthDate1).sendKeys(Keys.TAB);

      /*  try {
            driver.wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }


    public void gender(String gender) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(birthDate1).sendKeys(Keys.ENTER);

        if ("Male".equals(gender)) {
            //WebElement element = driver.findElement(radio1);
            //int width = element.getSize().getWidth();
            wait.until(ExpectedConditions.elementToBeClickable(radio1));
            //Actions act = new Actions(driver);
            //act.moveToElement(element).moveByOffset((width / 2) - 2, 0).click();
            driver.findElement(radio1).click();

        } else {
            wait.until(ExpectedConditions.elementToBeClickable(radio2));
            driver.findElement(radio2).click();
        }
    }

    public void country(String text3) {

        Select drpCountry = new Select(driver.findElement(By.name("Address1_Country")));
        drpCountry.selectByVisibleText(text3);

    }

    public void marital(String text4) {

        Select drpMarital = new Select(driver.findElement(By.name("MultipleChoice-multiple")));
        drpMarital.selectByVisibleText(text4);
        //driver.findElement(birthDate1).sendKeys(Keys.PAGE_DOWN);

    }

    public void education(String text5) {

        Select drpEducation = new Select(driver.findElement(By.name("Dropdown")));
        drpEducation.selectByVisibleText(text5);

    }

    public void reference1(String text6,String text7,String text8) {
        By firstname = By.name("Name1_First");
        By lastname = By.name("Name1_Last");
        By email1 = By.name("Email1");
        driver.findElement(firstname).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(firstname).sendKeys(text6);
        driver.findElement(lastname).sendKeys(text7);
        driver.findElement(email1).sendKeys(text8);
    }

    public void reference2(String text6,String text7,String text8) {
        By firstname2 = By.name("Name2_First");
        By lastname2 = By.name("Name2_Last");
        By email12 = By.name("Email2");
        driver.findElement(firstname2).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(firstname2).sendKeys(text6);
        driver.findElement(lastname2).sendKeys(text7);
        driver.findElement(email12).sendKeys(text8);
    }

    public void clickApply() {
        By click = By.xpath("//div/div/button[@elname=\"submit\"]");
        driver.findElement(click).click();
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            // Manejar excepción
            e.printStackTrace();
        }
    }

    public void PendingException() {

    }

}
