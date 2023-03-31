package Test.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/YMusic-Positive-Case.json",
                "html:target/cucumber-reports/YMusic-Positive-Case.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/FHomeDetail/YMusic-PositiveCase.feature",
        glue = {"Test/stepDefs"},
        monochrome = true,
        dryRun = false,
        tags = "@YMusicCase-PositiveCase"S
)

public class testRunner extends AbstractTestNGCucumberTests {
}
