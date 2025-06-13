package Testcasemodule;

import common.Basetest;
import org.testng.annotations.Test;

public class SliderTestcase extends Basetest {
    //slider functionality
    @Test
    public void sliderFunctionality(){
        lambdaHomeUtil.dragdragslider();

    }
    @Test
    //nameform fuvtionality
    public void nameFormFunctionality() throws InterruptedException {
        lambdaHomeUtil.nameForm("Test","test@gmail.com","test123@","testyok","www.test.com","India","Mumbai","123manin street","Maharashtra","400708");
    }
    //Alert Functionality
    @Test
    public void alertFunctionality()throws InterruptedException{
        lambdaHomeUtil.alertFuction();
    }
    //Data Filter
    @Test
    public void dataFilterFunctionality() throws InterruptedException {
        lambdaHomeUtil.dataListFuction("Dwayne Portland");
    }
    //Java script
    @Test
    public void javaScriptAlertFunctionlity() throws InterruptedException {
        lambdaHomeUtil.javaAlertFunction();
    }
}
