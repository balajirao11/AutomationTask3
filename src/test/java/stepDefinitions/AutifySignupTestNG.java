package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.Set;

public class AutifySignupTestNG {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/balajiraogaddam/Softwares/chromedriver"); // Update path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://autify.com/");
    }

    @Test(priority = 1, groups = "Navigation")
    public void clickStudio() {
        WebElement AutifyNextlButton = driver.findElement(By.xpath("//div[contains(text(),'AI-powered test automation built on Playwright for flexible, scalable testing')]"));
        AutifyNextlButton.click();

        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("autify.com/autify-studio-trial-request"), "Did not navigate to trail page");
    }

    @Test(priority = 2, groups = "Submit")
    public void clickSignUpButton() {
       // WebElement signUpButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
       // signUpButton.click();
        try{
            WebElement signUpButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            signUpButton.click();
            System.out.println("submit button");
        }catch(Exception e){
        }
        try{
            WebElement signUpButton = driver.findElement(By.xpath("//input[@class=\"hs-button primary large\"]"));
            signUpButton.click();
            System.out.println("Primary button");
        }catch(Exception e){
        }
        try{
            WebElement signUpButton = driver.findElement(By.xpath("//div[@class=\"hs_submit hs-submit\"]"));
            signUpButton.click();
            System.out.println("no hs-submit button");
        }catch(Exception e){
        }

    }

    @Test(priority = 3, groups = "Validation")
    public void verifyErrorMessages() {
        /*
        WebElement emailError = driver.findElement(By.xpath("//div[@id='email-error']"));
        WebElement passwordError = driver.findElement(By.xpath("//div[@id='password-error']"));
        WebElement termsError = driver.findElement(By.xpath("//div[@id='terms-error']"));

        Assert.assertEquals(emailError.getText(), "Email is required", "Incorrect email error message");
        Assert.assertEquals(passwordError.getText(), "Password is required", "Incorrect password error message");
        Assert.assertEquals(termsError.getText(), "You must accept the terms", "Incorrect terms error message");
        */

        String error_Message = driver.findElement(By.xpath("//label[contains(text(),'Please complete this required field.')][1]")).getText();
        System.out.println("Error Message: " + error_Message);

        if (error_Message.equals("Please complete this required field.")) {
            System.out.println("Error messages are displayed correctly.");
        } else {
            System.out.println("Error messages are not displayed correctly.");
        }

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}

