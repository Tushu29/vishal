import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_attribute 

{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=whatsapp+web&oq=&aqs=chrome.0.35i39i362l8.181411433j0j15&sourceid=chrome&ie=UTF-8");
		
		driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
		
	}
	
	
	
	
	
}
