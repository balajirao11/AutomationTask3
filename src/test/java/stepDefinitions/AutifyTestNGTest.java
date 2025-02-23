package stepDefinitions;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

        import java.util.Set;

public class AutifyTestNGTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/balajiraogaddam/Softwares/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups = {"windowHandling"})
    public void testAutifyNextButton() {
        driver.get("https://autify.com/");
        driver.manage().window().maximize();
        WebElement AutifyNextButton = driver.findElement(By.xpath("//div[contains(text(),'AI-powered test automation built on Playwright for flexible, scalable testing')]"));
        AutifyNextButton.click();

        String parentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        String childWindowTitle = driver.getTitle();
        System.out.println("Child Window Title: " + childWindowTitle);

        Assert.assertTrue(childWindowTitle.contains("Autify Studio:"), "Child window title is incorrect.");
        driver.close();

        driver.switchTo().window(parentWindowHandle);
        String parentWindowTitle = driver.getTitle();
        System.out.println("Parent Window Title: " + parentWindowTitle);

        Assert.assertTrue(parentWindowTitle.contains("Autify｜AI and Quality"), "Parent window title is incorrect.");
    }

    @AfterClass
    public void tearDown() {
        // Close the parent window and quit the driver
        driver.quit();
    }
}