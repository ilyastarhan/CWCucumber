package stepdefinitions;

import io.cucumber.java.en.*;

public class FirstStepDefinition {

    @Given("ilk feature icin cucumber indirdim")
    public void ilk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step calisti");
    }
    @When("Senaryoumu calistirdigimda")
    public void senaryoumu_calistirdigimda() {
        System.out.println("When step calisti");
    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then step calisti");
    }

}