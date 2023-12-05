package Base;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }


    public void goToUrl(){
        String url = "https://prepmajor.com/user-account/";
        driver.get(url);

    }




}
