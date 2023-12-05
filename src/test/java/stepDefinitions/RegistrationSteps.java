package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pageObjects.RegistrationPage;

import static java.lang.Thread.sleep;


public class RegistrationSteps {
    public  static WebDriver driver;
    public RegistrationPage registrationPage;

    public RegistrationSteps(){
     System.setProperty("webdriver.firefox.driver", "C:/Users/Nelly/IdeaProjects/DeceSeleniumProject/src/test/resources/driver/geckodriver.exe");
      driver = new FirefoxDriver();
      registrationPage = new RegistrationPage(driver);
    }
    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() {
        //driver.get("https://prepmajor.com/user-account/");
        registrationPage.openUrl();
        driver.manage().window().maximize();

    }


    @And("^I click sign up button$")
    public void iClickSignUpButton() {
       //driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/div/div[3]/a[2]/span")).click();
        registrationPage.clickSignUpButton();
    }

    @And("^i enter the username$")
    public void iEnterTheUsername() {
       // driver.findElement(By.cssSelector("#stm-lms-register > form > div:nth-child(1) > div:nth-child(1) > div > input")).sendKeys("Kira");
       registrationPage.enterUsername();
    }

    @And("^I enter the email$")
    public void iEnterTheEmail() {
        //driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[1]/div[2]/div/input")).sendKeys("kira@yahoo.com");
        registrationPage.enterEmail();
    }

    @And("^i enter Password$")
    public void iEnterPassword() {
        //driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")).sendKeys("Kira123@");
        registrationPage.enterPassword();
    }

    @And("^I enter confirm Password$")
    public void iEnterConfirmPassword() {

        //driver.findElement(By.name("password_re")).sendKeys("Kira123@");
        registrationPage.enterConfirmPassword();
    }

    @And("^I click register instructor$")
    public void iTickRegisterIsAnInstructor() throws InterruptedException {
        Thread.sleep(5000);
        //driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/form/div[4]/div/div/label/span[2]")).click();
         registrationPage.clickInstructor();
    }

    @And("I enter degree")
    public void iEnterDegree() {
       // driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[4]/div[1]/div/input")).sendKeys("computer");
        registrationPage.enterDegree();
    }

    @And("I enter expertize")
    public void iEnterExpertize() {
       // driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[4]/div[2]/div/input")).sendKeys("scrum");
      registrationPage.enterExpertize();
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() throws InterruptedException {
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[5]/div/div/button/span")).click();
        registrationPage.clickRegisterButton();
    }

    @Then("Enrolled courses displayed")
    public void EnrolledCoursesDisplayed() {
        //String expectedMessage = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/h3")).getAccessibleName();
        Assert.assertTrue(registrationPage.enrolledCoursesDisplayed());
    }
}
