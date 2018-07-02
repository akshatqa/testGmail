import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Gmail {
	
	WebDriver driver;
	
	@BeforeClass (description="hit the URL")
	public void Hit_Url() {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
	}
	@Test (description="Login with valid email")
	public void Login_with_valid_email() {
			driver.findElement(By.id("identifierId")).sendKeys("akshatrai@qainfotech.com");
			driver.findElement(By.xpath("//div[@id='identifierNext']//content[@class='CwaK9']")).click();
					
		
}
	@Test (description="Login with valid password")
	public void Login_with_valid_password() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@name='password']")).sendKeys("57snake45");
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();		
}
}
