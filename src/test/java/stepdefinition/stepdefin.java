package stepdefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefin {
	
	@When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
	}
	@Then("^Cards are displayed are \"([^\"]*)\"$")
	public void cards_are_displayed_are(String arg1) throws Throwable {
	    System.out.println(arg1);
	}

    @Given("^user is on netbanking landing page$")
    public void user_is_on_netbanking_landing_pge() throws Throwable {
       // throw new PendingException();
    	//script here
    	System.out.println("a");
    }

    @When("^user login into application with usrname and password$")
    public void user_login_into_application_with_usrname_and_password() throws Throwable {
    	// throw new PendingException();
    	//script here
    	System.out.println("b");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	// throw new PendingException();
    	//script here
    	System.out.println("c");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	// throw new PendingException();
    	//script here
    	System.out.println("d");
    }

}