package medunna.pages;

import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(css = "input[name='firstName']")
    public WebElement firstNameTextBox;


    @FindBy(css = "input[name='lastName']")
    public WebElement lastNameTextBox;


    @FindBy(css = "input[name='username']")
    public WebElement userNameTextBox;


    @FindBy(css = "input[name='email']")
    public WebElement emailTextBox;


    @FindBy(css = "input[name='firstPassword']")
    public WebElement newPasswordTextBox;


    @FindBy(css = "input[name='secondPassword']")
    public WebElement newPasswordConfirmTextBox;


    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrengthRed;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement passwordStrengthOrange;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement passwordStrengthGreen1;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement passwordStrengthGreen2;

    @FindBy(css = "#register-submit")
    public WebElement registerButton;



}
