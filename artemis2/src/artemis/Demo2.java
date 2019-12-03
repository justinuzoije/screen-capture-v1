package artemis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
 
 public static void main(String[] args) throws IOException {

//System.setProperty("webdriver.chrome.driver" , "C:\\drivers\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "//Users//justinuzoije//SeleniumFiles//ChromeVersion78//chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.lambdatest.com/");
 
File source_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source_file, new File("//Users//justinuzoije//SeleniumFiles//Screenshots//screenshot.png"));
 
 driver.quit();
 }
}