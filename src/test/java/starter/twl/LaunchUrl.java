package starter.twl;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class LaunchUrl extends UIInteractionSteps {
    public void getTwlUrl() {
        openUrl("https://thewarehouse-beta.office-supplies.co.nz/");
    }
}
