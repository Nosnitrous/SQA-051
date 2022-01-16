package com.luxoft.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    @Before(value = "@shout", order=30)
    public void beforeHook(){
        System.out.println("Start of testcase beforeHook");
    }
    @Before(order=10)
    public void before2Hook(){
        System.out.println("Start of test before2Hook");
    }
    @Before(value = "@web")
    public void startUpWebDriver(){
        if (Auxiliary.wd==null){
            WebDriverManager.chromedriver().setup();
            Auxiliary.wd = new ChromeDriver();
            Auxiliary.wd.navigate().to("http://the-internet.herokuapp.com/login");

        }
    }

    @After(value = "@web")
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take screenshot
            final byte[] screenshot = ((TakesScreenshot) Auxiliary.wd).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Auxiliary.wd.navigate().to("http://the-internet.herokuapp.com/login");

    }

    @After(order=10)
    public void afterHook(){
        System.out.println("Testcase is finished afterHook");
    }
    @After(order=100)
    public void After2Hook(){
        System.out.println("Testcase is finished after2Hook");

    }

}
