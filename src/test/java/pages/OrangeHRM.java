package pages;

import org.hamcrest.Factory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM {

    private WebDriver driver;

    public OrangeHRM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;

    @FindBy(className = "oxd-alert-content-text")
    private WebElement errMessage;

    public void typeUsername(String text){
        username.sendKeys(text);
    }
    public void typePassword(String text){
        password.sendKeys(text);
    }
    public void clickLogin(){
        submit.click();
    }
    public void loginAsAdmin(){
        typePassword("admin123");
        typeUsername("Admin");
        clickLogin();
    }
    public void verifyErrMessageContains(String message){
        Assert.assertTrue(errMessage.getText().contains(message));

    }

}
