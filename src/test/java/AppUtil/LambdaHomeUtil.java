package AppUtil;

import common.Basetest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class LambdaHomeUtil extends Basetest {
    // Slider Functionality
    public void dragdragslider(){
        driver.findElement(lambdaHomePage.dragdropbtn()).click();
        for(int i=0;i<90;i++){
            driver.findElement(lambdaHomePage.startPosition()).sendKeys(Keys.ARROW_RIGHT);
        }
        String targetvalue=driver.findElement(lambdaHomePage.rangeTxt()).getText();
        System.out.println(targetvalue);
        Assert.assertEquals("95",targetvalue);

    }
    public void nameForm(String name,String email,String password,String company,String website,String country,String city,String address,String state,String zipcode) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(lambdaHomePage.inputFormSubitBtn()).click();
        driver.findElement(lambdaHomePage.nameTxt()).sendKeys(name);
        driver.findElement(lambdaHomePage.emailTxt()).sendKeys(email);
        driver.findElement(lambdaHomePage.passwordTxt()).sendKeys(password);
        driver.findElement(lambdaHomePage.companyTxt()).sendKeys(company);
        driver.findElement(lambdaHomePage.websiteTxt()).sendKeys(website);
        Thread.sleep(10000);
        driver.findElement(lambdaHomePage.countrydropdwn()).click();
        WebElement countryDropdown=driver.findElement(lambdaHomePage.countrydropdwn());
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText(country);
        driver.findElement(lambdaHomePage.cityTxt()).sendKeys(city);
        driver.findElement(lambdaHomePage.address1Txt()).sendKeys(address);
        driver.findElement(lambdaHomePage.address2Txt()).sendKeys(address);
        driver.findElement(lambdaHomePage.stateTxt()).sendKeys(state);
        driver.findElement(lambdaHomePage.zipcodeTxt()).sendKeys(zipcode);
        driver.findElement(lambdaHomePage.submitBtn()).click();
        String message = driver.findElement(lambdaHomePage.formSubmit()).getText();
        Assert.assertEquals("Thanks for contacting us, we will get back to you shortly.",message);

    }
    // Alert
    public void alertFuction() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
        driver.findElement(lambdaHomePage.contextBtn()).click();
        WebElement box =driver.findElement(lambdaHomePage.contextAlert());
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver .switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Assert.assertEquals("You selected a context menu",alertText);
        Thread.sleep(5000);
        alert.accept();
    }


    //Data List Filter
    public void dataListFuction(String name) throws InterruptedException {
        driver.findElement(lambdaHomePage.dataFilterBtn()).click();
        driver.findElement(lambdaHomePage.attendeSearchBtn()).sendKeys(name);
        Thread.sleep(10000);
        String ename = driver.findElement(lambdaHomePage.attendeName()).getText();
        System.out.println(ename);
        String company=driver.findElement(lambdaHomePage.attendeCompany()).getText();
        String title=driver.findElement(lambdaHomePage.attendeTitle()).getText();
        System.out.println("Name: "+ename+"Comapny:"+ company+ "Title :  " +title);
        Assert.assertEquals("Dwayne Portland",ename);

    }

    //JavaScript Alert
    public void javaAlertFunction() throws InterruptedException {
        driver.findElement(lambdaHomePage.javaScritAlertbtn()).click();
       Thread.sleep(200);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0]",driver.findElement(lambdaHomePage.clickJavaAlert()));
    }

}
