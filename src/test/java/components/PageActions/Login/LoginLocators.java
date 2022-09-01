package components.PageActions.Login;


import org.openqa.selenium.By;

public class LoginLocators {
    public static By TWL_SIGNINCLICK = By.xpath("//span[normalize-space()='Sign in']");
    public static By NLG_CLICKSIGNIN = By.xpath("//i[@class='material-icons-outlined'][normalize-space()='person']");
    public static By USERNAME = By.xpath("//input[@id='login-form-email']");
    public static By HOVER_SIGNIN =By.xpath("//span[normalize-space()='Sign in']");
    public static By HOVER_CREATEACCOUNT =By.linkText("CREATE ACCOUNT");
    public static By PASSWORD = By.xpath("//input[@id='login-form-password']");
    public static By CLICK_SIGN_IN = By.xpath("//button[normalize-space()='Sign In']");
    public static By AGREE_POPUP= By.xpath("//*[@class='login-submit btn btn-block btn-container']");


}
