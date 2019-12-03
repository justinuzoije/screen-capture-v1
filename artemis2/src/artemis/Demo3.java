package artemis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


/*
public class Demo3 {
 
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
*/


public class Demo3 {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "//Users//justinuzoije//SeleniumFiles//ChromeVersion78//chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions"); 
        WebDriver driver =  new ChromeDriver(options);
        driver.get("https://jquery.com/");
        new WebDriverWait(driver, 20).until(ExpectedConditions.titleContains("jQuery"));
        Screenshot myScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        //ImageIO.write(myScreenshot.getImage(),"PNG",new File("./Screenshots/elementScreenshot.png"));
        ImageIO.write(myScreenshot.getImage(),"PNG",new File("//Users//justinuzoije//SeleniumFiles//Screenshots//screenshot.png"));
        driver.quit();
    }
}