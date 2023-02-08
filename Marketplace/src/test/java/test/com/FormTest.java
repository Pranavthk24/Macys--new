/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void testMyForm() throws Exception {
        driver.get("file:///C:/Users/pranav/Documents/QA%20Class/Contact%20Us.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("first"));
        driver.findElement(By.name("first")).clear();
        driver.findElement(By.name("first")).sendKeys(FileUtil.readForm().getFirstname());
        driver.findElement(By.name("last")).clear();
        driver.findElement(By.name("last")).sendKeys(FileUtil.readForm().getLastname());
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(FileUtil.readForm().getEmail());
        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys(FileUtil.readForm().getPhone());
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(FileUtil.readForm().getAddress());
        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys(FileUtil.readForm().getCity());
        driver.findElement(By.name("state")).clear();
        driver.findElement(By.name("state")).sendKeys(FileUtil.readForm().getState());
        driver.findElement(By.name("zip")).clear();
        driver.findElement(By.name("zip")).sendKeys(FileUtil.readForm().getZip());
        driver.findElement(By.name("comment")).clear();
        driver.findElement(By.name("comment")).sendKeys(FileUtil.readForm().getMessage());
        WebElement mySelectElement = driver.findElement(By.name("branch"));
        Select branch = new Select(mySelectElement);
        branch.selectByVisibleText("Naperville");
        
        WebElement mySelectElement1 = driver.findElement(By.name("inquiry"));
        Select inquiry = new Select(mySelectElement1);
        inquiry.selectByVisibleText("Internship");
        
        WebElement mySelectElement2 = driver.findElement(By.name("training"));
        Select training = new Select(mySelectElement2);
        training.selectByVisibleText("Selenium Web Automation");
        Thread.sleep(5000);
        
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        
    }

}
