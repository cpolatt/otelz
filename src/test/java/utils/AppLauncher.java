package utils;

import java.util.List;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

public class AppLauncher {
    @Step("Go to <url>")
    public void openUrl(String url) {

        Driver.webDriver.get(url);
        Driver.webDriver.manage().window().maximize();

    }

    @Step("Switch to frame by index <index>")
    public void switchToFrameByIndex(int index) {
        Driver.webDriver.switchTo().frame(index);
    }

    @Step("Switch to frame by name <name>")
    public void switchToFrameByIndex(String name) {
        Driver.webDriver.switchTo().frame(name);
    }

    @Step("Switch to main frame")
    public void switchToMainFrame() {
        Driver.webDriver.switchTo().defaultContent();
    }

    @Step("Wait <time> ms")
    public void sleep(Integer time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    @Step("Click random link")
    public void clickRandomLink() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.webDriver;
        jse.executeScript("window.scrollBy(0,250)", "");

        List<WebElement> elements = Driver.webDriver.findElements(By.tagName("a"));
        for (WebElement webElement : elements) {
            WebElement waitElement = Driver.webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
            if (waitElement != null) {
                try {
                    webElement.click();
                    break;
                } catch (Exception e) {
                    continue;
                }
            }
        }
    }

    public WebElement findElement(By by) {
        return new WebDriverWait(Driver.webDriver, 15, 150).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement findElementById(String id) {
        return findElement(By.id(id));
    }

    public WebElement findElementByCss(String css) {
        return findElement(By.cssSelector(css));
    }

    public WebElement findElementByXpath(String xpath) {
        return findElement(By.xpath(xpath));
    }

    public List<WebElement> findElements(By by) {
        return new WebDriverWait(Driver.webDriver, 15, 150)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public List<WebElement> findElementsById(String id) {
        return findElements(By.id(id));
    }

    public List<WebElement> findElementsByCss(String css) {
        return findElements(By.cssSelector(css));
    }

    public List<WebElement> findElementsByXpath(String xpath) {
        return findElements(By.xpath(xpath));
    }

    @Step("Click element by id <id>")
    public void clickById(String id) {
        findElementById(id).click();
    }

    @Step("Click element by css <css>")
    public void clickByCss(String css) {
        findElementByCss(css).click();
    }

    @Step("Click element by xpath <xpath>")
    public void clickByXpath(String xpath) {
        findElementByXpath(xpath).click();
    }

    public void sendKeysWithClear(By by, String text) {
        WebElement webElement = findElement(by);
        webElement.clear();
        webElement.sendKeys(text);
    }

    @Step("Send keys element by id <id> text <text> with clear")
    public void sendKeysByIdWithClear(String id, String text) {
        sendKeysWithClear(By.id(id), text);
    }

    @Step("Send keys element by css <id> text <text> with clear")
    public void sendKeysByCssWithClear(String css, String text) {
        sendKeysWithClear(By.cssSelector(css), text);
    }

    @Step("Send keys element by xpath <xpath> text <text> with clear")
    public void sendKeysByXpathWithClear(String xpath, String text) {
        sendKeysWithClear(By.xpath(xpath), text);
    }

    public void sendKeys(By by, String text) {
        WebElement webElement = findElement(by);
        webElement.sendKeys(text);
    }

    @Step("Send keys element by id <id> text <text>")
    public void sendKeysById(String id, String text) {
        sendKeysWithClear(By.id(id), text);
    }

    @Step("Send keys element by css <id> text <text>")
    public void sendKeysByCss(String css, String text) {
        sendKeysWithClear(By.cssSelector(css), text);
    }

    @Step("Send keys element by xpath <xpath> text <text>")
    public void sendKeysByXpath(String xpath, String text) {
        sendKeysWithClear(By.xpath(xpath), text);
    }

    public void clickEqualsText(By by, String text) {
        List<WebElement> elements = findElements(by);
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(text)) {
                element.click();
                break;
            }
        }
    }

    @Step("Click element by id <id> with text equal <text>")
    public void clickById(String id, String text) {
        clickEqualsText(By.id(id), text);
    }

    @Step("Click element by css <css> with text equal <text>")
    public void clickByCss(String css, String text) {
        clickEqualsText(By.cssSelector(css), text);
    }

    @Step("Click element by xpath <xpath> with text equal <text>")
    public void clickByXpath(String xpath, String text) {
        clickEqualsText(By.xpath(xpath), text);
    }

    public void clickContainsText(By by, String text) {
        List<WebElement> elements = findElements(by);
        for (WebElement element : elements) {
            if (element.getText().toLowerCase().contains(text.toLowerCase())) {
                element.click();
                break;
            }
        }
    }

    @Step("Click element by id <id> with text contains <text>")
    public void clickByIdWithContainsText(String id, String text) {
        clickContainsText(By.id(id), text);
    }

    @Step("Click element by css <css> with text contains <text>")
    public void clickByCssWithContainsText(String css, String text) {
        clickContainsText(By.cssSelector(css), text);
    }

    @Step("Click element by xpath <xpath> with text contains <text>")
    public void clickByXpathWithContainsText(String xpath, String text) {
        clickContainsText(By.xpath(xpath), text);
    }

    public void isElementExist(By by, String message) {
        Assert.assertNotNull(message, findElement(by));
    }

    @Step("Check exist element by id <id> and message <message>")
    public void isElementExistById(String id, String message) {
        isElementExist(By.id(id), message);
    }

    @Step("Check exist element by css <css> and message <message>")
    public void isElementExistByCss(String css, String message) {
        isElementExist(By.cssSelector(css), message);
    }

    @Step("Check exist element by xpath <xpath> and message <message>")
    public void isElementExistByXpath(String xpath, String message) {
        isElementExist(By.xpath(xpath), message);
    }

    public void equalsText(By by, String text) {
        Assert.assertTrue(new WebDriverWait(Driver.webDriver, 15, 150).until(ExpectedConditions.textToBe(by, text)));
    }

    @Step("Equals by id <id> text <text>")
    public void equalsTextById(String id, String text) {
        equalsText(By.id(id), text);
    }

    @Step("Equals by css <css> text <text>")
    public void equalsTextByCss(String css, String text) {
        equalsText(By.cssSelector(css), text);
    }

    @Step("Equals by xpath <xpath> text <text>")
    public void equalsTextByXpath(String xpath, String text) {
        equalsText(By.xpath(xpath), text);
    }

    @Step("Wait <millis> millis")
    public void waitByMillis(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    @Step("Wait <seconds> seconds")
    public void waitBySecond(int seconds) throws InterruptedException {
        waitByMillis(seconds * 1000);
    }

}
