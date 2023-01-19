package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // get ile ayni islevi yapar

        Thread.sleep(3000);
        driver.get("https:\\www.wisequarter.com");

        Thread.sleep(3000);
        // yeniden amazzon'a donelim
        driver.navigate().back();

        //tekrar wisequarter.com a gitmek istersek
        driver.navigate().forward();


        Thread.sleep(3000);
        driver.quit();
    }
}
