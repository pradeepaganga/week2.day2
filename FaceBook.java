package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Nithu12");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("keshu");
		// Step 9: Enter the mil id
		driver.findElement(By.name("reg_email__")).sendKeys("nithu12keshu@gmail.com");
		// Step 10: Enterthe password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Keshav_27");
		// Step 11: Handle all the three drop downs
		driver.findElement(By.name("birthday_day")).sendKeys("10");
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		/*Step 12: Select the radio button "Female" 
        ( A normal click will do for this step)*/
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
