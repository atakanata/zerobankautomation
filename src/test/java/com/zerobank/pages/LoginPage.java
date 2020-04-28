package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageBase {

    @FindBy(id = "user_login")
    private WebElement username;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy (name = "submit")
    private WebElement submitBttn;

    public void login(){
        driver.navigate().to("http://zero.webappsecurity.com/login.html");
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
    }

    public void login(String username,String password){
        driver.navigate().to("http://zero.webappsecurity.com/login.html");
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
    }
}
