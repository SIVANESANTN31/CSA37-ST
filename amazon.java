package MM1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
public class amazon {
	public static void main(String[] args) {
		System.out.println("hai");
		System.setProperty("webdriver.gecko.driver ","C:\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement username=driver.findElement(By.id("ap_email"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("ap_password"));
		System.out.println(password);
		WebElement login=driver.findElement(By.id("signInSubmit"));
		
		System.out.println(login);
		username.sendKeys("yukeshvip2003@gmail.com");
		password.sendKeys("123456789");
		login.click();

	}
}