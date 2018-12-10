package FirstAutomation;



import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class OnlineStore {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "F://Selenium//chromedriver.exe");

		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		List radio=driver.findElements(By.name("exp"));
				int size=radio.size();
				
				
				System.out.println("size" + size);
				
								
				System.out.println("button selected");
		
		
		
		
		
	}
	
	
}