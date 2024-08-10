package BTLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRMtuongdoi {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
//        Thread.sleep(1000);

        //Bắt xpath phần Login
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Bắt xpath phần Customer
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
//        Thread.sleep(1000);

        //Bắt xpath Form của trang Customer Details
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Sunthuiowi3blable");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("10%");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys("0123456789");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("https://www.instagram.com/sunthuiowi3blable/");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@title='Nothing selected'])[1]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-1-1']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='default_currency']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='default_language']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-3-21']")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Xuân Đỉnh");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hà Nội");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Hà Nội");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-4-243']")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();

        //Bắt xpath Form của trang Customer Billing & Shipping
//        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Billing & Shipping']")).click();

        //Bắt xpath Billing&Shipping
        driver.findElement(By.xpath("//textarea[@id='billing_street']")).sendKeys("Xuân La");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Hà Nội");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='billing_state']")).sendKeys("Hà Nội");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='billing_zip']")).sendKeys("abc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='billing_country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-5-243']")).click();

        driver.findElement(By.xpath("//textarea[@id='shipping_street']")).sendKeys("Thái Hòa");
        driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys("Nghệ An");
        driver.findElement(By.xpath("//input[@id='shipping_state']")).sendKeys("Nghệ An");
        driver.findElement(By.xpath("//input[@id='shipping_zip']")).sendKeys("abcdf");
        driver.findElement(By.xpath("//button[@data-id='shipping_country']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-6-243']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
        Thread.sleep(5000);

        //Bắt xpath menu Project
        driver.findElement(By.xpath("//ul[@id='side-menu']/descendant::a[14]")).click();
//        Thread.sleep(1000);

        //Bắt xpath hết Form của trang New Project
        driver.findElement(By.xpath("//div[@id='wrapper']/descendant::i[1]")).click();
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='name']/following-sibling::input")).sendKeys("LocatorsCRMtuongdoi");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='clientid']/following-sibling::button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='bs-select-6']/preceding-sibling::div/child::input")).sendKeys("Sunthuiowi3blable");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='bs-select-6-1']/child::span[2]")).click();
        driver.findElement(By.xpath("//input[@id='progress_from_tasks']/following-sibling::label")).click();
        driver.findElement(By.xpath("//select[@id='billing_type']/following-sibling::button")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-1-1']/child::span[2]")).click();
        driver.findElement(By.xpath("//select[@id='status']/following-sibling::button")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-2-4']/child::span[normalize-space()='Finished']")).click();
        driver.findElement(By.xpath("//div[@id='project_cost']/descendant::input")).sendKeys("10");
        driver.findElement(By.xpath("//label[normalize-space()='Estimated Hours']/following-sibling::input")).sendKeys("18");
        driver.findElement(By.xpath("//select[@id='project_members[]']/following-sibling::button")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Deselect All']/preceding-sibling::button[1]")).click();
        driver.findElement(By.xpath("//label[@for='start_date']/following::input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@data-date='22']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='deadline']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[18]/div[1]/div[1]/div[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[18]/div[1]/div[2]/table/tbody/tr[5]/td[6]")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[18]/div[1]/div[1]/div[2]/div/div[1]/div[77]")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='tags']/following::li[1]/child::input")).sendKeys("abcd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='send_created_email']/following-sibling::label")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Project Settings']")).click();
        driver.findElement(By.xpath("//button[@data-id='contact_notification']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-4-2']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Save']"));

        Thread.sleep(1000);
        driver.quit();

    }

    }
