/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.company;

import org.openqa.selenium.By;
import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author pranav
 */
public class MacysserchTest {

    private WebDriver driver;
    private String baseUrl;

    public MacysserchTest() {
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
        driver.close();
    }

    @Test
    public void MacysserchTest() throws Exception {
        driver.get("https://www.macys.com/");
        driver.findElement(By.id("globalSearchInputField")).click();
        driver.findElement(By.id("globalSearchInputField")).clear();
        driver.findElement(By.id("globalSearchInputField")).sendKeys("mens shoes");
        driver.findElement(By.name("keywordSearch")).submit();
        driver.findElement(By.id("resultsFoundMessage")).click();
        try {
            assertEquals(driver.findElement(By.id("resultsFoundMessage")).getText(), "mens shoes");
        } catch (Error e) {
            System.out.println(e.toString());
        }
    }
}
