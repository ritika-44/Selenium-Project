package common;


import AppUtil.LambdaHomeUtil;
import PageObjectModule.LambdaHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class Basetest {
    protected static WebDriver driver;
    protected static LambdaHomePage lambdaHomePage =new LambdaHomePage();
    protected static LambdaHomeUtil lambdaHomeUtil = new LambdaHomeUtil();

    @BeforeMethod
            public void setup(){
        //set the path of driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        //Initilize the chromeDriver
        driver = new    ChromeDriver();

        //Maximize the browser window
        driver.manage().window().maximize();

        //Implicit wait for 10 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Navigate to default URL
        driver.get("https://www.lambdatest.com/selenium-playground/");


    }
    @AfterMethod
    public void tearDown(){
        //close the browser after test execution
        if(driver!=null) {
            driver.quit();
        }
    }

}
