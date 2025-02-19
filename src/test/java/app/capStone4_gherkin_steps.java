package app;
//package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ABTestingPage;
import pageObjects.HomePage;

public class capStone4_gherkin_steps {

        TestContext testContext;
        HomePage homePage;
       ABTestingPage getabTestingPage;
        public void HomePageSteps(TestContext context) {
            testContext = context;
          //  homePage = testContext.getPageObjectManager().getHomePage();
        }
     public void capStone4Steps(TestContext context) {
        testContext = context;
         getabTestingPage = testContext.getPageObjectManager().getABTestingPage();
    }
        @Given("^I launch the web url$")
        public void I_launch_the_web_url() {
            homePage.navigateTo_HomePage();
            //homePage.clkOnSignInlink();
        }

        @When("^I validated the \"([^\"]*)\"$")
        public void I_validated_the(String arg1) throws Throwable {
            getabTestingPage.validateTitle(arg1);
            // Write code here that turns the phrase above into concrete actions
            //	formDetails.enterFirstName(arg1);
        }

    }
