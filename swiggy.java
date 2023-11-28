package SHQ;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
public class swiggy {
	public static void main(String[] args) {
		System.out.println("hai");
		Scanner s=new Scanner(System.in);
		System.setProperty("webdriver.gecko.driver ","C:\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://www.swiggy.com/");
		WebElement loginbutt=driver.findElement(By.xpath("//*[@class='x4bK8']"));
		loginbutt.click();
		WebElement username=driver.findElement(By.id("mobile"));
		
		System.out.println(username);
	
		WebElement login = driver.findElement(By.xpath("//*[@class='a-ayg']"));

		
		System.out.println(login);
		username.sendKeys("8270477874");
		login.click();
		System.out.print("Enter the otp:");
		String otp=s.next();
		WebElement otp1=driver.findElement(By.id("otp"));
		otp1.sendKeys(otp);

		WebElement login1 = driver.findElement(By.xpath("//*[@class='a-ayg']"));
		login1.click();
	}
}
