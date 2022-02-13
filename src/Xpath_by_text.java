import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
     driver.get("https://www.instagram.com/");
	     
     Thread.sleep(4000);
     driver.close();
	
	
	
}
}
