package steps;


import components.PageActions.Assertion.AssertionPage;
import components.PageActions.Common.Common;
import components.PageActions.HostURL.LaunchUrl;
import components.PageActions.Login.LoginActions;
import net.thucydides.core.annotations.Steps;

public class AbstractSteps {

    @Steps
    LaunchUrl naviagte;
    LoginActions user;
    AssertionPage assertionCheck;
    Common common;

}
