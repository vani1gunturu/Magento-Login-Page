import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomatingMagentoLoginPage {
	public static void main(String[] args) {
		//setting the path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/vani/selenium components/chromedriver_linux64/chromedriver");
		//launch the chrome browser
        ChromeDriver driver=new ChromeDriver();
		//maximize the chrome
        driver.manage().window().maximize();
		//applying implicit wait to load the elements in the web page
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//enter the url
        driver.get("https://www.magento.com");
        //click on My Account
        driver.findElement(By.linkText("My Account")).click();
        //enter the mail id in the Email field
        driver.findElement(By.id("email")).sendKeys("xxxxxx@yahoo.com");
        //entering the password in to password field
        driver.findElement(By.id("pass")).sendKeys("xxxxxx");
        //click on login
        driver.findElement(By.id("send2")).click();
        //click on logout
        driver.findElement(By.linkText("Log Out")).click();
	}
}
