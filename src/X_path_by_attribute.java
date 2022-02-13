import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class X_path_by_attribute 
{

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\geckodriver.exe");


	RemoteWebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9527442942");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SURAJ@1001");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@value='1']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//i[@style='background-image: url(\"https://static.xx.fbcdn.net/rsrc.php/v3/yW/r/YBE_1_nu88W.png\"); background-position: 0px -48px; background-size: 26px 158px; width: 20px; height: 20px; background-repeat: no-repeat; display: inline-block;']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//i[class='hu5pjgll lzf7d6o1']")).click();



}	
}
