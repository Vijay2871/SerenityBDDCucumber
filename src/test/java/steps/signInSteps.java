package steps;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.twl.LaunchUrl;
import starter.twl.SignIn;

public class signInSteps {

    @Steps
    LaunchUrl url;
    SignIn registeredUser;

    @Given("I login as a registered user")
    public void i_login_as_a_registered_user() {
        url.getTwlUrl();
        registeredUser.signIn();
    }
}
