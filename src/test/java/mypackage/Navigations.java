package mypackage;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.get("https://www.amazon.in/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();

	}

}
