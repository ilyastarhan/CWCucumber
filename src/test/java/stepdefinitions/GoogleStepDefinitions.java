package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchPage;
import utilities.Driver;

import java.time.Duration;

public class GoogleStepDefinitions {
    @Given("kullanici google sayfasina gider")
    public void kullaniciGoogleSayfasinaGider() {

        Driver.getDriver().get("https://www.google.com");
    }

    @When("kullanici samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() throws InterruptedException {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.acceptCookies();
        sp.searchFor("samsung");
        Thread.sleep(3000);
    }

    @Then("kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
        Driver.getDriver().close();

    }

}
