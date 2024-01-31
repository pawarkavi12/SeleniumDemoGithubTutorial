import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeneralMethod {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//TakesScreenshot is an interface for taking the screenshot.
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\HP\\Downloads\\ss.jpg"));

	}

}
