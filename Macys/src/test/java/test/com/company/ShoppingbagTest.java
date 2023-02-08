/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.company;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class ShoppingbagTest {

    private WebDriver driver;
    private String baseUrl;

    public ShoppingbagTest() {
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
        //driver.close();
    }
    
    @Test
  public void ShoppingbagTest() throws Exception {
    driver.get("https://www.macys.com/");
    driver.findElement(By.id("globalSearchInputField")).click();
    driver.findElement(By.id("globalSearchInputField")).clear();
    driver.findElement(By.id("globalSearchInputField")).sendKeys("mens shoes");
    driver.findElement(By.name("keywordSearch")).submit();
    driver.findElement(By.partialLinkText("Men's Klay Flex Cap-Toe Oxfords")).click();
//    driver.findElement(By.cssSelector("a[href*=14630899]")).click();
//    driver.findElement(By.xpath("//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[4]/div/div[2]/div[1]/ul/li[9]")).click();
//    driver.findElement(By.id("bag-add-2907838")).click();
//    driver.findElement(By.id("atbIntCheckout")).click();
//    driver.findElement(By.id("guest-checkout")).click();
//    driver.findElement(By.id("rc-shipping-firstName")).click();
//    driver.findElement(By.id("rc-shipping-firstName")).clear();
//    driver.findElement(By.id("rc-shipping-firstName")).sendKeys("Kevin");
//    driver.findElement(By.id("rc-shipping-lastName")).clear();
//    driver.findElement(By.id("rc-shipping-lastName")).sendKeys("Robert");
//    driver.findElement(By.id("rc-shipping-address1")).clear();
//    driver.findElement(By.id("rc-shipping-address1")).sendKeys("123 drive st");
//    driver.findElement(By.id("rc-shipping-zip")).clear();
//    driver.findElement(By.id("rc-shipping-zip")).sendKeys("60193");
//    driver.findElement(By.id("rc-shipping-submit")).click();
//    driver.findElement(By.id("rc-shipping-phone")).click();
//    driver.findElement(By.id("rc-shipping-phone")).clear();
//    driver.findElement(By.id("rc-shipping-phone")).sendKeys("(123) 456-789");
//    driver.findElement(By.id("rc-shipping-submit")).click();
//    driver.findElement(By.id("rc-shipping-phone")).clear();
//    driver.findElement(By.id("rc-shipping-phone")).sendKeys("(123) 456-7890");
//    driver.findElement(By.id("rc-shipping-submit")).click();
  }
}
