package group_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


import java.time.Duration;

public class Practice_10 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
      // adresine gidin

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
      // 2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement bayArea= driver.findElement(By.id("pid8_thumb"));
        WebElement berlin1= driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toLeftOf(bayArea));

      // 3 ) Relative locator’larin dogru calistigini test edin
        String expected="pid7_thumb";
        String actual=berlin1.getAttribute("Id");

        if (expected.equals(actual)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
