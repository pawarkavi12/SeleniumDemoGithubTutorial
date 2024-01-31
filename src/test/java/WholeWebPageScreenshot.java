import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class WholeWebPageScreenshot {

	public static void main(String[] args) throws IOException {
		
    WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		
		driver= new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	 	ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\HP\\Downloads\\amazonfullpagess.png"));

	}

}
