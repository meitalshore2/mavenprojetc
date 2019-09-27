import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\meita\\Downloads\\chromedriver_new\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  String baseUrl = "https://www.google.com";
	  driver.get(baseUrl);
	  System.out.println("test1");
	  driver.quit()	;	  
  }
}
