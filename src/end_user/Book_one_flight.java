package end_user;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_one_flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\my driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]/div[1]/table/tbody/tr[4]/td[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[4]/span")).click();

	}

}
