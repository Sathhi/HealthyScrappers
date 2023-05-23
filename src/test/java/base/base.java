package base;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base {
	WebDriver dr;
public WebDriver initializebrowser(String browsername) throws MalformedURLException
{
	
	DesiredCapabilities dc=new DesiredCapabilities();
	if(browsername.equals("chrome")) {
		dc.setBrowserName("chrome");
	}
		else if(browsername.equals("firefox")) {
		dc.setBrowserName("firefox");
	}
		else if(browsername.equals("MicrosoftEdge")) {
			dc.setBrowserName("MicrosoftEdge");
	
}
	dr=new RemoteWebDriver(new URL("http://localhost:4444"),dc);
	return dr;
}
}
