package SS1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
public class linkedin {
	public static void main(String[] args) {
		System.out.println("hai");
		System.setProperty("webdriver.gecko.driver ","C:\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://in.linkedin.com");
		WebElement username=driver.findElement(By.id("session_key"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("session_password"));
		System.out.println(password);
		WebElement login = driver.findElement(By.xpath("//*[@data-id='sign-in-form__submit-btn']"));

		
		System.out.println(login);
		username.sendKeys("yukeshvip2003@gmail.com");
		password.sendKeys("123456789");
		login.click();

	}
}