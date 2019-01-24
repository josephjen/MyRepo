package gitTest01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\joe\\Selenium\\driver\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.get("https://www.lifetime.life/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//ul[@id='primaryNav']/li[3]/a")).click();
		List <WebElement> links =  wd.findElements(By.xpath("//ul[@id='primaryNav']/li[3]//div[2]/ul/li"));
		//WebElement w = wd.findElement(By.xpath("//ul[@id='primaryNav']/li[3]//div[2]//li"));
		for (int i = 1; i < links.size(); i++) {
			System.out.println("Element.-"+i + "= " +links.get(i).getText());
			
	}
	}

}
