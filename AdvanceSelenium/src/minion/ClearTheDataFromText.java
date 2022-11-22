package minion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTheDataFromText
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Santhoshkumar/Desktop/Clearthevaluebytagname.html");
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).clear();
		driver.quit();

	}

}
