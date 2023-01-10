package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleHomework {
    private WebDriver driver = Driver.getDriver();
    GoogleSearchPage sp = new GoogleSearchPage(driver);

    @When("kulanici cucumber icin arama yapar")
    public void kulaniciCucumberIcinAramaYapar() {
        sp.acceptCookies();
        sp.searchFor("cucumber");
    }

    @Then("sayfa basliginin cucumber kelimesi icerdigini test eder")
    public void sayfaBasligininCucumberKelimesiIcerdiginiTestEder() {
        Assert.assertTrue(driver.getTitle().contains("cucumber"));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("kulanici selenium icin arama yapar")
    public void kulaniciSeleniumIcinAramaYapar() {
        sp.acceptCookies();
        sp.searchFor("selenium");
    }

    @Then("sayfa basliginin selenium kelimesi icerdigini test eder")
    public void sayfaBasligininSeleniumKelimesiIcerdiginiTestEder() {
        Assert.assertTrue(driver.getTitle().contains("selenium"));
    }

    @When("kulanici samsung icin arama yapar")
    public void kulaniciSamsungIcinAramaYapar() {
        sp.acceptCookies();
        sp.searchFor("samsung");
    }

    @Then("sayfa basliginin samsung kelimesi icerdigini test eder")
    public void sayfaBasligininSamsungKelimesiIcerdiginiTestEder() {
        Assert.assertTrue(driver.getTitle().contains("samsung"));
    }

}
