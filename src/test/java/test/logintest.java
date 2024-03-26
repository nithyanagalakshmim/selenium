package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jenkins.demosite.login1;

public class logintest {

    WebDriver driver;
    login1 LP;

   
    public void Pre_Condition() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        LP = new login1(driver); // Initialize login1 class using its constructor
        Thread.sleep(2000);
    }

    public void testSwagLabsLogin() throws InterruptedException {
        LP.User_Name("standard_user");
        LP.Password("secret_sauce");
        LP.Login();
        Thread.sleep(2000);
    }

   
    // public void Post_Condition() {
    //     driver.quit();
    // }
}
