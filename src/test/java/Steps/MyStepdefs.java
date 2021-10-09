package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("userIsOnLoginPage()");
    }

    @When("user enters user name and password")
    public void userEntersUserNameAndPassword() {
        System.out.println("userEntersUserNameAndPassword()");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("clickOnLoginButton()");
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage()");
    }
}
