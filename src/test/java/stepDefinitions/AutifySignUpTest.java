package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AutifySignUpTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/balajiraogaddam/Softwares/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://autify.com/");
            driver.manage().window().maximize();
            WebElement AutifyNextlButton = driver.findElement(By.xpath("//div[contains(text(),'AI-powered test automation built on Playwright for flexible, scalable testing')]"));
            AutifyNextlButton.click();
            String parentWindowHandle = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();
           for (String windowHandle : windowHandles) {
                if (!windowHandle.equals(parentWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            try{
                WebElement signUpButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
                signUpButton.click();
                System.out.println("submit button");
            }catch(Exception e){
                System.out.println("No submit button");
            }
              try{
                WebElement signUpButton = driver.findElement(By.xpath("//input[@class=\"hs-button primary large\"]"));
                signUpButton.click();
                System.out.println("Primary button");
               }catch(Exception e){
                System.out.println("no primary button");
               }
            try{
                WebElement signUpButton = driver.findElement(By.xpath("//div[@class=\"hs_submit hs-submit\"]"));
                signUpButton.click();
                System.out.println("no hs-submit button");
            }catch(Exception e){
                System.out.println("no hs-submit button");
            }
       Thread.sleep(2000);

            String error_Message = driver.findElement(By.xpath("//label[contains(text(),'Please complete this required field.')][1]")).getText();
            System.out.println("Error Message: " + error_Message);

            if (error_Message.equals("Please complete this required field.")) {
                System.out.println("Error messages are displayed correctly.");
            } else {
                System.out.println("Error messages are not displayed correctly.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
