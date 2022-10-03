import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup  {

    @Test(priority = 1,dataProvider = "data-provider1", dataProviderClass = Urlset.class)
    public void Unsuccessful(String url) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.inputFiled(url);
        String text = homePage.txtLevel.getText();
        System.out.println(text);


        Assert.assertEquals(text,text);

    }
    @Test(priority = 2, dataProvider = "data-provider2", dataProviderClass = Urlset.class)
    public void SuccessDownload(String url) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.inputFiled(url);

    }
}
