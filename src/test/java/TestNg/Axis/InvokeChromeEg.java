package TestNg.Axis;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class InvokeChromeEg {
	  @Test
	  public void invokechrome() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\amaan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/");
	  }
	}