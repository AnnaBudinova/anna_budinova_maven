package homework15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework {
    private WebDriver driver;

    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @BeforeMethod
    protected final void setUpTest() {
        this.driver = new EdgeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    protected final void tearDownTest() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

    @Test
    public void testCheckBox() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkboxes = driver.findElement(By.id("checkboxes"));

        WebElement checkBox1 = driver.findElement(By.xpath("//*[@type='checkbox'][1]"));
        Assert.assertFalse(checkBox1.isSelected());
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected());

        WebElement checkBox2 = driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
        Assert.assertTrue(checkBox1.isSelected());
        checkBox1.click();
        Assert.assertFalse(checkBox1.isSelected());

    }
    @Test
    public void testHovers() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement users = driver.findElement(By.id("content"));
        WebElement user1 = driver.findElement(By.xpath("//*[@class='figure'][1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(user1).perform();
        String tooltipText = driver.findElement(By.className("figcaption")).getText();
       /* WebElement userNumber = driver.findElement(By.xpath("(//*[contains(text(),'user1')])[1]"));
        Assert.assertEquals(tooltipText, "name: user1");*/
        WebElement userLink = driver.findElement(By.xpath("//a[@href=\"/users/1\"]"));
        userLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://the-internet.herokuapp.com/users/1"));
    }

    @Test
    public void testContextMenu() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement alertButton = driver.findElement(By.id("hot-spot"));
        actions.contextClick(alertButton).perform();
        driver.switchTo().alert().accept();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://the-internet.herokuapp.com/context_menu"));
    }
}
