package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleSearchPage {
    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "q")
    private WebElement searchText;


    public void searchFor(String value) {
        searchText.sendKeys(value + Keys.ENTER);

    }
    @FindBy(id = "L2AGLb")
    WebElement cookie;

    public void acceptCookies(){
        cookie.click();
    }

}