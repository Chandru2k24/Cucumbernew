package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"}, features="src/test/resources/com/feature/SaucedemoLogin.feature",
glue="step",tags=("@ValidCredentials or  @InvalidCredentials(username)"))
public class RunnerTestNG extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}