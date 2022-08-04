import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature"}
)

public class CukesFeatureRunnerTest {

    @BeforeClass
    public static void executeBeforeTests() {
        WebDriverManager.chromedriver().driverVersion("103").setup();
        //Configuration.headless = true;
        Configuration.browserSize = "1600x900";
    }

    @AfterClass
    public static void executeAfterTests() {

    }
}