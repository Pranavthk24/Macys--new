/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author pranav
 */
public class LocaterTest {
        private WebDriver driver;
    private String baseUrl;

    public LocaterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
  public void LocaterTest() throws Exception {
    driver.get("https://www.macys.com/");
    WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"header-store-info-widget\"]/div[1]/div/span[1]"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform();

    driver.findElement(By.linkText("Change Store")).click();
    driver.findElement(By.xpath("//div")).click();
    driver.findElement(By.id("m-bops-address")).clear();
    driver.findElement(By.id("m-bops-address")).sendKeys("60173");
    driver.findElement(By.id("m-bops-address")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='bops-ui-store-results-container']/section/div/article/section/div/div/div[2]/button")).click();
  }
}
