package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import org.junit.Assert;

//this class will take user to the sign on page.
public class HomePageSteps {
	 TestContext testContext;
	 HomePage homePage;
	 public HomePageSteps(TestContext context) {
		 testContext = context;
		// homePage = testContext.getPageObjectManager().getHomePage();
	}
	@Given("^user is on Signon page$")
	public void user_is_on_Signon_page() {
		homePage.navigateTo_HomePage();
		homePage.clkOnSignInlink();
	}

	/*
	@Given("^I launch the cap web url$")
	public void I_launch_the_web_url() {
		homePage.navigateTo_HomePage();
		//homePage.clkOnSignInlink();
	}


	@Given("^I launch the web url$")
	public void I_launch_the_web_url() {
		homePage.navigateTo_HomePage();
		homePage.clkOnSignInlink();
	}

	@When("^I validated the  \"([^\"]*)\"$")
	public void user_type_first_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	//	formDetails.enterFirstName(arg1);
	}
	@When("^I validat the \"([^\"]*)\"$")
	public void I_validated_the(String arg1) throws Throwable {
		homePage.validateTitle(arg1);
		// Write code here that turns the phrase above into concrete actions
		//	formDetails.enterFirstName(arg1);
	}

	@When("I click on ABTesting link")
	public void I_click_ABTestinglink() throws Throwable {
		homePage.abTitle();
		// Write code here that turns the phrase above into concrete actions
		//	formDetails.enterFirstName(arg1);
	}


	@When("^I validate the page as \"([^\"]*)\"$")
	public void I_validate_the(String arg1) throws Throwable {
		homePage.validatePage(arg1);
		// Write code here that turns the phrase above into concrete actions
		//	formDetails.enterFirstName(arg1);
	}

  */

}
