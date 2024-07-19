package medunna.pages;

import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#account-menu")
    public WebElement loginButton;

    @FindBy(css = "#login-item")
    public WebElement signInButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;

    @FindBy(css = "#username")
    public WebElement userNameTextBox;

    @FindBy(css = "#password")
    public WebElement passwordTextBox;

    @FindBy(css = ".btn.btn-primary")
    public WebElement signInButton2;

    @FindBy(xpath = "//span[.='Admin Batch210']")
    public WebElement loginUserNameButton;

    @FindBy(xpath = "//span[.='Staff Batch210']")
    public WebElement loginStaffUserNameButton;

    @FindBy(partialLinkText = "Sign out")
    public WebElement signOutButton;


}
