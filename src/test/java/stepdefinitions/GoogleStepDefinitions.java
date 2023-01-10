package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class GoogleStepDefinitions {
    WebDriver driver = Driver.getDriver();
    GoogleSearchPage sp = new GoogleSearchPage(driver);

    @Given("Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
        driver.get("https://www.google.com/");
        sp.acceptCookies();
    }


    @When("Kullanici samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() {
        sp.searchFor("samsung");
    }


    @Then("Kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {

        Assert.assertTrue(driver.getTitle().contains("samsung"));
        Driver.closeDriver();

    }

    @When("Kullanici cucumber kelimesini arar")
    public void kullaniciCucumberKelimesiniArar() {
        sp.searchFor("cucumber");

    }

    @Then("Kullanici sayfada cucumber kelimesi gectigini dogrular")
    public void kullaniciSayfadaCucumberKelimesiGectiginiDogrular() {
        Assert.assertTrue(driver.getTitle().contains("cucumber"));
        Driver.closeDriver();


    }

    @When("Kullanici selenium kelimesini arar")
    public void kullaniciSeleniumKelimesiniArar() {
        sp.searchFor("selenium");
    }

    @Then("Kullanici selenium samsung kelimesi gectigini dogrular")
    public void kullaniciSeleniumSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(driver.getTitle().contains("selenium"));
        Driver.closeDriver();

    }
}