import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_of_flipkart
{
public static void main(String[] args) throws InterruptedException   {
	
	
System.setProperty("webdriver.chrome.driver", "D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\chromedriver.exe");

ChromeDriver driver=new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9527442942");
    driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("surajshaikh123");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	
	
	
//	Thread.sleep(5000);
//	driver.close();
	
	
	
	
	
	
}
	
	
	
	
}
