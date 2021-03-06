package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {
	WebDriver driver;
	public MyAccountPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//My Account page object - Capture the logged in user name
	@FindBy(how = How.XPATH, using = "//*[@class='header_user_info'][1]")
	private static WebElement loggedInUserName;
	//My Account page object - My Wishlists link
	@FindBy(how = How.XPATH, using = "//span[text()='My wishlists']")
	private static WebElement lnkmyWishlists;
	
	//My Account page object - My Personal info link
	@FindBy(how = How.XPATH, using = "//span[text()='My personal information']")
	private static WebElement lnkmyPerinfo;
	
	
	//My Account page object - Quantity field in wishlists table
	@FindBy(how = How.XPATH, using = "//table[@class='table table-bordered']/tbody/tr[1]/td[2]")
	private static WebElement qntyInWishlistsTable;
	//My T-shirt page - T-shirt link object
	@FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']//li[2]//a[@title='T-shirts']")
	public static WebElement tshirts;
		
	
	//My Account page object - Sign out button
	@FindBy(how = How.XPATH, using = "//*[@title='Log me out']")
	private static WebElement signoutbtn;
	
	//The below method compares the page title and returns true/false
	public boolean comparePageTitle() {
		String pgTitleDisplayed = driver.getTitle();
		if(pgTitleDisplayed.contains("My account - My Store")) {
			System.out.println("user logged in successfully and the title of the page is: "+pgTitleDisplayed);
			return true;
		}
		else {
			System.out.println("user not logged in successfully and the title of the page is: "+pgTitleDisplayed);
			return false;
		}
	}
	
	//The below method Verify the registered user logged in or not and returns true/false
	public boolean verifyloggedInUserName(String arg1, String arg2) {
		String dispUserName = loggedInUserName.getText();
		String inputUserName = arg1+" "+arg2;
		System.out.println(inputUserName);
		System.out.println(dispUserName);
		if(inputUserName.equalsIgnoreCase(dispUserName)) {
			System.out.println("user name displayed after logged in: "+dispUserName);
			return true;
		}
		else {
			System.out.println("user name not displayed as expected after logged in: "+dispUserName);
			return false;
		}
	}
	
	//The below method checks My Wishlists link displayed in the page and returns true/false
	public boolean verifyMywishlistlnkDisplayed(String arg1) {
		String linkTextDisplayed = lnkmyWishlists.getText();
		if(linkTextDisplayed.equalsIgnoreCase(arg1)) {
			System.out.println("my wishlists link displayed.");
			return true;
		}
		else {
			System.out.println("my wishlists didn't displayed.");
			return false;
		}
	}
	
	//The below method clicks on My Wishlists link
	public void clkMyWishlistslink() {
		lnkmyWishlists.click();
	}
	
	//The below method checks My personal information link displayed in the page and returns true/false
		public boolean verifyMyperinfolnkDisplayed(String arg1) {
			String linkTextDisplayed = lnkmyPerinfo.getText();
			if(linkTextDisplayed.equalsIgnoreCase(arg1)) {
				System.out.println("my personal info link displayed.");
				return true;
			}
			else {
				System.out.println("my personalinfo didn't displayed.");
				return false;
			}
		}
		
		//The below method clicks on My Personal info link
		public void clkMypersinfolink() {
			lnkmyPerinfo.click();
		}
	
	
	
	//The below method Verifies my wishlists quantity is 1 for the newly registered user and returns true/false
	public boolean VerifyTheQuantityequalsToOne() {
		String quantitydisplayed = qntyInWishlistsTable.getText();
		int quntydisp = Integer.parseInt(quantitydisplayed);
		if(quntydisp == 1) {
			System.out.println("Item added successfully to the wishlist");
			return true;
		}
		else {
			System.out.println("Item is not added successfully to the wishlist");
			//driver.close();
			//throw new Error("validation failed");
			return false;
		}
	}

	public void tshirtsTab() {
		WebElement tShirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", tShirt);
		
		/*WebElement image = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		Actions action = new Actions(driver);
		action.moveToElement(image).build().perform();
		*/

		
		WebElement addCart = driver.findElement(By.xpath("//div[@class=\"button-container\"]//span[contains(text(),'Add to cart')]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", addCart);
	
	}
	
	//The below method clicks on sign out button
	public void logoutfromTheApplication() {
		
		
		signoutbtn.click();
	}
	
}
