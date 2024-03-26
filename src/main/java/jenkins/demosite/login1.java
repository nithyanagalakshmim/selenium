package jenkins.demosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {

    WebDriver driver;

    // Constructor
    public login1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="user-name")
    WebElement username;

    public void User_Name(String fnm) {
        username.sendKeys(fnm);
    }

    @FindBy(id="password")
    WebElement password;

    public void Password(String snm) {
        password.sendKeys(snm);
    }

    @FindBy(id="login-button")
    WebElement login;

    public void Login() {
        login.click();
    }
}
