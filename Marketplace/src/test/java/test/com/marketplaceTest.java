/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import static java.awt.SystemColor.menu;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public class marketplaceTest {
    private WebDriver driver;
  private String baseUrl;
    public marketplaceTest() {
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
//        driver.close();
    }
//    @Test
//  public void testUntitledTestCase() throws Exception {
//    driver.get("https://schaumburgmarketplace.com/");
//    WebElement elem1 = driver.findElement(By.name("//*[@name="About Us"));
////        Actions act = new Actions(driver);
//        Action a1 = act.moveToElement(elem1).build();
//        a1.perform();
//        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CONTACT US")));
//
//        WebElement elem2 = driver.findElement(By.linkText("CONTACT US"));
//        elem2.click();
//        try {
//      assertEquals(driver.findElement(By.xpath("//article[@id='page-19']/header/h1")).getText(), "Contact Us");
//    } catch (Error e) {
//        System.out.println(e.toString());
//    }
  }
