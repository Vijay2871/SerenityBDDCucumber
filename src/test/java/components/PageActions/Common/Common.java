package components.PageActions.Common;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Common extends UIInteractionSteps {

    public static void setText(WebElement webElement, String text) throws InterruptedException {
        webElement.clear();
        webElement.sendKeys(text);
    }

    public static void clickAction(WebElement webElement) throws InterruptedException {
        webElement.click();
    }

    public static void clickActionPopUp(WebElement webElement, Keys enter) throws InterruptedException {
        webElement.click();
        Thread.sleep(3000);
    }

    public static String getText(WebElement webElement) throws InterruptedException {
        return webElement.getText().trim();

    }

    public void hoverAction(By locator, WebElement webElement1, WebElement webElement2) throws InterruptedException {

        System.out.println(getImplicitWaitTimeout().getSeconds());
        Thread.sleep(3000);
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(locator);
        withAction().moveToElement(webElement1).perform();
        withAction().moveToElement(webElement2).click().build().perform();
        Thread.sleep(3000);
        //waitFor(ExpectedConditions.elementToBeClickable(LoginLocators.HOVER_SIGNIN));
    }

}
