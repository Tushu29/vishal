import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchChrome{

public static void main(String [] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\SRJ SOFTWARE TESTING\\selenium wiyh web driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//driver.get("https://www.instagram.com/");
driver.manage().window().maximize();

Thread.sleep(5000);
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7350683592");
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234635");
//driver.findElement(By.xpath("        //button[@class='sqdOP  L3NKy   y3zKF     ']")).click();

driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("9527442942");
driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("SURAJ@1001");
driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
Actions r = new Actions(driver);
Thread.sleep(2000);
WebElement r1 =driver.findElement(By.xpath("(//div[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv bp9cbjyn rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv pq6dq46d taijpn5t l9j0dhe7 tdjehn4e tv7at329 thwo4zme'])[5]"));
r.moveToElement(r1).click().build().perform();

//WebElement r1 =driver.findElement(By.xpath("(//div[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv bp9cbjyn rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv pq6dq46d taijpn5t l9j0dhe7 tdjehn4e tv7at329 thwo4zme'])[5]"));





}









}