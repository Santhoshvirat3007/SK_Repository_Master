package minion;

import org.openqa.selenium.chrome.ChromeDriver;


public class Chromelaunch 
{

	public static void main(String[] args) 
	{
			String key = "webdriver.chrome.driver";
			
			String value = "./Softwares/chromedriver.exe";
			
			System.setProperty(key, value);
			
			new ChromeDriver();
			}
}
