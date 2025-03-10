package runners;
 
import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 /*
        //features = "src/test/resources/functionalTests",
   features = Tags.featureFilePath,
 glue= {"stepDefinitions"},
        tags = {Tags.cucumberTag},
 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
 monochrome = true

*/
        features = "src/test/resources/functionalTests/Features",
        glue= {"stepDefinitions"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
 )
 
 
public class TestRunner {
/* @AfterClass
 public static void writeExtentReport() {
 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
 }
 */
}