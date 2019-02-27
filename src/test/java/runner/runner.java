package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {

        "src/test/resources/features/login/login.feature"

},

        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"},

        glue = {"login"

        })
public class runner extends AbstractTestNGCucumberTests {

}