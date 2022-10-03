import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {


   @FindBy(className = "android.widget.EditText")
   MobileElement input;


    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    MobileElement btn_Continue;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Fetching problem while loading video!\"]")
    MobileElement txtLevel;

    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void inputFiled(String url) throws InterruptedException {
        input.click();
        input.sendKeys(url);
        btn_Continue.click();
        Thread.sleep(20);



    }




}


