package starter.twl;


import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class twlTest  {

    @Steps
    LaunchUrl url;
    SignIn registeredUser;

    @Test
    public void twlSignIn() {
        url.getTwlUrl();
        registeredUser.signIn();

    }
}
