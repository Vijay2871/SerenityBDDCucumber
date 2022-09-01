package components.PageActions.Assertion;

import components.PageActions.Common.Common;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AssertionPage extends UIInteractionSteps {

    @Step("Checking the accounts page")
    public void forAccountsPageCheck() throws InterruptedException {
        Assert.assertEquals(Common.getText($(AssertionLocators.ACCOUNTSPAGE_CHECK)), "My account");

    }
}
