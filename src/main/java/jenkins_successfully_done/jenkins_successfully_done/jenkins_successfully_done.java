package jenkins_successfully_done.jenkins_successfully_done;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class jenkins_successfully_done {
	public void login()
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay AM\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   
		  System.out.println( driver.findElement(By.xpath("//span[contains(text(),'( Username : Admin | Password : admin123 )')]")).getText());
	   }
}
