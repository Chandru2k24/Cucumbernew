package RunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cuccumber-reports/Cucumber.html"}, features="src/test/resources/com/feature/SauceDemoLogin.feature",
glue="step")

public class RunnerTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}