package login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;

import static invokeApp.config.Capabilities;
import static locators.Locators.*;


public class login {

    String num = "8130150149";
    String invalidNum = "12000000000";

    AndroidDriver<AndroidElement> driver = Capabilities();

    public login() throws MalformedURLException {
    }


//    @Given("^User is invoking the app$")
//    public void user_is_invoking_the_app() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        AndroidDriver<AndroidElement> driver = Capabilities();
//        Thread.sleep(4000);
//
//    }

    @Then("^User verifies that English language is selected by default$")
    public void user_verifies_that_English_language_is_selected_by_default() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(englishLanguageTickMark).isDisplayed());
        System.out.println("Tick Mark is By default fixed on the English language");
    }

    @Then("^Clicks the language screen Next button$")
    public void clicks_the_language_screen_Next_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(1000);
        if (driver.findElement(languageNextButton).isDisplayed()) {
            driver.findElement(languageNextButton).click();
            System.out.println("Next button has been clicked");
        } else {
            System.out.println("Error : Next Button is not displayed");
        }
        Thread.sleep(3000);
        driver.findElement(noneOfTheAboveButton).click();
        Thread.sleep(3000);
    }

    @Then("^verifies the phone number screen should be displayed$")
    public void verifies_the_phone_number_screen_should_be_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(headingYourPhoneNumber)).isDisplayed();


    }

    @Then("^click the phone number screen next button$")
    public void click_the_phone_number_screen_next_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);

        driver.findElement(phoneNumberNextButton).click();

    }

    @Then("^user enters an invalid number$")
    public void user_enters_an_invalid_number() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(phoneNumberTextBox).sendKeys(invalidNum);

    }

    @Then("^verify the user should not proceed further to next screen$")
    public void verify_the_user_should_not_proceed_further_to_next_screen() {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertFalse(driver.findElement(verificationCodeScreen).isEnabled());
        System.out.println("The Error would have occurred, hence now able to proceed to the OTP verification screen");

    }

    @Then("^user enters an valid number$")
    public void user_enters_an_valid_number() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        driver.findElement(phoneNumberTextBox).sendKeys(num);
    }

    @Then("^verify the OTP screen is displayed$")
    public void verify_the_OTP_screen_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(verificationCodeScreen).isDisplayed(), true);
        System.out.println("Verification OTP screen is displayed");

    }

    @Given("^user skips the complete screen and lands to the game screen$")
    public void user_skips_the_complete_screen_and_lands_to_the_game_screen() {
        // Write code here that turns the phrase above into concrete actions

    }
}
