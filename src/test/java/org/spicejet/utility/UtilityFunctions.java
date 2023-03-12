package org.spicejet.utility;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UtilityFunctions extends PageObject {

    public void xWaitForElementToBeVisible(WebElement ele){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
    public void xWaitForElementToBeVisible(By ele){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(ele)));
    }

    public void xWaitForElementToBeClickble(WebElement ele){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(120));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
    public void xWaitForElementToBeClickable(By ele){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(120));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }

    public void xHighLight(WebElement ele){
        JavascriptExecutor Jse = (JavascriptExecutor) getDriver();
        Jse.executeScript("argument[0]. setAttribute('style', 'border:2px solid red; background:yellow')",ele);
    }
    public void xHighLight(By ele){
        JavascriptExecutor Jse = (JavascriptExecutor) getDriver();
        Jse.executeScript("argument[0]. setAttribute('style', 'border:2px solid red; background:yellow')",ele);
    }

    public boolean xClick(WebElement ele){
        xWaitForElementToBeClickble(ele);
        xHighLight(ele);
        ele.click();
        return true;
    }
    public boolean xClick(By ele){
        xWaitForElementToBeClickable(ele);
        xHighLight(ele);
        getDriver().findElement(ele).click();
        return true;
    }

    public boolean xSendKeys(WebElement ele, String input){
        xWaitForElementToBeClickble(ele);
        xHighLight(ele);
        ele.sendKeys(input);
        return true;
    }
    public boolean xSendKeys(By ele, String input){
        xWaitForElementToBeClickable(ele);
        xHighLight(ele);
        getDriver().findElement(ele).sendKeys(input);
        return true;
    }

    public void xClearCookies(){
        getDriver().manage().deleteAllCookies();
    }

    public void xSelectFromDropdown(WebElement ele, String text){
        element(ele).selectByVisibleText(text);
    }
    public void xSelectFromDropdown(By ele, String text){
        element(ele).selectByVisibleText(text);
    }

    public void xSwitchToChildWindow(){
        String mainWindowHandle = getDriver().getWindowHandle();
        for (String childWindowHandle:getDriver().getWindowHandles()) {
            if (!childWindowHandle.equals(mainWindowHandle)){
                getDriver().switchTo().window(childWindowHandle);
            }
        }
    }

    public boolean xMouseHover(WebElement ele){
        xWaitForElementToBeVisible(ele);
        Actions action = new Actions(getDriver());
        action.moveToElement(ele);
        return true;
    }
    public boolean xMouseHover(By ele){
        xWaitForElementToBeVisible(ele);
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver().findElement(ele));
        return true;
    }

    public boolean xDoubleClick(WebElement ele){
        xWaitForElementToBeVisible(ele);
        Actions actions = new Actions(getDriver());
        actions.doubleClick(ele);
        return true;
    }
    public boolean xDoubleClick(By ele){
        xWaitForElementToBeVisible(ele);
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getDriver().findElement(ele));
        return true;
    }

    public boolean xRightClick(WebElement ele){
        xWaitForElementToBeVisible(ele);
        Actions action = new Actions(getDriver());
        action.contextClick().build().perform();
        return true;
    }
    public boolean xRightClick(By ele){
        xWaitForElementToBeVisible(ele);
        Actions action = new Actions(getDriver());
        action.contextClick().build().perform();
        return true;
    }

    public void xSwitchFrame(WebElement ele){
        getDriver().switchTo().frame(ele);
    }
    public void xSwitchFrame(By ele){
        getDriver().switchTo().frame(getDriver().findElement(ele));
    }
}
