package starter.twl;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class SignIn extends UIInteractionSteps{
    public void signIn()  {
        $("//i[@class='material-icons-outlined'][normalize-space()='person']").click();
        $("//input[@id='login-form-email']").sendKeys("vijaytest@gmail.com");
        $("//input[@id='login-form-password']").sendKeys("Test123!");
        $("//button[normalize-space()='Sign In']").click();
    }
}
