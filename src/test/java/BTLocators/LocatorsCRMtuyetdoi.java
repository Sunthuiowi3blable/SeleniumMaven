package BTLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRMtuyetdoi {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

        //Bắt xpath của trang Login
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();

        //Bắt xpath menu Customer
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/a[1]")).click();
        Thread.sleep(1000);

        //Bắt xpath hết from New Customer
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Sunthuiowi3blable");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[3]/input")).sendKeys("10%");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[4]/input")).sendKeys("0123456789");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[5]/input")).sendKeys("https://www.instagram.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/button/div/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/div/div[3]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[1]/div/div/button/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[1]/div/div/div/div[2]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/button/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/div/div/ul/li[22]/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[8]/textarea")).sendKeys("Hà Nội");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[9]/input")).sendKeys("Hà Nội");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
