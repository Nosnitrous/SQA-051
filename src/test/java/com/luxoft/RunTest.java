package com.luxoft;

import com.luxoft.steps.Auxiliary;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/luxoft/features",
        glue = "com.luxoft.steps",
//        tags = "",        //"@shout and not @tag1",
        tags = "@web",
        dryRun = false,
        monochrome = false,
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber1.json"}
)
public class RunTest {
    @AfterClass
    static public void closeWebDriver(){
        Auxiliary.wd.close();
    }
}
// Запуск через MAVEN (в терминале IDEA)
// mvn -Dcucumber.options="--tags '@shout'"
