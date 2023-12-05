package pageObjects;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    public WebDriver driver;

    public RegistrationPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void openUrl(){
        goToUrl();
    }

    //@FindBy(id = "cn-accept-cookies")
    //private  WebDriver acceptCookiesButton;

   @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/div/div/div[3]/a[2]/span")
   private WebElement signUpButton;

   @FindBy(css = "#stm-lms-register > form > div:nth-child(1) > div:nth-child(1) > div > input")
    private WebElement username;

   @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[1]/div[2]/div/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")
    private WebElement password;

    @FindBy(name = "password_re")
    private WebElement confirmPassword;

   @FindBy(css= ".stm_lms_register_wrapper__actions > label:nth-child(1) > span:nth-child(2)")
    private WebElement instructor;

   @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[4]/div[1]/div/input")
    private WebElement degree;

   @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[4]/div[2]/div/input")
    private WebElement expertize;

   @FindBy(css = "button.btn > span:nth-child(1)")
   private WebElement registerButton;

   @FindBy(css = ".stm_lms_user_info_top > h3:nth-child(1)")
   private WebElement enrolledCoursesDisplayed;

  public void clickSignUpButton(){
       signUpButton.click();
  }

   public void enterUsername(){
       username.sendKeys("Lira");
   }

   public void enterEmail(){
       email.sendKeys("Lira@yahoo.com");
   }

   public void enterPassword(){
       password.sendKeys("Kira123@");
   }
   public void enterConfirmPassword(){
       confirmPassword.sendKeys("Kira123@");
   }
   public void clickInstructor() {
      instructor.click();
  }
  public  void  enterDegree(){
       degree.sendKeys("computer");
  }
  public void enterExpertize(){
       expertize.sendKeys("scrum");
  }
  public void clickRegisterButton(){
       registerButton.click();
  }
    public boolean enrolledCoursesDisplayed() {
        return enrolledCoursesDisplayed.isDisplayed();
    }
}
