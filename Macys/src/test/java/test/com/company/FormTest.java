/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.company;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class FormTest {

    private WebDriver driver;
    private String baseUrl;

    public FormTest() {
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void FormTest() throws Exception {
        driver.get("https://www.macys.com/my-checkout");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys(FileUtil.readForm().getFirstname());
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys(FileUtil.readForm().getLastname());
        driver.findElement(By.name("address.addressLine1")).clear();
        driver.findElement(By.name("address.addressLine1")).sendKeys(FileUtil.readForm().getAddress1());
        driver.findElement(By.name("address.zipCode")).clear();
        driver.findElement(By.name("address.zipCode")).sendKeys(FileUtil.readForm().getZip());
        driver.findElement(By.name("address.state")).clear();
        driver.findElement(By.name("address.state")).sendKeys("IL");
        driver.findElement(By.name("address.city")).click();
        driver.findElement(By.name("address.city")).sendKeys(FileUtil.readForm().getCity());
        driver.findElement(By.name("address.phoneNumber")).click();
        driver.findElement(By.name("address.phoneNumber")).clear();
        driver.findElement(By.name("address.phoneNumber")).sendKeys(FileUtil.readForm().getPhone());
        driver.findElement(By.xpath("//*[@id=\"rc-shipping-submit\"]")).click();

    }
}
    
 
