package StepDefinition;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Annex_MyStepdefs {

    WebDriver driver;
    WebElements web;

    @Given("BUBT student login interface")
    public void bubtStudentLoginInterface() {
        Helper hp = new Helper();
        driver = hp.chromeLaunch();

    }

    @And("click the interface")
    public void clickTheInterface() throws InterruptedException {
        web = new WebElements(driver);
        web.clickTheInterface();


    }

    @And("Sendkeys of {string} and {string}")
    public void sendkeysOfStudentIdAndPassword(String studentId, String password) throws InterruptedException {
        web.sendkeysOfStudentIdAndPassword(studentId,password);
    }

    @And("click the login button")
    public void clickTheLoginButton() throws InterruptedException {
        web.clickTheLoginButton();
    }

    @And("open the student information")
    public void openTheStudentInformation() throws InterruptedException {
        web.openTheStudentInformation();
    }

    @And("close the notification of remembering password")
    public void closeTheNotificationOfRememberingPassword() throws InterruptedException {

        web.closeTheNotificationOfRememberingPassword();
    }

    @And("Scroll Down the page")
    public void scrollDownThePage() throws InterruptedException {
        web.scrollDownThePage();
    }

    @And("Click the academic info")
    public void clickTheAcademicInfo() throws InterruptedException {
        web.clickTheAcademicInfo();
    }

    @And("Open the academic info")
    public void openTheAcademicInfo() throws InterruptedException {
        web.openTheAcademicInfo();
    }

    @And("Click the summary option")
    public void clickTheSummaryOption() throws InterruptedException {
        web.clickTheSummaryOption();
    }

    @And("Open the summary page")
    public void openTheSummaryPage() throws InterruptedException {
        web.openTheSummaryPage();
    }

    @And("Scroll down the summary page")
    public void scrollDownTheSummaryPage() throws InterruptedException {
        web.scrollDownTheSummaryPage();
    }

    @And("Scroll up the summary page")
    public void scrollUpTheSummaryPage() throws InterruptedException {
        web.scrollDownTheSummaryPage();
    }

    @And("click the log out button")
    public void clickTheLogOutButton() throws InterruptedException {
        web.clickTheLogOutButton();
    }

    @Then("finally logout from the website")
    public void finallyLogoutFromTheWebsite() {
        System.out.println("log out the page");
    }
}
