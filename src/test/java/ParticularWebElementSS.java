import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class ParticularWebElementSS {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver;
			
			driver= new ChromeDriver();
			
			driver.get("https://www.cricbuzz.com/");
			WebElement element = driver.findElement(By.xpath("//img[@alt='Cricbuzz Logo']"));
			Screenshot imagess = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,element);
          
			ImageIO.write(imagess.getImage(), "PNG", new File("C:\\Users\\HP\\Downloads\\ParticularPageSS.png"));

						
	}

}
