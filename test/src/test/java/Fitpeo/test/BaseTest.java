package Fitpeo.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import FitpeoContext.webdrivercontext;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    protected void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        webdrivercontext.setDriver(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void wrapup() {
        if (driver != null) {
            //driver.quit();
        }
    }
}
