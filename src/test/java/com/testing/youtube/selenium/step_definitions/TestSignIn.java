package com.testing.youtube.selenium.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.youtube.selenium.pages.SignIn;
import com.testing.youtube.selenium.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSignIn {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private SignIn signIn = new SignIn();

    public TestSignIn() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // SIGN IN 001
    @Given("TCC.SignIn.001 open web music youtube in home page")
    public void tcc_sign_in_001_open_web_music_youtube_in_home_page() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "open web music youtube in home page");
    }

    @When("TCC.SignIn.001 Click button sign in")
    public void tcc_sign_in_001_click_button_sign_in() {
        signIn.btnSignIn();
        extentTest.log(LogStatus.PASS,"click search menu");
    }

    @Then("TCC.SignIn.001 Redirect to google login")
    public void tcc_sign_in_001_redirect_to_google_login() {
        Assert.assertEquals(signIn.getTxtSignIn(),"Sign in");
        extentTest.log(LogStatus.PASS,"Redirect to google login");
    }

    // SIGN IN 003
    @Given("TCC.SignIn.003 Login page")
    public void tcc_sign_in_003_login_page() {
        driver.get(Constants.URL);
        signIn.btnSignIn();
        extentTest.log(LogStatus.PASS, "login page");
    }

    @When("TCC.SignIn.003 Input email invalid")
    public void tcc_sign_in_003_input_email_invalid() {
        signIn.inputEmail("acakajsoopapuus@gmail.com");
        extentTest.log(LogStatus.PASS,"Input email invalid");
    }

    @And("TCC.SignIn.003 Click button next")
    public void tcc_sign_in_003_click_button_next() {
        signIn.btnNextEmail();
        extentTest.log(LogStatus.PASS,"click button next");
    }

    @Then("TCC.SignIn.003 Display notif Couldn’t find your Google Account")
    public void tcc_sign_in_003_display_notif_couldnt_find_your_google_account() {
        Assert.assertEquals(signIn.getTxtMessageError(),"Couldn’t find your Google Account");
        extentTest.log(LogStatus.PASS,"Display notif Couldn’t find your Google Account");
    }

    // SIGN IN 004
    @Given("TCC.SignIn.004 Login page")
    public void tcc_sign_in_004_login_page() {
        driver.get(Constants.URL);
        signIn.btnSignIn();
        extentTest.log(LogStatus.PASS, "login page");
    }

    @When("TCC.SignIn.004 Input email empty")
    public void tcc_sign_in_004_input_email_empty() {
        signIn.inputEmail("");
        extentTest.log(LogStatus.PASS,"Input email empty");
    }

    @And("TCC.SignIn.004 Click button next")
    public void tcc_sign_in_004_click_button_next() {
        signIn.btnNextEmail();
        extentTest.log(LogStatus.PASS,"click button next");
    }

    @Then("TCC.SignIn.004 Display notif Enter an email or phone number")
    public void tcc_sign_in_004_display_notif_enter_an_email_or_phone_number() {
        Assert.assertEquals(signIn.getTxtMessageError(),"Enter an email or phone number");
        extentTest.log(LogStatus.PASS,"Display notif Enter an email or phone number");
    }

    // SIGN IN 005
    @Given("TCC.SignIn.005 Login page")
    public void tcc_sign_in_005_login_page() {
        driver.get(Constants.URL);
        signIn.btnSignIn();
        extentTest.log(LogStatus.PASS, "login page");
    }

    @When("TCC.SignIn.005 Input email valid")
    public void tcc_sign_in_005_input_email_valid() {
        signIn.inputEmail("tes44568@gmail.com");
        extentTest.log(LogStatus.PASS,"Input email valid");
    }

    @And("TCC.SignIn.005 Click button next email")
    public void tcc_sign_in_005_click_button_next_email() {
        signIn.btnNextEmail();
        extentTest.log(LogStatus.PASS,"click button next email");
    }

    @And("TCC.SignIn.005 Input password invalid")
    public void tcc_sign_in_005_input_password_invalid() {
        signIn.inputPassword("sayuuaooa");
        extentTest.log(LogStatus.PASS,"Input password invalid");
    }

    @And("TCC.SignIn.005 Click button next password")
    public void tcc_sign_in_005_click_button_next_password() {
        signIn.btnNextPassword();
        extentTest.log(LogStatus.PASS,"click button next password");
    }

    @Then("TCC.SignIn.005 Display notif Wrong password")
    public void tcc_sign_in_005_display_notif_wrong_password() {
        Assert.assertTrue(signIn.getTxtMessageErrorPassword().contains("Wrong password"));
        extentTest.log(LogStatus.PASS,"Display notif wrong password");
    }

    // SIGN IN 006
    @Given("TCC.SignIn.006 Login page")
    public void tcc_sign_in_006_login_page() {
        driver.get(Constants.URL);
        signIn.btnSignIn();
        extentTest.log(LogStatus.PASS, "login page");
    }

    @When("TCC.SignIn.006 Input email valid")
    public void tcc_sign_in_006_input_email_valid() {
        signIn.inputEmail("tes44568@gmail.com");
        extentTest.log(LogStatus.PASS,"Input email valid");
    }

    @And("TCC.SignIn.006 Click button next email")
    public void tcc_sign_in_006_click_button_next_email() {
        signIn.btnNextEmail();
        extentTest.log(LogStatus.PASS,"click button next email");
    }

    @And("TCC.SignIn.006 Input password empty")
    public void tcc_sign_in_006_input_password_empty() {
        signIn.inputPassword("");
        extentTest.log(LogStatus.PASS,"Input password empty");
    }

    @And("TCC.SignIn.006 Click button next password")
    public void tcc_sign_in_006_click_button_next_password() {
        signIn.btnNextPassword();
        extentTest.log(LogStatus.PASS,"click button next password");
    }

    @Then("TCC.SignIn.006 Display notif Enter a password")
    public void tcc_sign_in_006_display_notif_enter_a_password() {
        Assert.assertEquals(signIn.getTxtMessageErrorPassword(),"Enter a password");
        extentTest.log(LogStatus.PASS,"Display notif Enter a password");
    }

    // SIGN IN 2
    @Given("TCC.SignIn.002 Login page")
    public void tcc_sign_in_002_login_page() {
        driver.get(Constants.URL);
        signIn.btnSignIn();
        extentTest.log(LogStatus.PASS, "login page");
    }

    @When("TCC.SignIn.002 Input email valid")
    public void tcc_sign_in_002_input_email_valid() {
        signIn.inputEmail("tes44568@gmail.com");
        extentTest.log(LogStatus.PASS,"Input email valid");
    }

    @And("TCC.SignIn.002 Click button next email")
    public void tcc_sign_in_002_click_button_next_email() {
        signIn.btnNextEmail();
        extentTest.log(LogStatus.PASS,"click button next email");
    }

    @And("TCC.SignIn.002 Input password valid")
    public void tcc_sign_in_002_input_password_valid() {
        signIn.inputPassword("Kucing1234");
        extentTest.log(LogStatus.PASS,"Input password valid");
    }

    @And("TCC.SignIn.002 Click button next password")
    public void tcc_sign_in_002_click_button_next_password() {
        signIn.btnNextPassword();
        extentTest.log(LogStatus.PASS,"click button next password");
    }

    @Then("TCC.SignIn.002 Redirect to homepage user")
    public void tcc_sign_in_002_redirect_to_homepage_user() {
        Assert.assertEquals(signIn.getTxtBeranda(),"Home");
        extentTest.log(LogStatus.PASS,"Beranda");
    }
}
