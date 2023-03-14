package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass001 {
	
	@Test
	public void mamm() throws InterruptedException {
			
			System.out.println("ok");
			
//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Velocity\\Selenium\\drivers\\chromedriver.exe");


System.setProperty("webdriver.chrome.driver","src\\main\\resources\\browser\\chromedriver.exe");



	//System.setProperty("webdriver.chrome.driver","src/test/resourses\\browser\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();


	driver.manage().window().maximize();
	Thread.sleep(2000);


	System.out.println("Print===Browser Open And Maximize");
	Reporter.log("Log===Browser Open And Maximize");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.amazon.in/");

	Thread.sleep(3000);

	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobile");


	WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
	searchButton.click();


	System.out.println("Print===Mobile     Search   Done   and    Open");
	Reporter.log("Log===Mobile   Search    Done    and    Browser    Close");

	Thread.sleep(3000);
	driver.quit();

			}}


