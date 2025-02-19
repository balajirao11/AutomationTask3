package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import managers.FileReaderManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;
public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Below method will launch the applicaton URL
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	//Sign in link - Home Page object
	@FindBy(how=How.XPATH,using = "//*[contains(text(),'Sign in')]")
	private static WebElement lnkSignIn;
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),\"internet\")]")
	private static WebElement valTile;

	@FindBy(xpath ="//h1[@class= \"heading\" and contains(text(),\"Welcome to the-internet\")]")
	private static WebElement valTile1;

	@FindBy(xpath ="//a[@href=\"/abtest\"]")
	private static WebElement abTestlink;



	//h1[@class= "heading" and contains(text(),"Welcome to the-internet")]
	
	//Below method clicks on the Sign in link from the Home page
	public void clkOnSignInlink() {
		lnkSignIn.click();
	}

	public void validateTitle(String arg1) {

		System.out.println("text:" + arg1);
		String titleExp = "Welcome to the-internet";
		try {
			//String titleExp = driver.findElement(By.xpath("//h1[@class= \"heading\" and contains(text()= '"+titleName+"']")).getText();
			String titleAct = driver.findElement(By.xpath("//h1[contains(text(),\"Welcome\")]")).getText();
			System.out.println("Title name:" + titleAct);
			Assert.assertTrue(titleExp.equals(titleAct));
		} catch (Exception e) {

		}
	}

	public void abTitle() {
		try {
			abTestlink.click();
			Thread.sleep(5000);
			System.out.println("AB Test link clicked");
		} catch (Exception e) {
			System.out.println("AB Test link not clicked");
		}
	}


	public void validatePage(String arg1) {

		System.out.println("text:" + arg1);
		String titlePageExp = arg1;
		String titlePageAct = "";

		try {
			titlePageAct = driver.findElement(By.xpath("//h3[contains(text(),\"A/B Test\")]")).getText();
			System.out.println("Title Page:" + titlePageAct);
			Assert.assertTrue(titlePageExp.equals(titlePageAct));
		} catch (Exception e) {
			Assert.assertTrue(titlePageExp.equals(titlePageAct));
			System.out.println("Title Page not matched: Pass");
		}
	}
	
}
