package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImagesDemo
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		String path,Title,url;
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 //System.out.println(path);
			 System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();	
			 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			 ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.tagName("href"));
			 System.out.println(al.size());
			 for(int i=0;i<al.size();i++)
			 {
				System.out.println(al.get(i).getAttribute(" "));
				 //System.out.println(al.get(i).getText());
			 }
	}
}
