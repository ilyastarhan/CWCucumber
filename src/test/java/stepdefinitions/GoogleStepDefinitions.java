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

    @Given("Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {

        Driver.getDriver().get("https://www.google.com/");
    }


    @When("Kullanici samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("samsung");

    }


    @Then("Kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();
    }
}