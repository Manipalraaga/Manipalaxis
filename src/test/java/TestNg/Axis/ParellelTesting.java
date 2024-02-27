package TestNg.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelTesting {
	@Test
	public void invokechrome() {
		System.setProperty("webdriver.edge.driver",
	            "C:\\Users\\amaan\\Downloads\\edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

	}

}