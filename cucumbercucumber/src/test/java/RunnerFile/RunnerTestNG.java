package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports/Cucumber.html"}, features="src/test/resources/com/feature/SaucedemoLogin.feature",
glue="step")
public class RunnerTestNG extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}