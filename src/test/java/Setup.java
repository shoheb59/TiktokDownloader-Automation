import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public AndroidDriver driver;

    @BeforeClass
    public AndroidDriver setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "MyDevice");
        cap.setCapability("platformName","Android");
        cap.setCapability("udid","42007f4fc69c2631");
        cap.setCapability("appPackage","com.example.tiktok_downloader");
        cap.setCapability("appActivity", "com.example.tiktok_downloader.MainActivity");
        cap.setCapability("autoGrantPermission",true);


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,cap);


        return driver;
    }

}
