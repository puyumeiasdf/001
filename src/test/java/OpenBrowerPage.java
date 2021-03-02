import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowerPage {
    @Test
    public void open() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".\\driverBrower\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://www.baidu.com");
//        直接用类名去调用字段就可以了
        WebElement element =webDriver.findElement(PageTest.baiDuText);
        Thread.sleep(5000);
        webDriver.quit();
    }
}
