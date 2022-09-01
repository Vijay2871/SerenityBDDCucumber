package components.PageActions.Login;


import components.PageActions.Common.Common;
import components.PageActions.OCAPIResponse.OCAPILogin;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import components.utils.Enums.Logincredentials;

import java.io.FileNotFoundException;

import static components.PageActions.Common.Common.*;


public class LoginActions extends UIInteractionSteps {
    Common common = new Common();

    @Step("Log In as a Registered user")
    public void clickSignIn() throws InterruptedException, FileNotFoundException {
        clickAction($(LoginLocators.TWL_SIGNINCLICK).waitUntilClickable());
        //  System.out.println(LoginLocators.TWL_SIGNINCLICK);

    }
    @Step("Click sign in")
    public void clickOk() throws InterruptedException, FileNotFoundException {
        clickAction($(LoginLocators.CLICK_SIGN_IN).waitUntilClickable());
        Thread.sleep(7000);
    }

    @Step("Migrate to Marketclub member")
    public void clickAgreePopUp() throws InterruptedException, FileNotFoundException {
        clickActionPopUp($(LoginLocators.AGREE_POPUP).waitUntilClickable(), Keys.ENTER);
    }
    @Step("Enter username")
    public void enterUsername() throws InterruptedException, FileNotFoundException {
        setText($(LoginLocators.USERNAME).waitUntilPresent(), OCAPILogin.ocapiAuth().getEmail());
    }

    @Step("Enter password")
    public void enterPassword(Logincredentials credentials) throws InterruptedException, FileNotFoundException {
        setText($(LoginLocators.PASSWORD).waitUntilVisible(), (credentials.getPassword()));
    }

    public void nlgSignIn() throws InterruptedException {
        clickAction($(LoginLocators.NLG_CLICKSIGNIN).waitUntilClickable());
    }

    public void createAccountClick() throws InterruptedException {

        common.hoverAction(LoginLocators.HOVER_SIGNIN,$(LoginLocators.HOVER_SIGNIN),$(LoginLocators.HOVER_CREATEACCOUNT));

    }
}
