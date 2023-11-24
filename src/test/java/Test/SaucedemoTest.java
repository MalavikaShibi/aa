package Test;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.SaucedemoPage;

public class SaucedemoTest  {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test1() throws IOException
	{
		SaucedemoPage obj=new SaucedemoPage(driver);
		obj.logindatadriven();
		obj.loginbtn();
		obj.addcart();
		obj.clickcheckout();
		obj.fiilcontinue("malavika", "shibi", "6104");
		obj.backlogut();
	}
}
