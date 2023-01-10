package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.AmazonHomepage;
import pages.AmazonSearchPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AmazonStepDefinitions {
    AmazonHomepage hp = new AmazonHomepage(Driver.getDriver());
    AmazonSearchPage sp = new AmazonSearchPage(Driver.getDriver());


    @Given("Kullanici amazon sitesine gider")
    public void kullaniciAmazonSitesineGider() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @When("Kullanici amazonda {string} aratir")
    public void kullaniciAmazondaAratir(String key) {

        hp.searchKeyHitEnter(key);
    }

    @Then("Kullanici arama sonuclarinda {string} gormelidir")
    public void kullaniciAramaSonuclarindaGormelidir(String key) {

        sp.validateResultTextHasKey(key);
    }

    @And("Kullanici ekran goruntusu alir")
    public void kullaniciEkranGoruntusuAlir() throws IOException {
        File file = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date());
        String path = "C:\\Users\\ilyas\\IdeaProjects\\CWCucumberSelenium\\src\\test\\screenshots\\"+date+".png";
        FileUtils.copyFile(file,new File(path));
    }

    @And("Kullanici browser i kapatir")
    public void kullaniciBrowserIKapatir() {
        Driver.closeDriver();
    }
}
