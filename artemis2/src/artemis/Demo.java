package artemis;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;




public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//justinuzoije//SeleniumFiles//ChromeVersion78//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		// This goes to Facebook and types in an email address
		driver.get("http://facebook.com"); //URL in the browser
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		
		

	}

}

//System.setProperty("/Users/justinuzoije/SeleniumFiles/ChromeVersion78/chromedriver.exe");
