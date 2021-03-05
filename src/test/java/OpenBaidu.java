import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBaidu {
    @Test
    public void Open() throws InterruptedException {
        WebDriver webDriver=null;
        System.setProperty("webdriver.chrome.driver", ".\\driverBrower\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");
        Thread.sleep(5000);
        webDriver.quit();
    }
}
