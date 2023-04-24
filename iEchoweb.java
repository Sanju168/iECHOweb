import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iEchoweb {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ArpanM-Echo\\chromedriver_win32.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.iecho.org/");
		driver.close();
		
	}

}
