import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class X_path_by_contains_attribute 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\chromedriver.exe");

	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://meet.google.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//p[contains(@class,'spacer-3-top')]")).click();
	

	}
}