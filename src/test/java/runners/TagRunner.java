package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/01_Tags.feature"} ,
        glue = "stepdefinitions",
        tags = "@smoke or @regression",
        dryRun = false  // true yapildiginda test steplerinin dogru bir sekilde olusturup olusturulmadigi kontrol edilir ancak test edilmez !!!
)
public class TagRunner {


}
