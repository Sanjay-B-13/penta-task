package penta;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.TAB,Keys.ENTER);
		//driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		WebElement namedropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select sel=new Select(namedropdown);
		sel.selectByIndex(2);
		
		//sel.selectByIndex(0);
		//sel.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
