package Login.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/shwetakusumkar/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.intouchapp.com/");
		driver.findElement(By.xpath("//a[@class='login-cta']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rasikaita");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Login with password']")).sendKeys("testqwe");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-lg' and @type='submit']")).click();
		System.out.print("login success");
		Thread.sleep(1000);
		
		
	

	}

}


