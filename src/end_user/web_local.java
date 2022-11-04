package end_user;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class web_local {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\my driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/hi.html");
		String MyTittle=driver.getTitle();
		System.out.print(MyTittle);
		List <WebElement> myoption=driver.findElements(By.tagName("option"));
		Thread.sleep(3000);
		for(int i=0;i<myoption.size();i++) {
			System.out.print(myoption.get(i).getText());
		}
		
				
	}

}
