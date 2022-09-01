package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.FileNotFoundException;

import static components.utils.Enums.Logincredentials.REGISTERED_USER;

public class signInSteps extends AbstractSteps {

    @Given("I login as a registered user")
    public void i_login_as_a_registered_user() throws FileNotFoundException, InterruptedException {
        naviagte.toTWLurl();
        //user.createAccountClick();
        user.clickSignIn();
        user.enterUsername();
        user.enterPassword(REGISTERED_USER);
        user.clickOk();
        user.clickAgreePopUp();

    }

    @Then("I can see the accounts page")
    public void i_can_see_the_accounts_page() throws InterruptedException {
        assertionCheck.forAccountsPageCheck();
    }

    @Given("I login as a registered user on Noel Leeming")
    public void i_login_as_a_registered_user_on_noel_leeming() throws InterruptedException {
        naviagte.toNLGurl();
        user.nlgSignIn();

    }
}
