package stepDefinitions;


    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import java.util.Set;

public class AutifyTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/balajiraogaddam/Softwares/chromedriver");
         WebDriver driver = new ChromeDriver();
        try {
             driver.get("https://autify.com/");
             driver.manage().window().maximize();
            WebElement AutifyNextButton = driver.findElement(By.xpath("//div[contains(text(),'AI-powered test automation built on Playwright for flexible, scalable testing')]"));
            //WebElement AutifyNextButton = driver.findElement(By.xpath("//span[@class=\"green-span\" and contains(text(),\"Mobile\")]"));
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
            driver.close();
            driver.switchTo().window(parentWindowHandle);
            System.out.println("Parent Window Title: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
