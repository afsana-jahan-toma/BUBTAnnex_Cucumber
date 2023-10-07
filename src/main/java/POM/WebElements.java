package POM;

//import com.sun.xml.internal.ws.resources.UtilMessages;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    WebDriver driver;
    public WebElements(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    By clickthefront = By.xpath("//input[@id='viewScreen']");
    By Id = By.xpath("//input[@id='UserName']");
    By pass = By.xpath("//input[@id='PasWord']");
    By loginclick = By.xpath("//button[@id='logIn_button']");
    By academicinfo = By.xpath("//body/div[@id='templatemo_main_wrapper']/div[@id='templatemo_main']/div[@id='content']/div[@id='home']/div[4]/ul[1]/li[1]/a[1]");
    By summary = By.xpath("//body/div[@id='templatemo_main_wrapper']/div[@id='templatemo_main']/div[@id='content']/div[@id='acamdeic_menu']/div[1]/ul[1]/li[1]/a[1]");
    By logout = By.xpath("//strong[contains(text(),'Log Out')]");

    public void clickTheInterface() throws InterruptedException {
        driver.findElement(clickthefront).click();
        Thread.sleep(3000);
    }
    public void sendkeysOfStudentIdAndPassword(String studentId, String password) throws InterruptedException {
        driver.findElement(Id).sendKeys(studentId);
        driver.findElement(pass).sendKeys(password);
        Thread.sleep(300);

    }


    public void clickTheLoginButton() throws InterruptedException {
        driver.findElement(loginclick).click();

    }

    public void openTheStudentInformation() throws InterruptedException {
        Thread.sleep(4000);
    }
    public void closeTheNotificationOfRememberingPassword() throws InterruptedException {
        //driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
    }

    public void scrollDownThePage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://annex.bubt.edu.bd/ONSIS_SEITO");
        js.executeScript("window.scrollTo(500, 1000);");
        Thread.sleep(5000);
    }

    public void clickTheAcademicInfo() throws InterruptedException {
        driver.findElement(academicinfo).click();
        Thread.sleep(3000);
    }
    public void openTheAcademicInfo() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void clickTheSummaryOption() throws InterruptedException {
        driver.findElement(summary).click();
        Thread.sleep(3000);
    }
    public void openTheSummaryPage() throws InterruptedException {
        Thread.sleep(3000);
    }
    public void scrollDownTheSummaryPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://annex.bubt.edu.bd/ONSIS_SEITO/?page=7532e47ae0b55ec3f44b50590f08c36c");
        js.executeScript("window.scrollTo(500, 1000);");
        Thread.sleep(4000);

    }
    public void scrollUpTheSummaryPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://annex.bubt.edu.bd/ONSIS_SEITO/?page=7532e47ae0b55ec3f44b50590f08c36c");
        js.executeScript("window.scrollTo(500, 500);");
        Thread.sleep(4000);
    }
    public void clickTheLogOutButton() throws InterruptedException {
        driver.findElement(logout).click();
        Thread.sleep(2000);

    }
    public void finallyLogoutFromTheWebsite() {

    }

}