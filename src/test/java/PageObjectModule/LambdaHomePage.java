package PageObjectModule;

import common.Basetest;
import org.openqa.selenium.By;

public class LambdaHomePage extends Basetest {
    public By dragdropbtn(){
        return By.xpath("//a[text()='Drag & Drop Sliders']");
    }
    public By startPosition(){
        return By.xpath("//input[@value='5']");
    }
    public By rangeTxt(){
        return By.xpath("//output[@id='range']");
    }
    public By inputFormSubitBtn(){
        return  By.xpath("//a[text()='Input Form Submit']");
    }
    public By nameTxt(){
        return By.xpath("//input[@id='name']");
    }
    public By emailTxt(){
        return By.xpath("//input[@id='inputEmail4']");
    }
    public By passwordTxt(){
        return By.xpath("//input[@id='inputPassword4']");
    }
    public By companyTxt(){

        return By.xpath("//input[@id='company']");
    }
    public By websiteTxt(){

        return By.xpath("//input[@id='websitename']");
    }
    public By countrydropdwn(){

        return By.name("country");
    }
    public By cityTxt(){

        return By.xpath("//input[@id='inputCity']");
    }
    public By address1Txt(){

        return By.xpath("//input[@id='inputAddress1']");
    }
    public By address2Txt(){

        return By.xpath("//input[@id='inputAddress2']");
    }
    public By stateTxt(){

        return By.xpath("//input[@id='inputState']");
    }
    public By zipcodeTxt(){

        return By.xpath("//input[@id='inputZip']");
    }
    public By submitBtn(){

        return By.xpath("//button[text()='Submit']");
    }
    public By formSubmit(){
        return By.xpath("//p[text()='Thanks for contacting us, we will get back to you shortly.']");
    }
    public By contextBtn(){
        return By.xpath("//a[text()=' Context Menu']");
    }

    public By contextAlert(){
        return By.id("hot-spot");
    }
    public By dataFilterBtn(){
        return By.xpath("//a[text()='Data List Filter']");
    }
    public By attendeSearchBtn(){
        return By.id("input-search");
    }
    public By attendeName(){
        return By.xpath("//h4");
    }
    public By attendeCompany(){
        return By.xpath("//h5");
    }
    public By attendeTitle(){
        return By.xpath("//p");
    }

    // java script alert
    public By javaScritAlertbtn(){
        return By.xpath("//a[text()='Javascript Alerts']");
    }
    public By clickJavaAlert(){
        return By.xpath("//button[text()='Click Me']");
    }


}
