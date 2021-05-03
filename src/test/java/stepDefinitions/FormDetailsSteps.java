package stepDefinitions;
import org.openqa.selenium.interactions.Actions;

import cucumber.TestContext;
import pageObjects.FormDetails;
import cucumber.api.java.en.When;
public class FormDetailsSteps {
	TestContext testContext;
	FormDetails formDetails;
	public FormDetailsSteps(TestContext context) {
		 testContext = context;
		 formDetails = testContext.getPageObjectManager().getFormDetails();
		 }
	
	@When("^user select title \"([^\"]*)\"$")
	public void user_select_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		formDetails.selectRBtnasPerInput(arg1);
	}
@When("^user update first name \"([^\"]*)\"$")
public void user_update_first_name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	formDetails.updateFirstName(arg1);
}


@When("^user type first name \"([^\"]*)\"$")
public void user_type_first_name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	formDetails.enterFirstName(arg1);
}


@When("^user type sur name \"([^\"]*)\"$")
public void user_type_sur_name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	formDetails.enterSurName(arg1);
}

@When("^user enter password \"([^\"]*)\"$")
public void user_enter_password(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.enterPassword(arg1);
}

@When("^user current password \"([^\"]*)\"$")
public void user_current_password(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.currentPassword(arg1);
}

@When("^user enter address \"([^\"]*)\"$")
public void user_enter_address(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.enterAddressline1(arg1);
}

@When("^user enter city \"([^\"]*)\"$")
public void user_enter_city(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.enterCity(arg1);
}

@When("^user select the state \"([^\"]*)\"$")
public void user_select_the_state(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.selectState(arg1);
}

@When("^user enter the zip \"([^\"]*)\"$")
public void user_enter_the_zip(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.enterPostalCode(arg1);
}

@When("^user select the country \"([^\"]*)\"$")
public void user_select_the_country(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   formDetails.selectCountry(arg1);
}

@When("^user enter mobile phone \"([^\"]*)\"$")
public void user_enter_mobile_phone(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   formDetails.enterMobileNum(arg1);
}

@When("^user enter address alias \"([^\"]*)\"$")
public void user_enter_address_alias(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    formDetails.enterAliasName(arg1);
}

@When("^click on Register Button$")
public void click_on_Register_Button() throws Throwable{
	formDetails.clkOnRegistration();
}

@When("^click on Checkout Button$")
public void click_on_Proceed_to_checkout_Button() throws Throwable{	
	formDetails.clkOnProceedCheckout();
}


@When("^click on save Button$")
public void click_on_save_Button() throws Throwable{
	formDetails.clkOnSave();
}

}