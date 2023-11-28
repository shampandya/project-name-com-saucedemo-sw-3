package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //click on elemment
    public WebElement clickOnElement(By by) {
        driver.findElement(by).click();
        return null;
    }

    //sent text to the field
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //get the text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //Verify the actual and expected text
    public void verifyElements(String displayMessage, String expectedMessage, By by) {
        String Message = getTextFromElement(by);
        Assert.assertEquals(displayMessage, expectedMessage, Message);
    }

    public boolean getNumberFromElement(By by,int expectedNumber){
        int actualNumber = driver.findElements(by).size();
        Assert.assertEquals(expectedNumber,actualNumber);
        return true;
    }

}
