package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/homeWork.feature"},
        glue = {"stepdefinitons/GoogleHomework"}
)
public class HomeWorkRunner {


}
