package components.PageActions.HostURL;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LaunchUrl extends UIInteractionSteps {

    @Step("Launch the TWL website")
    public void toTWLurl() {
        openPageNamed("twlBaseUrl");
    }
    @Step("Launch the NLG website")
    public void toNLGurl() {
        openPageNamed("nlgBaseUrl");
    }
}
