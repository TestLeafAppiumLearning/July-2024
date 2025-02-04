package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AndroidFirstCodeWithAppPackageAndAppActivity {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("automationName", "UiAutomator2");
        //dc.setCapability("app",System.getProperty("user.dir")+"/apks/Leaforg.apk");
        dc.setCapability("appPackage", "com.testleaf.leaforg");
        dc.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
        AppiumDriver driver = new AppiumDriver(new URI("http://127.0.0.1:4723/").toURL(), dc);
        driver.quit();
    }
}
