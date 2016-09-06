package ford.selmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.*;
public class AlertTest {
	
	//WebDriver d= new FirefoxDriver();
	@Test
	public void alerttrial() throws InterruptedException
	{
/*	d.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	d.manage().window().maximize();
	Thread.sleep(5000);
	WebElement bt=d.findElement(By.xpath("//button[@onclick='myFunctionf()'])"));
	System.out.println(bt.getText());
	bt.click();
	Alert text=d.switchTo().alert();
	text.sendKeys("remya");
	text.accept();*/
		
		System.out.println("Alert Trail");
		trial a=new trial();
		a.print();
	}
	@Test
	public void alert() throws InterruptedException
	{
	
	System.out.println("Alert");

	}
}
