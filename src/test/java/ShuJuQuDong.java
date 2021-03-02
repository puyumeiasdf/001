import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ShuJuQuDong {
    DataProvider dataProvider;
    @DataProvider(name="name1")
    public Object[][] data(){
        return new Object[][]{
                {"firefox"}
                ,{"chrome"}
        };
    }
    @Test(dataProvider="name1")
    public void testGrid(String brower) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=null;
        if(brower.equals("chrome")) {
            desiredCapabilities =DesiredCapabilities.chrome();
        }
       else if(brower.equals("firefox")){
            desiredCapabilities =DesiredCapabilities.firefox();
        }
        else
        {
            System.out.printf("error");
        }
        String url="http://192.168.1.7:4444/"+"wd/hub";
        WebDriver driver=new RemoteWebDriver(new URL(url),desiredCapabilities);
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        driver.quit();
    }

}
