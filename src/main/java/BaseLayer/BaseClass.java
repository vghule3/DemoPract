package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static void initaliation() throws IOException
	{
	    prop=new Properties();
		File f=new File("C:\\Users\\vishal ghule\\eclipse-workspace\\oragngeHrmCucumber\\src\\main\\java\\ConfigLayer\\hrm.proprities");
		FileInputStream fis= new FileInputStream(f);
		
		prop.load(fis);
		String browsers = prop.getProperty("browser");
		
		if(browsers.equalsIgnoreCase("chrome"))
		   {
			WebDriverManager.chromedriver().setup();
		      driver=new ChromeDriver();
		    }
		else if(browsers.equalsIgnoreCase("opera"))
			{
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
				
			}
		else if(browsers.equalsIgnoreCase("edge"))
        {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("check bowser name");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		//driver.get(prop.getProperty("browser"));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://www.facebook.com/reg");
	}
	
	
}
