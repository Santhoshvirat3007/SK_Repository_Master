package minion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClicktheElementbyNAMe 
		{

	public static void main(String[] args) throws InterruptedException 
			{
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Santhoshkumar/Desktop/ClicktheelementByname.html");
			Thread.sleep(2000);
			driver.findElement(By.name("n1")).click();
			Thread.sleep(2000);
			driver.quit();

			}

		}


