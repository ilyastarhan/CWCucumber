package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public abstract class AbstractClass {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickFunction(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public void selectElementByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByIndex(WebElement element, int value){
        Select select = new Select(element);
        select.selectByIndex(value);
    }
    public void selectElementByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
