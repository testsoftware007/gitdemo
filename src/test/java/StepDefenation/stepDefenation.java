package StepDefenation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefenation {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
       
    }

    @When("^User login to the application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_the_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
    {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
      
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        
    }

}