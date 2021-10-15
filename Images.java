package week2.day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		driver.navigate().back();
		String url = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"))
				.getAttribute("src");
		// getAttribute() to get src of image
		HttpURLConnection huc = null;
		int respCode = 200;
		huc = (HttpURLConnection) (new URL(url).openConnection());
		huc.setRequestMethod("HEAD");

		huc.connect();

		respCode = huc.getResponseCode();

		if (respCode >= 400) {
			System.out.println(url + " is a broken link");

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img")).click();

		}
}
