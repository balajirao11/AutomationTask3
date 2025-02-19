package managers;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
	 
	private WebDriver driver;

//	private HomePage homePage;
	private SignInPage signinPage;
	private FormDetails formDetails;
	private MyAccountPage myaccountPage;
	private MyWishlistsPage mywishlistsPage;
	private SpecificItemPage specificitemPage;

	private ABTestingPage abTestingPage;

	 
	 public PageObjectManager(WebDriver driver) {
		 this.driver = driver;
	 }
	 /*
	public HomePage getHomePage(){
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	*/
	public SignInPage getSignInPage() {
		return (signinPage == null) ? signinPage = new SignInPage(driver) : signinPage;
	}
	public FormDetails getFormDetails() {
		return (formDetails == null) ? formDetails = new FormDetails(driver) : formDetails;
	}
	public MyAccountPage getMyAccountPage() {
		return (myaccountPage == null) ? myaccountPage = new MyAccountPage(driver) : myaccountPage;
	}
	public MyWishlistsPage getMyWishlistsPage(){	 
		 return (mywishlistsPage == null) ? mywishlistsPage = new MyWishlistsPage(driver) : mywishlistsPage;
    }	 
	public SpecificItemPage getSpecificItemPage() {	 
		 return (specificitemPage == null) ? specificitemPage = new SpecificItemPage(driver) : specificitemPage;
	}

	public ABTestingPage getABTestingPage() {

		return (abTestingPage == null) ? abTestingPage = new ABTestingPage(driver) : abTestingPage;
	}


}