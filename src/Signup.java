

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Signup {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kamala.d\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	WebDriver driver;

	@Test(priority = 1)
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
	}
	@Test(priority = 2)
	public void clickOnSignUp() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
	}
//	public boolean isTestPassed() {
//		return login.isDisplayed();
//		}
	
//	public void isUserTestPassed(String username) {
//		if(username.length() <3 || username.length() >20) {
//			try {
//				Assert.assertEquals("https://mobileworld.banyanpro.com/t",driver.getCurrentUrl());
//			}
//			catch(NoSuchElementException ex) {}
//			}else 
//				Assert.assertEquals("https://mobileworld.banyanpro.com/t",driver.getCurrentUrl());
//		}

	@Test(priority = 3)
	public void enterFirstName() throws InterruptedException {
		driver.findElement(By.id("myName")).sendKeys("Kamala");
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void enterLastName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doddaiah");
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void enterMail() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("kamaladoddaiah@gmail.com");
		Thread.sleep(2000);
		}
	@Test(priority = 6)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kd19");
		Thread.sleep(2000); 
	}
	@Test(priority = 7)
	public void enterDOB() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09/19/2000");
		Thread.sleep(2000);
	}
	@Test(priority = 8)
	public void selectGender() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 9)
	public void enterPhoneNumber() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9620717598");
		Thread.sleep(2000);
		}
	@Test(priority = 10)
	public void clickOnRegister() throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Please Confirm Order");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	@Test(priority = 11)
	public void clickOnSignIn() throws InterruptedException {
		driver.findElement(By.xpath("//b"+ "utton[text()='Sign In']")).click();
		//driver.switchTo().alert().accept();
		driver.quit();
	}
	
}