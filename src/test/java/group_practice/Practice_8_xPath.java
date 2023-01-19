package group_practice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice_8_xPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\90532\\Documents\\selenium dependencies\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
       // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
       // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[text()='Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Button gorunurluk testi PASSED");
        }else{
            System.out.println("Button gorunurluk testi FAILED");
        }

       // 4- Delete tusuna basin
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
       // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
       WebElement add= driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if (add.isDisplayed()){
            System.out.println("Add gorunurluk testi PASSED");
        }else{
            System.out.println("Add gorunurluk testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();


    }
}
