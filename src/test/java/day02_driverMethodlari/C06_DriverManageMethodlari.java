package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //implicity wait gittigimiz sayfa acilincaya veya aradigimiz
        //web element bululuncaya kadar driver'in bekleyebilecegi max süreyi belirler

        // bu dortlu her test methodunun basina yazilacak



    }
}
