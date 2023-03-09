package MarathonSeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Koyambedu, Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='10']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		String busesfound = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(busesfound);
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following::label[1]")).click();
		String busname = driver.findElement(By.xpath("(//div[text()='KMRL Kalaimakal'])[1]")).getText();
		System.out.println(busname);
		
		
		
		
		
		
		
		
		
	}

}
