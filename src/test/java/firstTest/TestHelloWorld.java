package firstTest;

import initialTest.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHelloWorld extends Base {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver =  initializeDriver();
    }

    @Test
    public void testGoToPage(){
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
