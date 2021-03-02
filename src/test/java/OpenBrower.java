import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenBrower {
    @Test
    public void open() throws MalformedURLException {
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        WebDriver webDriver=new RemoteWebDriver(new URL("http://192.168.1.7:4444/wd/hub"),capabilities);
        webDriver.get("http://www.baidu.com");
        webDriver.quit();
    }

}
