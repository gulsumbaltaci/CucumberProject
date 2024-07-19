package medunna.stepDefinitions;

import io.cucumber.java.en.Given;
import medunna.pages.LoginPage;
import medunna.utilities.ConfigReader;
import medunna.utilities.Driver;
import org.junit.Assert;

public class loginTest {
    LoginPage loginPage = new LoginPage();

    @Given("kullanici medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @Given("sayfaya admin olarak giris yapar")
    public void sayfaya_admin_olarak_giris_yapar() {
        loginPage.loginButton.click();
        loginPage.signInButton.click();

        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.signInButton2.click();

    }
    @Given("sayfaya giris yapildigini dogrular")
    public void sayfaya_giris_yapildigini_dogrular() {
        System.out.println("Kullanici Adi: " + loginPage.loginUserNameButton.getText());
        Assert.assertEquals("Admin Batch210", loginPage.loginUserNameButton.getText());

    }
    @Given("sayfadan cikis yapar")
    public void sayfadan_cikis_yapar() {
        loginPage.loginUserNameButton.click();
        loginPage.signOutButton.click();

    }
    @Given("sayfadan cikis yaptigini dogrula")
    public void sayfadan_cikis_yaptigini_dogrula() {
        Assert.assertEquals("https://www.medunna.com/logout", Driver.getDriver().getCurrentUrl());
        //Driver.closeDriver();
    }
}