package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


// Sadece @smoke tagine sahip olan senaryolari calistiran runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml"},
        dryRun = false

)

        /*
        "@tag" -> @tag ile etiketlenen senaryolar
        "@tag1 and not @tag2" -> @tag1 ile etiketlenen senaryolar, @tag2 ile etkilenmeyen senaryolar
        "@tag1 and @tag2" -> Her ikisi ile etiketlenen senaryolar @tag1 ve @tag2
        "@tag1 or @tag2" -> @tag1 ya da @tag2 ile etiketlenen senaryolar

        */

public class TagRunner {
}
