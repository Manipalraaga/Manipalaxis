package TestNg.Axis;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	//import org.testng.asserts.HardAssert;

	//import dev.failsafe.internal.util.Assert;

	public class HardAsset {
		@Test
		
		public void testhardassert() throws InterruptedException{
					
			System.setProperty("Webdriver.chrome.driver",
			"C:\\Users\\amaan\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(500);
					
			driver.manage().window().maximize();
					
			String actualTitle = driver.getTitle();
			String expectedTitle = "Orange";
					
			Assert.assertEquals(actualTitle, expectedTitle);
					
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
					
			driver.close();
					
					
					
		}
		
		
		

	}
	

}
