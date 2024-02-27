package TestNg.Axis;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;


	public class parameterised {
		
		@Test
		@Parameters("browser")
		public void parameterised(String browser) 
		{
			if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					 "C:\\Users\\amaan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			  driver.get("https://www.selenium.dev/");

		
		}
			else
			{
		
			 System.setProperty("webdriver.Gecko.driver",
					" C:\\Users\\amaan\\Download\\MANIPAL\\geckodriver-v0.34.0-win64\\geckodriver.exe");
							
								WebDriver driver=new FirefoxDriver();
								 driver.get("https://www.selenium.dev/");
			
		}


		}
	}

