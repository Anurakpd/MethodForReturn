import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestQkart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://crio-qkart-frontend-qa.vercel.app/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("anurapanchal");

        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("testadmin");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Login to QKart\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Jenga");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[2]//*[name()='svg']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Add new address\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.tagName("textarea")).sendKeys("Huron street, Guelph, Canada");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='address']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"PLACE ORDER\"]")).click();

    }
}
