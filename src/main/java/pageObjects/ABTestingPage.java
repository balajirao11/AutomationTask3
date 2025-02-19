package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ABTestingPage {
	WebDriver driver;

	public ABTestingPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//User account creation details page - Radio button Mr
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Title')]//following::input[1]")
	private static WebElement rbGener1;
	//User account creation details page - Radio button Mrs
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Title')]//following::input[2]")
	private static WebElement rbGener2;
	//User account update - First Name field
	@FindBy(how=How.XPATH,using = "//*[@id='firstname']")
	private static WebElement updFirstName;
	//User account creation details page - First Name field
	@FindBy(how=How.XPATH,using = "//*[@id='customer_firstname']")
	private static WebElement txtFirstName;
	//User account creation details page - Last Name field
	@FindBy(how=How.XPATH,using = "//*[@id='customer_lastname']")
	private static WebElement txtLastName;
	//User account creation details page - Password field
	@FindBy(how = How.XPATH, using = "//*[@id='passwd']")
	private static WebElement txtPassword;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),\"Welcome to the-internet\")]")
	private static WebElement valTile;


	//User account update page - old Password field
	@FindBy(how = How.XPATH, using = "//*[@id='old_passwd']")
	private static WebElement oldPassword;
	
	
	//User account creation details page - Address line1 field
	@FindBy(how = How.XPATH, using = "//*[@id='address1']")
	private static WebElement txtAddress;
	//User account creation details page - City field
	@FindBy(how = How.XPATH, using = "//*[@id='city']")
	private static WebElement txtCity;
	//User account creation details page - State drop down list field
	@FindBy(how = How.XPATH, using = "//*[@id='id_state']")
	private static WebElement listState;
	//User account creation details page - Zip/Postal code field
	@FindBy(how = How.XPATH, using = "//*[@id='postcode']")
	private static WebElement txtPostCode;
	//User account creation details page - Country drop down list field
	@FindBy(how = How.XPATH, using = "//*[@id='id_country']")
	private static WebElement listCountry;
	//User account creation details page - Mobile number field
	@FindBy(how = How.XPATH, using = "//*[@id='phone_mobile']")
	private static WebElement txtMobileNumber;
	//User account creation details page - Alias name field
	@FindBy(how = How.XPATH, using = "//*[@id='alias']")
	private static WebElement txtAlias;
	//User account creation details page - Register button to create the account
	@FindBy(how = How.XPATH, using = "//span[text()='Register']")
	private static WebElement btnRegister;
	//User click on proceed to checkout
	@FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")	                              
	private static WebElement btnCheckout;
	//User account personal info update page - Save button to update first name
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	private static WebElement btnSave;
	
	//The below method checks the input and select Mr/Mrs based on that.
	public void selectRBtnasPerInput(String arg1) {
		String title1 = "mr";
		String title2 = "mrs";
		if(title1.equalsIgnoreCase(arg1)) {
			rbGener1.click();
		}
		else if(title2.equalsIgnoreCase(arg1)) {
			rbGener2.click();
		}
		else {
			System.out.println("not a valid input"+arg1);	
		}
			
	}
	
	
	//The below method enter First name
	public void updateFirstName(String arg1) {
		updFirstName.sendKeys(arg1);
	}

	
	//The below method enter First name
	public void enterFirstName(String arg1) {
		txtFirstName.sendKeys(arg1);
	}

	public void validateTitle(String arg1) {
		System.out.println("text:" + arg1);
		String titleExp = null;
		try {
			//String titleExp = driver.findElement(valTile).getText();
			titleExp = driver.findElement(By.xpath(String.valueOf(valTile))).getText();
			System.out.println("Title name:" + titleExp);
		} catch (Exception e) {
			System.out.println("Title name:" + titleExp);
		}
	}
	//The below method enter Last name
	public void enterSurName(String arg1) {
		txtLastName.sendKeys(arg1);
	}
	
	//The below method enter Password
	public void enterPassword(String arg1) {
		txtPassword.sendKeys(arg1);
	}
	
	public void currentPassword(String arg1) {
		oldPassword.sendKeys(arg1);
	}
	//The below method enter Address line1 mandatory field
	public void enterAddressline1(String arg1) {
		txtAddress.sendKeys(arg1);
	}
	
	//The below method enter City name
	public void enterCity(String arg1) {
		txtCity.sendKeys(arg1);
	}
	
	//The below method selects the state from dropdown list
	public void selectState(String arg1) {
		listState.click();
		 Select dropdownState = new Select(listState);
		 dropdownState.selectByVisibleText(arg1);
	}
	
	//The below method enter zip/postal code
	public void enterPostalCode(String arg1) {
		txtPostCode.sendKeys(arg1);
	}
	
	//The below method selects the country from dropdown list
	public void selectCountry(String arg1) {
		listCountry.click();
		 Select dropdownCountry = new Select(listCountry);
		 dropdownCountry.selectByVisibleText(arg1);
	}
	
	//The below method enter Mobile number
	public void enterMobileNum(String arg1) {
		txtMobileNumber.sendKeys(arg1);
	}
	
	//The below method enter Alias name
	public void enterAliasName(String arg1) {
		txtAlias.clear();
		txtAlias.sendKeys(arg1);
	}
	
	//The below method clicks on Registration button to complete the new user registration
	public void clkOnRegistration() {
		btnRegister.click();
	}
	
	public void clkOnProceedCheckout() {
		
		WebElement btnCheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", btnCheckout);
	
		driver.navigate().refresh();
	}
	
	public void clkOnSave() {
		btnSave.click();
	}
}
