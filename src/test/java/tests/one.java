// java -jar selenium-server-4.7.2.jar standalone 
//use the statement start standalone

package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import base.base;


public class one extends base {
	public WebDriver dr;

@Test	
public void testone()
{
	dr.get("http://the-internet.herokuapp.com/");
	System.out.println(dr.getTitle()+"from chrome");
}
@BeforeMethod
public void setup() throws MalformedURLException, Exception
{
	dr=initializebrowser("chrome");
Thread.sleep(3000);
}
@AfterMethod
public void teardown()
{
	dr.quit();
}
}
