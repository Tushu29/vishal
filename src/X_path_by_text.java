import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_by_text 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
