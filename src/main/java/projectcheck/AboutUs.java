package projectcheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class AboutUs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1074287\\eclipse-workspace\\projectcheck\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.eazydiner.com/");
		driver.manage().window().maximize();
		WebElement a= driver.findElement(By.xpath("//*[text()='About Us']"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[text()='About Us']")).click();
		
		System.out.println("Page title is: '"+driver.getTitle()+" '");
		driver.close();
	}

}
