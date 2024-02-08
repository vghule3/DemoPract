package UtilasLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseLayer.BaseClass;

public class extendsreport extends BaseClass {
	
	 public static ExtentReports extent;
	
	public static ExtentReports  extentreportSetup()
	{
	ExtentSparkReporter sparkreporter=new ExtentSparkReporter("C:\\Users\\vishal ghule\\eclipse-workspace\\oragngeHrmCucumber\\extentreport\\"+getdate()+"vi.html"); 

	ExtentReports extent=new ExtentReports();
	   extent.attachReporter(sparkreporter);
	   sparkreporter.config().setDocumentTitle("bdd report");
	   sparkreporter.config().setTheme(Theme.DARK);
	return extent;
	}
	
	public static String getdate()
	{
		String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		return date;
	}
	public static String passScreenshot(String scrrenshotname) throws Throwable
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String destiPath=System.getProperty("user.dir")+"\\PassScrenshot\\"+scrrenshotname+getdate()+".png";
		
	    FileUtils.copyFile(f, new File(destiPath));
		return destiPath;
	}
	
	public static String failscrrenshot(String screenshotname) throws Throwable
	{
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destipath=System.getProperty("user.dir")+"\\failScreenShot\\"+screenshotname+getdate()+".png";
		
		FileUtils.copyFile(f, new File(destipath));
		return destipath;
	}
}
