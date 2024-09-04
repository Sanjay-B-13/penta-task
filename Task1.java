package penta;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Login with correct credential
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.TAB,Keys.ENTER);
		//Login with incorrect credential
		//driver.findElement(By.id("user-name")).sendKeys("standd_user",Keys.TAB,"set_sauce",Keys.TAB,Keys.ENTER);
		
		//Product Screen
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		
		//Add to cart
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
		
		//Click on Continue Shopping
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		
		///2
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		driver.findElement(By.xpath("//a[text()='All Items']")).click();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		
		//remove the product from the cart
		driver.findElement(By.xpath("(//button[@class='btn_secondary cart_button'])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		driver.findElement(By.xpath("//a[text()='All Items']")).click();
		
		// click 5 products
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		
		WebElement five = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[4]"));
		Actions act=new Actions(driver);
		act.scrollToElement(five);
		act.perform();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		
		//Add 2 product to cart
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
		
		WebElement co = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
		Actions scrl=new Actions(driver);
		scrl.scrollToElement(co);
		scrl.perform();
		
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		
		//
		driver.findElement(By.id("\"first-name\"")).sendKeys("Sanjay",Keys.TAB,"Baskaran",Keys.TAB,"638101");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		
		
		WebElement cancel = driver.findElement(By.xpath("//footer[@class='footer']"));
		Actions scr=new Actions(driver);
		scr.scrollToElement(cancel);
		scr.perform();
		
		driver.findElement(By.xpath("//a[text()='CANCEL']")).click();
		
		driver.findElement(By.xpath("(//button[text()='REMOVE'])[1]")).click();
		
		
		
		//final checkout
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		
		driver.findElement(By.id("\"first-name\"")).sendKeys("Sanjay",Keys.TAB,"Baskaran",Keys.TAB,"638101");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		
		WebElement confirm = driver.findElement(By.xpath("//footer[@class='footer']"));
		Actions scr1=new Actions(driver);
		scr1.scrollToElement(confirm);
		scr1.perform();
		
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
